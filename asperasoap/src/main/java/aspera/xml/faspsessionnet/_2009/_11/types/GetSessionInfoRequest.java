
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
 *         &lt;element name="SessionFilter" type="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}SessionFilter"/>
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
    "sessionFilter"
})
@XmlRootElement(name = "GetSessionInfoRequest")
public class GetSessionInfoRequest {

    @XmlElement(name = "SessionFilter", required = true)
    protected SessionFilter sessionFilter;

    /**
     * Gets the value of the sessionFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SessionFilter }
     *     
     */
    public SessionFilter getSessionFilter() {
        return sessionFilter;
    }

    /**
     * Sets the value of the sessionFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionFilter }
     *     
     */
    public void setSessionFilter(SessionFilter value) {
        this.sessionFilter = value;
    }

}
