
package aspera.xml.faspsessionnet._2006._01.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="RateParameters" type="{urn:Aspera:XML:FASPSessionNET:2006/01:Types}RateParametersType" form="unqualified"/>
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
    "rateParameters"
})
@XmlRootElement(name = "SetRateParametersRequest")
public class SetRateParametersRequest {

    @XmlElement(name = "SessionID", namespace = "", required = true)
    protected String sessionID;
    @XmlElement(name = "RateParameters", namespace = "", required = true)
    protected RateParametersType rateParameters;

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
     * Gets the value of the rateParameters property.
     * 
     * @return
     *     possible object is
     *     {@link RateParametersType }
     *     
     */
    public RateParametersType getRateParameters() {
        return rateParameters;
    }

    /**
     * Sets the value of the rateParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateParametersType }
     *     
     */
    public void setRateParameters(RateParametersType value) {
        this.rateParameters = value;
    }

}
