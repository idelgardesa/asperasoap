
package aspera.xml.faspsessionnet._2006._01.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkStatisticsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkStatisticsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Delay" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="Efficiency" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkStatisticsType", propOrder = {
    "delay",
    "efficiency"
})
public class NetworkStatisticsType {

    @XmlElement(name = "Delay")
    @XmlSchemaType(name = "unsignedInt")
    protected long delay;
    @XmlElement(name = "Efficiency")
    protected float efficiency;

    /**
     * Gets the value of the delay property.
     * 
     */
    public long getDelay() {
        return delay;
    }

    /**
     * Sets the value of the delay property.
     * 
     */
    public void setDelay(long value) {
        this.delay = value;
    }

    /**
     * Gets the value of the efficiency property.
     * 
     */
    public float getEfficiency() {
        return efficiency;
    }

    /**
     * Sets the value of the efficiency property.
     * 
     */
    public void setEfficiency(float value) {
        this.efficiency = value;
    }

}
