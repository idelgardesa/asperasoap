
package aspera.xml.iscptransfernet._2006._04.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Agent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ApplicationData" type="{urn:Aspera:XML:IScpTransferNET:2006/04:Types}ApplicationDataType"/>
 *         &lt;element name="Operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RemoteLocation" type="{urn:Aspera:XML:IScpTransferNET:2006/04:Types}RemoteLocationType"/>
 *         &lt;element name="LocalLocation" type="{urn:Aspera:XML:IScpTransferNET:2006/04:Types}LocalLocationType"/>
 *         &lt;element name="FileParameters" type="{urn:Aspera:XML:IScpTransferNET:2006/04:Types}FileParametersType"/>
 *         &lt;element name="LinkParameters" type="{urn:Aspera:XML:IScpTransferNET:2006/04:Types}LinkParametersType"/>
 *         &lt;element name="ChannelParameters" type="{urn:Aspera:XML:IScpTransferNET:2006/04:Types}ChannelParametersType"/>
 *         &lt;element name="RateParameters" type="{urn:Aspera:XML:IScpTransferNET:2006/04:Types}RateParametersType"/>
 *         &lt;element name="SecurityParameters" type="{urn:Aspera:XML:IScpTransferNET:2006/04:Types}SecurityParametersType"/>
 *         &lt;element name="RetryParameters" type="{urn:Aspera:XML:IScpTransferNET:2006/04:Types}RetryParametersType"/>
 *         &lt;element name="PrivateDataType" type="{urn:Aspera:XML:IScpTransferNET:2006/04:Types}PrivateDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderType", propOrder = {
    "agent",
    "applicationData",
    "operation",
    "remoteLocation",
    "localLocation",
    "fileParameters",
    "linkParameters",
    "channelParameters",
    "rateParameters",
    "securityParameters",
    "retryParameters",
    "privateDataType"
})
public class OrderType {

    @XmlElement(name = "Agent", required = true)
    protected String agent;
    @XmlElement(name = "ApplicationData", required = true)
    protected ApplicationDataType applicationData;
    @XmlElement(name = "Operation", required = true)
    protected String operation;
    @XmlElement(name = "RemoteLocation", required = true)
    protected RemoteLocationType remoteLocation;
    @XmlElement(name = "LocalLocation", required = true)
    protected LocalLocationType localLocation;
    @XmlElement(name = "FileParameters", required = true)
    protected FileParametersType fileParameters;
    @XmlElement(name = "LinkParameters", required = true)
    protected LinkParametersType linkParameters;
    @XmlElement(name = "ChannelParameters", required = true)
    protected ChannelParametersType channelParameters;
    @XmlElement(name = "RateParameters", required = true)
    protected RateParametersType rateParameters;
    @XmlElement(name = "SecurityParameters", required = true)
    protected SecurityParametersType securityParameters;
    @XmlElement(name = "RetryParameters", required = true)
    protected RetryParametersType retryParameters;
    @XmlElement(name = "PrivateDataType", required = true)
    protected PrivateDataType privateDataType;

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgent(String value) {
        this.agent = value;
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
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the remoteLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RemoteLocationType }
     *     
     */
    public RemoteLocationType getRemoteLocation() {
        return remoteLocation;
    }

    /**
     * Sets the value of the remoteLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoteLocationType }
     *     
     */
    public void setRemoteLocation(RemoteLocationType value) {
        this.remoteLocation = value;
    }

    /**
     * Gets the value of the localLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalLocationType }
     *     
     */
    public LocalLocationType getLocalLocation() {
        return localLocation;
    }

    /**
     * Sets the value of the localLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalLocationType }
     *     
     */
    public void setLocalLocation(LocalLocationType value) {
        this.localLocation = value;
    }

    /**
     * Gets the value of the fileParameters property.
     * 
     * @return
     *     possible object is
     *     {@link FileParametersType }
     *     
     */
    public FileParametersType getFileParameters() {
        return fileParameters;
    }

    /**
     * Sets the value of the fileParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileParametersType }
     *     
     */
    public void setFileParameters(FileParametersType value) {
        this.fileParameters = value;
    }

    /**
     * Gets the value of the linkParameters property.
     * 
     * @return
     *     possible object is
     *     {@link LinkParametersType }
     *     
     */
    public LinkParametersType getLinkParameters() {
        return linkParameters;
    }

    /**
     * Sets the value of the linkParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkParametersType }
     *     
     */
    public void setLinkParameters(LinkParametersType value) {
        this.linkParameters = value;
    }

    /**
     * Gets the value of the channelParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelParametersType }
     *     
     */
    public ChannelParametersType getChannelParameters() {
        return channelParameters;
    }

    /**
     * Sets the value of the channelParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelParametersType }
     *     
     */
    public void setChannelParameters(ChannelParametersType value) {
        this.channelParameters = value;
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
     * Gets the value of the retryParameters property.
     * 
     * @return
     *     possible object is
     *     {@link RetryParametersType }
     *     
     */
    public RetryParametersType getRetryParameters() {
        return retryParameters;
    }

    /**
     * Sets the value of the retryParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetryParametersType }
     *     
     */
    public void setRetryParameters(RetryParametersType value) {
        this.retryParameters = value;
    }

    /**
     * Gets the value of the privateDataType property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateDataType }
     *     
     */
    public PrivateDataType getPrivateDataType() {
        return privateDataType;
    }

    /**
     * Sets the value of the privateDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateDataType }
     *     
     */
    public void setPrivateDataType(PrivateDataType value) {
        this.privateDataType = value;
    }

}
