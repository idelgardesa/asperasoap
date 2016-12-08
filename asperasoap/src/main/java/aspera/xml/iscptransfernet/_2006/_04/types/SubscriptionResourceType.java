
package aspera.xml.iscptransfernet._2006._04.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionResourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionResourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Observer" type="{urn:Aspera:XML:IScpTransferNET:2006/04:Types}EndpointReferenceType"/>
 *         &lt;element name="Topics" type="{urn:Aspera:XML:IScpTransferNET:2006/04:Types}TopicExpressionType"/>
 *         &lt;element name="TimeRemaining" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionResourceType", propOrder = {
    "id",
    "observer",
    "topics",
    "timeRemaining"
})
public class SubscriptionResourceType {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "Observer", required = true)
    protected EndpointReferenceType observer;
    @XmlElement(name = "Topics", required = true)
    protected TopicExpressionType topics;
    @XmlElement(name = "TimeRemaining")
    @XmlSchemaType(name = "unsignedInt")
    protected long timeRemaining;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the observer property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getObserver() {
        return observer;
    }

    /**
     * Sets the value of the observer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setObserver(EndpointReferenceType value) {
        this.observer = value;
    }

    /**
     * Gets the value of the topics property.
     * 
     * @return
     *     possible object is
     *     {@link TopicExpressionType }
     *     
     */
    public TopicExpressionType getTopics() {
        return topics;
    }

    /**
     * Sets the value of the topics property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicExpressionType }
     *     
     */
    public void setTopics(TopicExpressionType value) {
        this.topics = value;
    }

    /**
     * Gets the value of the timeRemaining property.
     * 
     */
    public long getTimeRemaining() {
        return timeRemaining;
    }

    /**
     * Sets the value of the timeRemaining property.
     * 
     */
    public void setTimeRemaining(long value) {
        this.timeRemaining = value;
    }

}
