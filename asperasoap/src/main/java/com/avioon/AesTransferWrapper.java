package com.avioon;


import aspera.central._2012._10.transfer201210.*;
import aspera.xml.faspsessionnet._2009._11.types.FileTransferFilter;
import aspera.xml.faspsessionnet._2009._11.types.GetInfoRequest;
import aspera.xml.faspsessionnet._2009._11.types.GetInfoResponse;
import aspera.xml.iscptransfernet._2006._04.types.*;
import aspera.xml.jobnet._2006._01.types.SubmitRequest;
import aspera.xml.jobnet._2006._01.types.SubmitResponse;

import org.w3c.dom.Document;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;

public class AesTransferWrapper extends TransferHandler implements FsAction {
//test2
    private static final long WAIT = 5000;
    private static final String TRANSFER_URL = "/304849/I-Transcoding_01/";
    private static final int FILES_NUMBER = 0;
    private static final String TRANSFER_NAMESPACE = "http://10.10.0.62:40001/services/soap/Transfer-201210";

    private String transferJobId ;
    private String requestType;
    private String operationType;
    private String address;
    private String cookie;
    private int remotePort;
    private String remoteUserName;
    private String authenticationMethod;
    private String keyPath;
    private String localFilePath;


    private SubmitRequest submitRequest = new SubmitRequest();
    private FASPSoap faspSoap = null;

    //remove when get the xml function
    private int abortLoops = 0;
    //remove when get the xml function

    public AesTransferWrapper(String requestType, String operationType, String address, String cookie, int remotePort,
                              String remoteUserName, String authenticationMethod, String keyPath, String localFilePath) {
        this.requestType = requestType;
        this.operationType = operationType;
        this.address = address;
        this.cookie = cookie;
        this.remotePort = remotePort;
        this.remoteUserName = remoteUserName;
        this.authenticationMethod = authenticationMethod;
        this.keyPath = keyPath;
        this.localFilePath = localFilePath;
    }


    public void doAction() throws IOException {

        try {
            createService();
            submitTransferRequest();

            AesTransferStatus status = AesTransferStatus.valueOf(requestStatus());

            while ((status == AesTransferStatus.running || status == AesTransferStatus.waiting || status ==
                    AesTransferStatus.paused)) {
                //remove the comment to test the abort
                //abortLoops();
                //remove the comment to test the abort
                if (isAbort()) {
                    abortTransfer();
                    break;
                }
                waitOneCyle();
                status = AesTransferStatus.valueOf(requestStatus());
//                int progress = getProgress();
            }

            if (status == AesTransferStatus.completed) {
                success(100);
            } else if (status == AesTransferStatus.cancelled || isAbort()) {
                abortTransfer();
            } else if (status == AesTransferStatus.failed) {
                throw new IOException(String.format("Failed to transfer file %s with AES. Error: '%s' " +
                                "(Error code: '%s')",
                        localFilePath));
            } else {
                throw new IOException(String.format("Failed to transfer file %s with AES. Status is %s.",
                        localFilePath, status));
            }
        } catch (Exception e) {
            throw new IOException(String.format("Failed to authenticate user at AES. Error %s.", e.getMessage()));
        }
    }


    private void createSubmitRequest() throws IOException {

        AesOrderType aesOrderType = new AesOrderType();
        ApplicationDataType applicationDataType = new ApplicationDataType();
        applicationDataType.setCookie(cookie);

        SystemType systemType = new SystemType();
        systemType.setAddress(address);
        systemType.setPort(remotePort);
        systemType.setUserName(remoteUserName);

        ArrayOfMethods arrayOfMethods = new ArrayOfMethods();
        arrayOfMethods.getMethod().add(authenticationMethod);

        AuthenticationType authenticationType = new AuthenticationType();
        authenticationType.setKeyPath(keyPath);
        authenticationType.setMethods(arrayOfMethods);

        ArrayOfPaths arrayOfPathsRemote = new ArrayOfPaths();
        arrayOfPathsRemote.getPath().add(TRANSFER_URL);

        RemoteLocationType remoteLocationType = new RemoteLocationType();
        remoteLocationType.setSystem(systemType);
        remoteLocationType.setAuthentication(authenticationType);
        remoteLocationType.setFiles(arrayOfPathsRemote);

        ArrayOfPaths arrayOfPathsLocal = new ArrayOfPaths();
        arrayOfPathsLocal.getPath().add(localFilePath);

        LocalLocationType localLocationType = new LocalLocationType();
        localLocationType.setFiles(arrayOfPathsLocal);

        aesOrderType.setOperation(operationType);
        aesOrderType.setApplicationData(applicationDataType);
        aesOrderType.setRemoteLocation(remoteLocationType);
        aesOrderType.setLocalLocation(localLocationType);
        submitRequest.setDefinition(serialize(aesOrderType));

    }

    private void waitOneCyle() {
        try {
            Thread.sleep(WAIT);
        } catch (InterruptedException e) {
        }
    }

    private void createService() {
        Transfer201210 transfer201210 = new Transfer201210();
        faspSoap = transfer201210.getTransfer201210Port();
        BindingProvider bindingProvider = (BindingProvider) faspSoap;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                TRANSFER_NAMESPACE);
    }

    private void submitTransferRequest() throws FilterChangedErrorFault, JobFormatInvalidFault,
            JobSubmissionErrorFault, JobTypeNotFoundFault, IOException {
        createSubmitRequest();
        submitRequest.setType(requestType);
        SubmitResponse response = faspSoap.submit(submitRequest);
        transferJobId = response.getJobResult().getID();
    }

    private String requestStatus() throws FilterChangedErrorFault {
        GetInfoRequest getInfoRequest = new GetInfoRequest();
        FileTransferFilter fileTransferFilter = new FileTransferFilter();
        fileTransferFilter.getJobId().add(transferJobId);
        getInfoRequest.setFileTransferFilter(fileTransferFilter);
        GetInfoResponse getInfoResponse = faspSoap.getInfo(getInfoRequest);
        return getInfoResponse.getInfoResult().getSessionInfo().get(FILES_NUMBER).getStatus();
    }

    private void abortTransfer() throws JobNotFoundFault {
        CancelRequest cancelRequest = new CancelRequest();
        cancelRequest.setJobID(transferJobId);
        faspSoap.cancelJob(cancelRequest);
    }


    //remove later - used for testing-----------------------------------------------
    public boolean isAbort() {
        if (abortLoops == 10) {
            return true;
        } else {
            return false;
        }
    }

    protected void abortLoops() {
        abortLoops++;
    }

    public int getProgress() {
//        return (int) (getInfoResponse.getInfoResult().getSessionInfo().get(FILES_NUMBER).getBytesTransferred().floatValue() );
        return 0;
    }

    private String serialize(Serializable serializableDocument) throws IOException {
        StringWriter sw = new StringWriter();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(AesOrderType.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            jaxbMarshaller.marshal(serializableDocument, sw);

        } catch (JAXBException ex) {
            System.err.println(ex.getMessage());
        }
        return sw.toString();
    }
}