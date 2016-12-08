
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
 *         &lt;element name="SessionStatisticsResult" type="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}SessionStatisticsResult"/>
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
    "sessionStatisticsResult"
})
@XmlRootElement(name = "GetSessionStatisticsResponse")
public class GetSessionStatisticsResponse {

    @XmlElement(name = "SessionStatisticsResult", required = true)
    protected SessionStatisticsResult sessionStatisticsResult;

    /**
     * Gets the value of the sessionStatisticsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SessionStatisticsResult }
     *     
     */
    public SessionStatisticsResult getSessionStatisticsResult() {
        return sessionStatisticsResult;
    }

    /**
     * Sets the value of the sessionStatisticsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionStatisticsResult }
     *     
     */
    public void setSessionStatisticsResult(SessionStatisticsResult value) {
        this.sessionStatisticsResult = value;
    }

}
