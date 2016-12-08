package com.avioon;

import aspera.central._2012._10.transfer201210.FilterChangedErrorFault;
import aspera.central._2012._10.transfer201210.JobFormatInvalidFault;
import aspera.central._2012._10.transfer201210.JobSubmissionErrorFault;
import aspera.central._2012._10.transfer201210.JobTypeNotFoundFault;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AesTransferWrapper transferWrapper = new AesTransferWrapper(
                "Aspera.IScpTransfer",
                "Push",
                "rtl2transcod.aspera.upload.akamai.com",
                "Papagaio",
                22,
                "sshacs",
                "Public Key",
                "/home/aspera/.ssh/aspera",
                "root",
                "init1111",
                "/home/aspera/Schreibtisch/transfers/transfer1.mxf"
        );







        try {
            transferWrapper.doAction();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FilterChangedErrorFault filterChangedErrorFault) {
            filterChangedErrorFault.printStackTrace();
        } catch (JobSubmissionErrorFault jobSubmissionErrorFault) {
            jobSubmissionErrorFault.printStackTrace();
        } catch (JobFormatInvalidFault jobFormatInvalidFault) {
            jobFormatInvalidFault.printStackTrace();
        } catch (JobTypeNotFoundFault jobTypeNotFoundFault) {
            jobTypeNotFoundFault.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


        System.out.println("worked without exception");
    }
}
