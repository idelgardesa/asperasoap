
package aspera.central._2012._10.transfer201210;

import javax.xml.ws.WebFault;
import aspera.xml.jobnet._2006._01.types.JobFormatInvalidFaultType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "JobFormatInvalidFaultType", targetNamespace = "urn:Aspera:XML:JobNET:2006/01:Types")
public class JobFormatInvalidFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private JobFormatInvalidFaultType faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public JobFormatInvalidFault(String message, JobFormatInvalidFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public JobFormatInvalidFault(String message, JobFormatInvalidFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: aspera.xml.jobnet._2006._01.types.JobFormatInvalidFaultType
     */
    public JobFormatInvalidFaultType getFaultInfo() {
        return faultInfo;
    }

}
