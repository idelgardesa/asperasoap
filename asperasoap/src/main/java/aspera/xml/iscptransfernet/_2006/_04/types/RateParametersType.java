
package aspera.xml.iscptransfernet._2006._04.types;

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
 *         &lt;element name="TargetRateAsPercent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MinimumRate" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="MinimumRateAsPercent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BandwidthCap" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="LockPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LockTargetRate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LockMinimumRate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "targetRateAsPercent",
    "minimumRate",
    "minimumRateAsPercent",
    "bandwidthCap",
    "lockPolicy",
    "lockTargetRate",
    "lockMinimumRate"
})
public class RateParametersType {

    @XmlElement(name = "Policy", required = true)
    protected String policy;
    @XmlElement(name = "TargetRate")
    @XmlSchemaType(name = "unsignedInt")
    protected long targetRate;
    @XmlElement(name = "TargetRateAsPercent")
    protected boolean targetRateAsPercent;
    @XmlElement(name = "MinimumRate")
    @XmlSchemaType(name = "unsignedInt")
    protected long minimumRate;
    @XmlElement(name = "MinimumRateAsPercent")
    protected boolean minimumRateAsPercent;
    @XmlElement(name = "BandwidthCap")
    @XmlSchemaType(name = "unsignedInt")
    protected long bandwidthCap;
    @XmlElement(name = "LockPolicy")
    protected boolean lockPolicy;
    @XmlElement(name = "LockTargetRate")
    protected boolean lockTargetRate;
    @XmlElement(name = "LockMinimumRate")
    protected boolean lockMinimumRate;

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
     * Gets the value of the targetRateAsPercent property.
     * 
     */
    public boolean isTargetRateAsPercent() {
        return targetRateAsPercent;
    }

    /**
     * Sets the value of the targetRateAsPercent property.
     * 
     */
    public void setTargetRateAsPercent(boolean value) {
        this.targetRateAsPercent = value;
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
     * Gets the value of the minimumRateAsPercent property.
     * 
     */
    public boolean isMinimumRateAsPercent() {
        return minimumRateAsPercent;
    }

    /**
     * Sets the value of the minimumRateAsPercent property.
     * 
     */
    public void setMinimumRateAsPercent(boolean value) {
        this.minimumRateAsPercent = value;
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
     * Gets the value of the lockPolicy property.
     * 
     */
    public boolean isLockPolicy() {
        return lockPolicy;
    }

    /**
     * Sets the value of the lockPolicy property.
     * 
     */
    public void setLockPolicy(boolean value) {
        this.lockPolicy = value;
    }

    /**
     * Gets the value of the lockTargetRate property.
     * 
     */
    public boolean isLockTargetRate() {
        return lockTargetRate;
    }

    /**
     * Sets the value of the lockTargetRate property.
     * 
     */
    public void setLockTargetRate(boolean value) {
        this.lockTargetRate = value;
    }

    /**
     * Gets the value of the lockMinimumRate property.
     * 
     */
    public boolean isLockMinimumRate() {
        return lockMinimumRate;
    }

    /**
     * Sets the value of the lockMinimumRate property.
     * 
     */
    public void setLockMinimumRate(boolean value) {
        this.lockMinimumRate = value;
    }

}
