
package aspera.xml.faspsessionnet._2009._11.types;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionStatistics">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}SessionKey">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpectedFileCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="ExpectedDirCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="ExpectedByteCount" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="FileCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="FilesComplete" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="FilesFailed" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="FilesTransferring" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="BytesWritten" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="BytesTransferred" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="BytesLost" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="Elapsed" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="NetworkDelay" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="RateInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionStatistics", propOrder = {
    "status",
    "errorCode",
    "errorDescription",
    "expectedFileCount",
    "expectedDirCount",
    "expectedByteCount",
    "fileCount",
    "filesComplete",
    "filesFailed",
    "filesTransferring",
    "bytesWritten",
    "bytesTransferred",
    "bytesLost",
    "elapsed",
    "networkDelay",
    "rateInfo"
})
@XmlSeeAlso({
    SessionInfo.class
})
public class SessionStatistics
    extends SessionKey
{

    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "ErrorCode")
    protected int errorCode;
    @XmlElement(name = "ErrorDescription")
    protected String errorDescription;
    @XmlElement(name = "ExpectedFileCount")
    @XmlSchemaType(name = "unsignedInt")
    protected long expectedFileCount;
    @XmlElement(name = "ExpectedDirCount")
    @XmlSchemaType(name = "unsignedInt")
    protected long expectedDirCount;
    @XmlElement(name = "ExpectedByteCount", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger expectedByteCount;
    @XmlElement(name = "FileCount")
    @XmlSchemaType(name = "unsignedInt")
    protected long fileCount;
    @XmlElement(name = "FilesComplete")
    @XmlSchemaType(name = "unsignedInt")
    protected long filesComplete;
    @XmlElement(name = "FilesFailed")
    @XmlSchemaType(name = "unsignedInt")
    protected long filesFailed;
    @XmlElement(name = "FilesTransferring")
    @XmlSchemaType(name = "unsignedInt")
    protected long filesTransferring;
    @XmlElement(name = "BytesWritten", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger bytesWritten;
    @XmlElement(name = "BytesTransferred", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger bytesTransferred;
    @XmlElement(name = "BytesLost", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger bytesLost;
    @XmlElement(name = "Elapsed", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger elapsed;
    @XmlElement(name = "NetworkDelay")
    @XmlSchemaType(name = "unsignedInt")
    protected long networkDelay;
    @XmlElement(name = "RateInfo")
    protected String rateInfo;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * Gets the value of the expectedFileCount property.
     * 
     */
    public long getExpectedFileCount() {
        return expectedFileCount;
    }

    /**
     * Sets the value of the expectedFileCount property.
     * 
     */
    public void setExpectedFileCount(long value) {
        this.expectedFileCount = value;
    }

    /**
     * Gets the value of the expectedDirCount property.
     * 
     */
    public long getExpectedDirCount() {
        return expectedDirCount;
    }

    /**
     * Sets the value of the expectedDirCount property.
     * 
     */
    public void setExpectedDirCount(long value) {
        this.expectedDirCount = value;
    }

    /**
     * Gets the value of the expectedByteCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpectedByteCount() {
        return expectedByteCount;
    }

    /**
     * Sets the value of the expectedByteCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpectedByteCount(BigInteger value) {
        this.expectedByteCount = value;
    }

    /**
     * Gets the value of the fileCount property.
     * 
     */
    public long getFileCount() {
        return fileCount;
    }

    /**
     * Sets the value of the fileCount property.
     * 
     */
    public void setFileCount(long value) {
        this.fileCount = value;
    }

    /**
     * Gets the value of the filesComplete property.
     * 
     */
    public long getFilesComplete() {
        return filesComplete;
    }

    /**
     * Sets the value of the filesComplete property.
     * 
     */
    public void setFilesComplete(long value) {
        this.filesComplete = value;
    }

    /**
     * Gets the value of the filesFailed property.
     * 
     */
    public long getFilesFailed() {
        return filesFailed;
    }

    /**
     * Sets the value of the filesFailed property.
     * 
     */
    public void setFilesFailed(long value) {
        this.filesFailed = value;
    }

    /**
     * Gets the value of the filesTransferring property.
     * 
     */
    public long getFilesTransferring() {
        return filesTransferring;
    }

    /**
     * Sets the value of the filesTransferring property.
     * 
     */
    public void setFilesTransferring(long value) {
        this.filesTransferring = value;
    }

    /**
     * Gets the value of the bytesWritten property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBytesWritten() {
        return bytesWritten;
    }

    /**
     * Sets the value of the bytesWritten property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBytesWritten(BigInteger value) {
        this.bytesWritten = value;
    }

    /**
     * Gets the value of the bytesTransferred property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBytesTransferred() {
        return bytesTransferred;
    }

    /**
     * Sets the value of the bytesTransferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBytesTransferred(BigInteger value) {
        this.bytesTransferred = value;
    }

    /**
     * Gets the value of the bytesLost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBytesLost() {
        return bytesLost;
    }

    /**
     * Sets the value of the bytesLost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBytesLost(BigInteger value) {
        this.bytesLost = value;
    }

    /**
     * Gets the value of the elapsed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getElapsed() {
        return elapsed;
    }

    /**
     * Sets the value of the elapsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setElapsed(BigInteger value) {
        this.elapsed = value;
    }

    /**
     * Gets the value of the networkDelay property.
     * 
     */
    public long getNetworkDelay() {
        return networkDelay;
    }

    /**
     * Sets the value of the networkDelay property.
     * 
     */
    public void setNetworkDelay(long value) {
        this.networkDelay = value;
    }

    /**
     * Gets the value of the rateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateInfo() {
        return rateInfo;
    }

    /**
     * Sets the value of the rateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateInfo(String value) {
        this.rateInfo = value;
    }

}
