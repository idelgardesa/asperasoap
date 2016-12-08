
package aspera.xml.faspsessionnet._2006._01.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="BandwidthCap" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionID",
    "bandwidthCap"
})
@XmlRootElement(name = "SetBandwidthCapRequest")
public class SetBandwidthCapRequest {

    @XmlElement(name = "SessionID", namespace = "", required = true)
    protected String sessionID;
    @XmlElement(name = "BandwidthCap", namespace = "")
    @XmlSchemaType(name = "unsignedInt")
    protected long bandwidthCap;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
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
