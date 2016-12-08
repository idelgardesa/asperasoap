
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
 *         &lt;element name="StatisticsResult" type="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}StatisticsResult"/>
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
    "statisticsResult"
})
@XmlRootElement(name = "GetStatisticsResponse")
public class GetStatisticsResponse {

    @XmlElement(name = "StatisticsResult", required = true)
    protected StatisticsResult statisticsResult;

    /**
     * Gets the value of the statisticsResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsResult }
     *     
     */
    public StatisticsResult getStatisticsResult() {
        return statisticsResult;
    }

    /**
     * Sets the value of the statisticsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsResult }
     *     
     */
    public void setStatisticsResult(StatisticsResult value) {
        this.statisticsResult = value;
    }

}
