
package aspera.xml.iscptransfernet._2006._04.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatisticsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatisticsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Retry" type="{urn:Aspera:XML:IScpTransferNET:2006/04:Types}RetryStatisticsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticsType", propOrder = {
    "retry"
})
public class StatisticsType {

    @XmlElement(name = "Retry", required = true)
    protected RetryStatisticsType retry;

    /**
     * Gets the value of the retry property.
     * 
     * @return
     *     possible object is
     *     {@link RetryStatisticsType }
     *     
     */
    public RetryStatisticsType getRetry() {
        return retry;
    }

    /**
     * Sets the value of the retry property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetryStatisticsType }
     *     
     */
    public void setRetry(RetryStatisticsType value) {
        this.retry = value;
    }

}
