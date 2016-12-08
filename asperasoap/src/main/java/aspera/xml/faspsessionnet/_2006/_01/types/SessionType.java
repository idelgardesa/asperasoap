
package aspera.xml.faspsessionnet._2006._01.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ApplicationData" type="{urn:Aspera:XML:FASPSessionNET:2006/01:Types}ApplicationDataType"/>
 *         &lt;element name="Operation" type="{urn:Aspera:XML:FASPSessionNET:2006/01:Types}OperationType"/>
 *         &lt;element name="Server" type="{urn:Aspera:XML:FASPSessionNET:2006/01:Types}ServerType"/>
 *         &lt;element name="Client" type="{urn:Aspera:XML:FASPSessionNET:2006/01:Types}ClientType"/>
 *         &lt;element name="RateParameters" type="{urn:Aspera:XML:FASPSessionNET:2006/01:Types}RateParametersType"/>
 *         &lt;element name="SecurityParameters" type="{urn:Aspera:XML:FASPSessionNET:2006/01:Types}SecurityParametersType"/>
 *         &lt;element name="Statistics" type="{urn:Aspera:XML:FASPSessionNET:2006/01:Types}StatisticsType"/>
 *         &lt;element name="Error" type="{urn:Aspera:XML:FASPSessionNET:2006/01:Types}ErrorType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionType", propOrder = {
    "sessionID",
    "applicationData",
    "operation",
    "server",
    "client",
    "rateParameters",
    "securityParameters",
    "statistics",
    "error"
})
public class SessionType {

    @XmlElement(name = "SessionID", required = true)
    protected String sessionID;
    @XmlElement(name = "ApplicationData", required = true)
    protected ApplicationDataType applicationData;
    @XmlElement(name = "Operation", required = true)
    protected OperationType operation;
    @XmlElement(name = "Server", required = true)
    protected ServerType server;
    @XmlElement(name = "Client", required = true)
    protected ClientType client;
    @XmlElement(name = "RateParameters", required = true)
    protected RateParametersType rateParameters;
    @XmlElement(name = "SecurityParameters", required = true)
    protected SecurityParametersType securityParameters;
    @XmlElement(name = "Statistics", required = true)
    protected StatisticsType statistics;
    @XmlElement(name = "Error", required = true)
    protected ErrorType error;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the applicationData property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationDataType }
     *     
     */
    public ApplicationDataType getApplicationData() {
        return applicationData;
    }

    /**
     * Sets the value of the applicationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationDataType }
     *     
     */
    public void setApplicationData(ApplicationDataType value) {
        this.applicationData = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationType }
     *     
     */
    public OperationType getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationType }
     *     
     */
    public void setOperation(OperationType value) {
        this.operation = value;
    }

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link ServerType }
     *     
     */
    public ServerType getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerType }
     *     
     */
    public void setServer(ServerType value) {
        this.server = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link ClientType }
     *     
     */
    public ClientType getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientType }
     *     
     */
    public void setClient(ClientType value) {
        this.client = value;
    }

    /**
     * Gets the value of the rateParameters property.
     * 
     * @return
     *     possible object is
     *     {@link RateParametersType }
     *     
     */
    public RateParametersType getRateParameters() {
        return rateParameters;
    }

    /**
     * Sets the value of the rateParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateParametersType }
     *     
     */
    public void setRateParameters(RateParametersType value) {
        this.rateParameters = value;
    }

    /**
     * Gets the value of the securityParameters property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityParametersType }
     *     
     */
    public SecurityParametersType getSecurityParameters() {
        return securityParameters;
    }

    /**
     * Sets the value of the securityParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityParametersType }
     *     
     */
    public void setSecurityParameters(SecurityParametersType value) {
        this.securityParameters = value;
    }

    /**
     * Gets the value of the statistics property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsType }
     *     
     */
    public StatisticsType getStatistics() {
        return statistics;
    }

    /**
     * Sets the value of the statistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsType }
     *     
     */
    public void setStatistics(StatisticsType value) {
        this.statistics = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setError(ErrorType value) {
        this.error = value;
    }

}
