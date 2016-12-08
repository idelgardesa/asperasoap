
package aspera.xml.faspsessionnet._2009._11.types;

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
 *         &lt;element name="SessionInfoResult" type="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}SessionInfoResult"/>
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
    "sessionInfoResult"
})
@XmlRootElement(name = "GetSessionInfoResponse")
public class GetSessionInfoResponse {

    @XmlElement(name = "SessionInfoResult", required = true)
    protected SessionInfoResult sessionInfoResult;

    /**
     * Gets the value of the sessionInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link SessionInfoResult }
     *     
     */
    public SessionInfoResult getSessionInfoResult() {
        return sessionInfoResult;
    }

    /**
     * Sets the value of the sessionInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionInfoResult }
     *     
     */
    public void setSessionInfoResult(SessionInfoResult value) {
        this.sessionInfoResult = value;
    }

}
