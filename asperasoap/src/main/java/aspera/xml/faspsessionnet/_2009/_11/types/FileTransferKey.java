
package aspera.xml.faspsessionnet._2009._11.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileTransferKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileTransferKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionUUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocalId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileTransferKey", propOrder = {
    "sessionUUID",
    "path",
    "localId",
    "uuid"
})
@XmlSeeAlso({
    FileTransferStatistics.class
})
public class FileTransferKey {

    @XmlElement(name = "SessionUUID", required = true)
    protected String sessionUUID;
    @XmlElement(name = "Path", required = true)
    protected String path;
    @XmlElement(name = "LocalId")
    protected long localId;
    @XmlElement(name = "UUID", required = true)
    protected String uuid;

    /**
     * Gets the value of the sessionUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionUUID() {
        return sessionUUID;
    }

    /**
     * Sets the value of the sessionUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionUUID(String value) {
        this.sessionUUID = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the localId property.
     * 
     */
    public long getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     */
    public void setLocalId(long value) {
        this.localId = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

}
