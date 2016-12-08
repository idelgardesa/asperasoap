
package aspera.xml.faspsessionnet._2009._11.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SessionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}SessionStatistics">
 *       &lt;sequence>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cookie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServerEndpoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerSSHPort" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="ServerFASPPort" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClientEndpoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClientAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientFASPPort" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="RatePolicy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TargetRate" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="MinimumRate" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="BandwidthCap" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="EncryptionCipher" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JobRetryCount" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="JobMaxRetries" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="PrivateKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourcePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VLinkId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionInfo", propOrder = {
    "startDate",
    "endDate",
    "token",
    "cookie",
    "direction",
    "serverEndpoint",
    "serverAddress",
    "serverSSHPort",
    "serverFASPPort",
    "user",
    "clientEndpoint",
    "clientAddress",
    "clientFASPPort",
    "ratePolicy",
    "targetRate",
    "minimumRate",
    "bandwidthCap",
    "encryptionCipher",
    "jobRetryCount",
    "jobMaxRetries",
    "privateKey",
    "sourcePath",
    "destinationPath",
    "vLinkId"
})
public class SessionInfo
    extends SessionStatistics
{

    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "Cookie")
    protected String cookie;
    @XmlElement(name = "Direction", required = true)
    protected String direction;
    @XmlElement(name = "ServerEndpoint", required = true)
    protected String serverEndpoint;
    @XmlElement(name = "ServerAddress")
    protected String serverAddress;
    @XmlElement(name = "ServerSSHPort")
    @XmlSchemaType(name = "unsignedShort")
    protected int serverSSHPort;
    @XmlElement(name = "ServerFASPPort")
    @XmlSchemaType(name = "unsignedShort")
    protected int serverFASPPort;
    @XmlElement(name = "User", required = true)
    protected String user;
    @XmlElement(name = "ClientEndpoint", required = true)
    protected String clientEndpoint;
    @XmlElement(name = "ClientAddress")
    protected String clientAddress;
    @XmlElement(name = "ClientFASPPort")
    @XmlSchemaType(name = "unsignedShort")
    protected int clientFASPPort;
    @XmlElement(name = "RatePolicy", required = true)
    protected String ratePolicy;
    @XmlElement(name = "TargetRate")
    @XmlSchemaType(name = "unsignedInt")
    protected long targetRate;
    @XmlElement(name = "MinimumRate")
    @XmlSchemaType(name = "unsignedInt")
    protected long minimumRate;
    @XmlElement(name = "BandwidthCap")
    @XmlSchemaType(name = "unsignedInt")
    protected long bandwidthCap;
    @XmlElement(name = "EncryptionCipher", required = true)
    protected String encryptionCipher;
    @XmlElement(name = "JobRetryCount")
    @XmlSchemaType(name = "unsignedByte")
    protected short jobRetryCount;
    @XmlElement(name = "JobMaxRetries")
    @XmlSchemaType(name = "unsignedByte")
    protected short jobMaxRetries;
    @XmlElement(name = "PrivateKey")
    protected String privateKey;
    @XmlElement(name = "SourcePath")
    protected String sourcePath;
    @XmlElement(name = "DestinationPath")
    protected String destinationPath;
    @XmlElement(name = "VLinkId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vLinkId;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the cookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCookie() {
        return cookie;
    }

    /**
     * Sets the value of the cookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCookie(String value) {
        this.cookie = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the serverEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerEndpoint() {
        return serverEndpoint;
    }

    /**
     * Sets the value of the serverEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerEndpoint(String value) {
        this.serverEndpoint = value;
    }

    /**
     * Gets the value of the serverAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerAddress() {
        return serverAddress;
    }

    /**
     * Sets the value of the serverAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerAddress(String value) {
        this.serverAddress = value;
    }

    /**
     * Gets the value of the serverSSHPort property.
     * 
     */
    public int getServerSSHPort() {
        return serverSSHPort;
    }

    /**
     * Sets the value of the serverSSHPort property.
     * 
     */
    public void setServerSSHPort(int value) {
        this.serverSSHPort = value;
    }

    /**
     * Gets the value of the serverFASPPort property.
     * 
     */
    public int getServerFASPPort() {
        return serverFASPPort;
    }

    /**
     * Sets the value of the serverFASPPort property.
     * 
     */
    public void setServerFASPPort(int value) {
        this.serverFASPPort = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the clientEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientEndpoint() {
        return clientEndpoint;
    }

    /**
     * Sets the value of the clientEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientEndpoint(String value) {
        this.clientEndpoint = value;
    }

    /**
     * Gets the value of the clientAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientAddress() {
        return clientAddress;
    }

    /**
     * Sets the value of the clientAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientAddress(String value) {
        this.clientAddress = value;
    }

    /**
     * Gets the value of the clientFASPPort property.
     * 
     */
    public int getClientFASPPort() {
        return clientFASPPort;
    }

    /**
     * Sets the value of the clientFASPPort property.
     * 
     */
    public void setClientFASPPort(int value) {
        this.clientFASPPort = value;
    }

    /**
     * Gets the value of the ratePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePolicy() {
        return ratePolicy;
    }

    /**
     * Sets the value of the ratePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePolicy(String value) {
        this.ratePolicy = value;
    }

    /**
     * Gets the value of the targetRate property.
     * 
     */
    public long getTargetRate() {
        return targetRate;
    }

    /**
     * Sets the value of the targetRate property.
     * 
     */
    public void setTargetRate(long value) {
        this.targetRate = value;
    }

    /**
     * Gets the value of the minimumRate property.
     * 
     */
    public long getMinimumRate() {
        return minimumRate;
    }

    /**
     * Sets the value of the minimumRate property.
     * 
     */
    public void setMinimumRate(long value) {
        this.minimumRate = value;
    }

    /**
     * Gets the value of the bandwidthCap property.
     * 
     */
    public long getBandwidthCap() {
        return bandwidthCap;
    }

    /**
     * Sets the value of the bandwidthCap property.
     * 
     */
    public void setBandwidthCap(long value) {
        this.bandwidthCap = value;
    }

    /**
     * Gets the value of the encryptionCipher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionCipher() {
        return encryptionCipher;
    }

    /**
     * Sets the value of the encryptionCipher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionCipher(String value) {
        this.encryptionCipher = value;
    }

    /**
     * Gets the value of the jobRetryCount property.
     * 
     */
    public short getJobRetryCount() {
        return jobRetryCount;
    }

    /**
     * Sets the value of the jobRetryCount property.
     * 
     */
    public void setJobRetryCount(short value) {
        this.jobRetryCount = value;
    }

    /**
     * Gets the value of the jobMaxRetries property.
     * 
     */
    public short getJobMaxRetries() {
        return jobMaxRetries;
    }

    /**
     * Sets the value of the jobMaxRetries property.
     * 
     */
    public void setJobMaxRetries(short value) {
        this.jobMaxRetries = value;
    }

    /**
     * Gets the value of the privateKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * Sets the value of the privateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateKey(String value) {
        this.privateKey = value;
    }

    /**
     * Gets the value of the sourcePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcePath() {
        return sourcePath;
    }

    /**
     * Sets the value of the sourcePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcePath(String value) {
        this.sourcePath = value;
    }

    /**
     * Gets the value of the destinationPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationPath() {
        return destinationPath;
    }

    /**
     * Sets the value of the destinationPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationPath(String value) {
        this.destinationPath = value;
    }

    /**
     * Gets the value of the vLinkId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVLinkId() {
        return vLinkId;
    }

    /**
     * Sets the value of the vLinkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVLinkId(Long value) {
        this.vLinkId = value;
    }

}
