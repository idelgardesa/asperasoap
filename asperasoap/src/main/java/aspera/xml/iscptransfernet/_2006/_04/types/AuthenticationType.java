
package aspera.xml.iscptransfernet._2006._04.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Methods" type="{urn:Aspera:XML:IScpTransferNET:2006/04:Types}ArrayOfMethods"/>
 *         &lt;element name="KeyPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationType", propOrder = {
    "methods",
    "keyPath"
})
public class AuthenticationType {

    @XmlElement(name = "Methods", required = true)
    protected ArrayOfMethods methods;
    @XmlElement(name = "KeyPath", required = true)
    protected String keyPath;

    /**
     * Gets the value of the methods property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMethods }
     *     
     */
    public ArrayOfMethods getMethods() {
        return methods;
    }

    /**
     * Sets the value of the methods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMethods }
     *     
     */
    public void setMethods(ArrayOfMethods value) {
        this.methods = value;
    }

    /**
     * Gets the value of the keyPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyPath() {
        return keyPath;
    }

    /**
     * Sets the value of the keyPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyPath(String value) {
        this.keyPath = value;
    }

}
