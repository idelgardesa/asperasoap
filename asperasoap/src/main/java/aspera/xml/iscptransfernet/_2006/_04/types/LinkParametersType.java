
package aspera.xml.iscptransfernet._2006._04.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemoteCapacity" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="LocalCapacity" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="AutoDetectCapacity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkParametersType", propOrder = {
    "remoteCapacity",
    "localCapacity",
    "autoDetectCapacity"
})
public class LinkParametersType {

    @XmlElement(name = "RemoteCapacity")
    @XmlSchemaType(name = "unsignedInt")
    protected long remoteCapacity;
    @XmlElement(name = "LocalCapacity")
    @XmlSchemaType(name = "unsignedInt")
    protected long localCapacity;
    @XmlElement(name = "AutoDetectCapacity")
    protected boolean autoDetectCapacity;

    /**
     * Gets the value of the remoteCapacity property.
     * 
     */
    public long getRemoteCapacity() {
        return remoteCapacity;
    }

    /**
     * Sets the value of the remoteCapacity property.
     * 
     */
    public void setRemoteCapacity(long value) {
        this.remoteCapacity = value;
    }

    /**
     * Gets the value of the localCapacity property.
     * 
     */
    public long getLocalCapacity() {
        return localCapacity;
    }

    /**
     * Sets the value of the localCapacity property.
     * 
     */
    public void setLocalCapacity(long value) {
        this.localCapacity = value;
    }

    /**
     * Gets the value of the autoDetectCapacity property.
     * 
     */
    public boolean isAutoDetectCapacity() {
        return autoDetectCapacity;
    }

    /**
     * Sets the value of the autoDetectCapacity property.
     * 
     */
    public void setAutoDetectCapacity(boolean value) {
        this.autoDetectCapacity = value;
    }

}
