package com.avioon;



import aspera.central._2012._10.transfer201210.*;
import aspera.xml.faspsessionnet._2009._11.types.FileTransferFilter;
import aspera.xml.faspsessionnet._2009._11.types.GetInfoRequest;
import aspera.xml.faspsessionnet._2009._11.types.GetInfoResponse;
import aspera.xml.iscptransfernet._2006._04.types.*;
import aspera.xml.jobnet._2006._01.types.SubmitRequest;
import aspera.xml.jobnet._2006._01.types.SubmitResponse;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import java.io.IOException;
import java.io.StringWriter;
import java.net.MalformedURLException;

public class AesTransferWrapper {

    private static final long WAIT = 5000;
    private static final String TRANSFER_URL = "/304849/I-Transcoding_01/";
////// temporary attributes
    String requestType;
    String operationType;
    String address;
    String cookie;
    int    remotePort;
    String remoteUserName;
    String authenticationMethod;
    String keyPath;
    String localUserName;
    String localPassword;
    String localFilePath;


    private SubmitRequest submitRequest = new SubmitRequest();
    private ApplicationDataType applicationDataType = new ApplicationDataType();
    private SystemType systemType = new SystemType();
    private ArrayOfMethods arrayOfMethods = new ArrayOfMethods();
    private AuthenticationType authenticationType = new AuthenticationType();
    private ArrayOfPaths arrayOfPaths = new ArrayOfPaths();
    private RemoteLocationType remoteLocationType =  new RemoteLocationType();
    private LocalLocationType localLocationType = new LocalLocationType();
    private AesOrderType aesOrderType = new AesOrderType();
    SubmitResponse submitResponse = new SubmitResponse();
    GetInfoRequest getInfoRequest = new GetInfoRequest();
    GetInfoResponse getInfoResponse = new GetInfoResponse();
    FASPSoap faspSoap = null;
///////

    public AesTransferWrapper(String requestType, String operationType, String address, String cookie, int remotePort,
                              String remoteUserName, String authenticationMethod, String keyPath,
                              String localUserName, String localPassword,  String localFilePath){
        this.requestType = requestType;
        this.operationType = operationType;
        this.address = address;
        this.cookie = cookie;
        this.remotePort = remotePort;
        this.remoteUserName = remoteUserName;
        this.authenticationMethod = authenticationMethod;
        this.keyPath  =  keyPath;
        this.localUserName = localUserName;
        this.localPassword = localPassword;
        this.localFilePath = localFilePath;
    }


    public void doAction() throws MalformedURLException, FilterChangedErrorFault, JobFormatInvalidFault,
            JobSubmissionErrorFault, JobTypeNotFoundFault, IOException {
        secondVersion();

        try {
//            AesTransfer aesTransfer = submit();
            waitOneCyle();
//            AesTransferItem aesTransferItem = getTransferItem(aesTransfer.getId());
            int progress = 0;

            AesTransferStatus status = AesTransferStatus.valueOf(requestStatus ());
            requestStatus ();
            while ((status == AesTransferStatus.running || status == AesTransferStatus.waiting || status ==
                    AesTransferStatus.paused)) {
                if (isAbort()) {
//                    abortTransfer(aesTransfer.getId());
                    break;
                }
                waitOneCyle();
                status = AesTransferStatus.valueOf(requestStatus ());
//              progress = aesTransferItem.getProgress();
//                updateStatus(progress);
//            }
//
//            if (status == AesTransferStatus.completed) {
//                success(100);
//            } else if (status == AesTransferStatus.cancelled || isAbort()) {
//                abort(progress);
//            } else if (status == AesTransferStatus.failed) {
//                throw new IOException(String.format("Failed to transfer file %s with AES. Error: '%s' " +
//                                "(Error code: '%s')",
//                        sourceFile, aesTransferItem.getError_desc(), aesTransferItem.getError_code()));
//            } else {
//                throw new IOException(String.format("Failed to transfer file %s with AES. Status is %s.",
//                        sourceFile, status));
            }
        } catch (Exception e) {
            throw new IOException(String.format("Failed to authenticate user at AES. Error %s.", e.getMessage()));
        }
    }



    private void createSubmitRequest()throws IOException{

        applicationDataType.setCookie(cookie);
        systemType.setAddress(address);
        systemType.setPort(remotePort);
        systemType.setUserName(remoteUserName);
        arrayOfMethods.getMethod().add(authenticationMethod);
        authenticationType.setKeyPath(keyPath);
        authenticationType.setMethods(arrayOfMethods);

        ArrayOfPaths arrayOfPathsRemote = new ArrayOfPaths();
        arrayOfPathsRemote.getPath().add(TRANSFER_URL);

        remoteLocationType.setSystem(systemType);
        remoteLocationType.setAuthentication(authenticationType);
        remoteLocationType.setFiles(arrayOfPathsRemote);

        ArrayOfPaths arrayOfPathsLocal = new ArrayOfPaths();
        arrayOfPathsLocal.getPath().add(localFilePath);
        localLocationType.setFiles(arrayOfPathsLocal);

        aesOrderType.setOperation(operationType);
        aesOrderType.setApplicationData(applicationDataType);
        aesOrderType.setRemoteLocation(remoteLocationType);
        aesOrderType.setLocalLocation(localLocationType);
        submitRequest.setDefinition(objectToString());

    }

    private void waitOneCyle() {
        try {
            Thread.sleep(WAIT);
        } catch (InterruptedException e) {
        }
    }

    public boolean isAbort() {
        return false;
    }


///////temporary method
    public int getProgress() {
//            return (int) (((float) getInfoResponse.getInfoResult().getSessionInfo().get(0).getBytesTransferred() / files[0].getSize()) * 100);
        return 0;
    }
    private void secondVersion() throws FilterChangedErrorFault, JobFormatInvalidFault,
            JobSubmissionErrorFault, JobTypeNotFoundFault, IOException {
        Transfer201210 transfer201210 = new Transfer201210();
        faspSoap = transfer201210.getTransfer201210Port();
        BindingProvider bindingProvider = (BindingProvider) faspSoap;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://10.10.0.62:40001/services/soap/Transfer-201210");
        callMethod(faspSoap);
    }

    private void callMethod(FASPSoap faspSoap) throws FilterChangedErrorFault, JobFormatInvalidFault,
            JobSubmissionErrorFault, JobTypeNotFoundFault , IOException{
        createSubmitRequest();
        submitRequest.setType(requestType);
        submitResponse = faspSoap.submit(submitRequest);
    }

    private String requestStatus () throws  FilterChangedErrorFault{
        FileTransferFilter fileTransferFilter = new FileTransferFilter();
        fileTransferFilter.getJobId().add(submitResponse.getJobResult().getID());
        getInfoRequest.setFileTransferFilter(fileTransferFilter);
        //submit request
        getInfoResponse = faspSoap.getInfo(getInfoRequest);
        return getInfoResponse.getInfoResult().getSessionInfo().get(0).getStatus();
    }

    private String objectToString() throws IOException{
        StringWriter sw = new StringWriter();
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(AesOrderType.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            jaxbMarshaller.marshal(aesOrderType, sw);

        } catch (JAXBException ex) {
            System.err.println(ex.getMessage());
        }
        return sw.toString();
    }
///////temporary method
}