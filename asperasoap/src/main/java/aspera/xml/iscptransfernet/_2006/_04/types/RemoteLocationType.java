
package aspera.xml.iscptransfernet._2006._04.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoteLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoteLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="System" type="{urn:Aspera:XML:IScpTransferNET:2006/04:Types}SystemType"/>
 *         &lt;element name="Authentication" type="{urn:Aspera:XML:IScpTransferNET:2006/04:Types}AuthenticationType"/>
 *         &lt;element name="Files" type="{urn:Aspera:XML:IScpTransferNET:2006/04:Types}ArrayOfPaths"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteLocationType", propOrder = {
    "system",
    "authentication",
    "files"
})
public class RemoteLocationType {

    @XmlElement(name = "System", required = true)
    protected SystemType system;
    @XmlElement(name = "Authentication", required = true)
    protected AuthenticationType authentication;
    @XmlElement(name = "Files", required = true)
    protected ArrayOfPaths files;

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link SystemType }
     *     
     */
    public SystemType getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemType }
     *     
     */
    public void setSystem(SystemType value) {
        this.system = value;
    }

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationType }
     *     
     */
    public AuthenticationType getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationType }
     *     
     */
    public void setAuthentication(AuthenticationType value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the files property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaths }
     *     
     */
    public ArrayOfPaths getFiles() {
        return files;
    }

    /**
     * Sets the value of the files property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaths }
     *     
     */
    public void setFiles(ArrayOfPaths value) {
        this.files = value;
    }

}
