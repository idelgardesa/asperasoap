
package aspera.xml.faspsessionnet._2006._01.types;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregateStatisticsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregateStatisticsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="FilesComplete" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="FilesFailed" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="FilesTransferring" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="BytesWritten" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="BytesTransferred" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="BytesLost" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="uSecondsElapsed" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateStatisticsType", propOrder = {
    "fileCount",
    "filesComplete",
    "filesFailed",
    "filesTransferring",
    "bytesWritten",
    "bytesTransferred",
    "bytesLost",
    "uSecondsElapsed"
})
public class AggregateStatisticsType {

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
    @XmlElement(required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger uSecondsElapsed;

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
     * Gets the value of the uSecondsElapsed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUSecondsElapsed() {
        return uSecondsElapsed;
    }

    /**
     * Sets the value of the uSecondsElapsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUSecondsElapsed(BigInteger value) {
        this.uSecondsElapsed = value;
    }

}
