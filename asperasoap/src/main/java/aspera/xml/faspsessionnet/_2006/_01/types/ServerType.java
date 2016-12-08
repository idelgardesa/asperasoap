
package aspera.xml.faspsessionnet._2006._01.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Endpoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SSHPort" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="FASPPort" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerType", propOrder = {
    "endpoint",
    "address",
    "sshPort",
    "faspPort",
    "user"
})
public class ServerType {

    @XmlElement(name = "Endpoint", required = true)
    protected String endpoint;
    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "SSHPort")
    @XmlSchemaType(name = "unsignedShort")
    protected int sshPort;
    @XmlElement(name = "FASPPort")
    @XmlSchemaType(name = "unsignedShort")
    protected int faspPort;
    @XmlElement(name = "User", required = true)
    protected String user;

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndpoint(String value) {
        this.endpoint = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the sshPort property.
     * 
     */
    public int getSSHPort() {
        return sshPort;
    }

    /**
     * Sets the value of the sshPort property.
     * 
     */
    public void setSSHPort(int value) {
        this.sshPort = value;
    }

    /**
     * Gets the value of the faspPort property.
     * 
     */
    public int getFASPPort() {
        return faspPort;
    }

    /**
     * Sets the value of the faspPort property.
     * 
     */
    public void setFASPPort(int value) {
        this.faspPort = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

}
