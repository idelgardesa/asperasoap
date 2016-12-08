
package aspera.xml.faspsessionnet._2006._01.types;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileStatisticsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileStatisticsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="BytesWritten" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="BytesContiguous" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="BytesLost" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="StartByte" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="uSecondsElapsed" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileStatisticsType", propOrder = {
    "name",
    "size",
    "bytesWritten",
    "bytesContiguous",
    "bytesLost",
    "startByte",
    "uSecondsElapsed",
    "errorCode",
    "errorDescription"
})
public class FileStatisticsType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Size", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger size;
    @XmlElement(name = "BytesWritten", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger bytesWritten;
    @XmlElement(name = "BytesContiguous", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger bytesContiguous;
    @XmlElement(name = "BytesLost", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger bytesLost;
    @XmlElement(name = "StartByte", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger startByte;
    @XmlElement(required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger uSecondsElapsed;
    @XmlElement(name = "ErrorCode")
    protected int errorCode;
    @XmlElement(name = "ErrorDescription", required = true)
    protected String errorDescription;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the startByte property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartByte() {
        return startByte;
    }

    /**
     * Sets the value of the startByte property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartByte(BigInteger value) {
        this.startByte = value;
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

}
