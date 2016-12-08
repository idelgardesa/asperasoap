
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
 *         &lt;element name="SessionKeysResult" type="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}SessionKeysResult"/>
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
    "sessionKeysResult"
})
@XmlRootElement(name = "GetSessionsResponse")
public class GetSessionsResponse {

    @XmlElement(name = "SessionKeysResult", required = true)
    protected SessionKeysResult sessionKeysResult;

    /**
     * Gets the value of the sessionKeysResult property.
     * 
     * @return
     *     possible object is
     *     {@link SessionKeysResult }
     *     
     */
    public SessionKeysResult getSessionKeysResult() {
        return sessionKeysResult;
    }

    /**
     * Sets the value of the sessionKeysResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionKeysResult }
     *     
     */
    public void setSessionKeysResult(SessionKeysResult value) {
        this.sessionKeysResult = value;
    }

}
