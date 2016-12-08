
package aspera.xml.faspsessionnet._2009._11.types;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileTransferStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileTransferStatistics">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}FileTransferKey">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="StartOffset" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="BytesWritten" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="BytesContiguous" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="BytesLost" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="Elapsed" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileTransferStatistics", propOrder = {
    "status",
    "errorCode",
    "errorDescription",
    "size",
    "startOffset",
    "bytesWritten",
    "bytesContiguous",
    "bytesLost",
    "elapsed"
})
@XmlSeeAlso({
    FileTransferInfo.class
})
public class FileTransferStatistics
    extends FileTransferKey
{

    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "ErrorCode")
    protected int errorCode;
    @XmlElement(name = "ErrorDescription")
    protected String errorDescription;
    @XmlElement(name = "Size", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger size;
    @XmlElement(name = "StartOffset", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger startOffset;
    @XmlElement(name = "BytesWritten", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger bytesWritten;
    @XmlElement(name = "BytesContiguous", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger bytesContiguous;
    @XmlElement(name = "BytesLost", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger bytesLost;
    @XmlElement(name = "Elapsed", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger elapsed;

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
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSize(BigInteger value) {
        this.size = value;
    }

    /**
     * Gets the value of the startOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartOffset() {
        return startOffset;
    }

    /**
     * Sets the value of the startOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartOffset(BigInteger value) {
        this.startOffset = value;
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
     * Gets the value of the bytesContiguous property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBytesContiguous() {
        return bytesContiguous;
    }

    /**
     * Sets the value of the bytesContiguous property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBytesContiguous(BigInteger value) {
        this.bytesContiguous = value;
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

}
