
package aspera.xml.iscptransfernet._2006._04.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetryParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetryParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="BaseInterval" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="MaximumInterval" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetryParametersType", propOrder = {
    "count",
    "baseInterval",
    "maximumInterval"
})
public class RetryParametersType {

    @XmlElement(name = "Count")
    @XmlSchemaType(name = "unsignedByte")
    protected short count;
    @XmlElement(name = "BaseInterval")
    @XmlSchemaType(name = "unsignedInt")
    protected long baseInterval;
    @XmlElement(name = "MaximumInterval")
    @XmlSchemaType(name = "unsignedInt")
    protected long maximumInterval;

    /**
     * Gets the value of the count property.
     * 
     */
    public short getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(short value) {
        this.count = value;
    }

    /**
     * Gets the value of the baseInterval property.
     * 
     */
    public long getBaseInterval() {
        return baseInterval;
    }

    /**
     * Sets the value of the baseInterval property.
     * 
     */
    public void setBaseInterval(long value) {
        this.baseInterval = value;
    }

    /**
     * Gets the value of the maximumInterval property.
     * 
     */
    public long getMaximumInterval() {
        return maximumInterval;
    }

    /**
     * Sets the value of the maximumInterval property.
     * 
     */
    public void setMaximumInterval(long value) {
        this.maximumInterval = value;
    }

}
