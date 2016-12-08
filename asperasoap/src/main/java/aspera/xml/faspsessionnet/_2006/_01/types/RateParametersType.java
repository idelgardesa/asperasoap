
package aspera.xml.faspsessionnet._2006._01.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Policy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TargetRate" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="MinimumRate" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="BandwidthCap" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateParametersType", propOrder = {
    "policy",
    "targetRate",
    "minimumRate",
    "bandwidthCap"
})
public class RateParametersType {

    @XmlElement(name = "Policy", required = true)
    protected String policy;
    @XmlElement(name = "TargetRate")
    @XmlSchemaType(name = "unsignedInt")
    protected long targetRate;
    @XmlElement(name = "MinimumRate")
    @XmlSchemaType(name = "unsignedInt")
    protected long minimumRate;
    @XmlElement(name = "BandwidthCap")
    @XmlSchemaType(name = "unsignedInt")
    protected long bandwidthCap;

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicy(String value) {
        this.policy = value;
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

}
