
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
 *         &lt;element name="InfoResult" type="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}InfoResult"/>
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
    "infoResult"
})
@XmlRootElement(name = "GetInfoResponse")
public class GetInfoResponse {

    @XmlElement(name = "InfoResult", required = true)
    protected InfoResult infoResult;

    /**
     * Gets the value of the infoResult property.
     * 
     * @return
     *     possible object is
     *     {@link InfoResult }
     *     
     */
    public InfoResult getInfoResult() {
        return infoResult;
    }

    /**
     * Sets the value of the infoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoResult }
     *     
     */
    public void setInfoResult(InfoResult value) {
        this.infoResult = value;
    }

}
