
package aspera.xml.iscptransfernet._2006._04.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetryStatisticsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetryStatisticsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FailedAttempts" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetryStatisticsType", propOrder = {
    "failedAttempts"
})
public class RetryStatisticsType {

    @XmlElement(name = "FailedAttempts")
    @XmlSchemaType(name = "unsignedByte")
    protected short failedAttempts;

    /**
     * Gets the value of the failedAttempts property.
     * 
     */
    public short getFailedAttempts() {
        return failedAttempts;
    }

    /**
     * Sets the value of the failedAttempts property.
     * 
     */
    public void setFailedAttempts(short value) {
        this.failedAttempts = value;
    }

}
