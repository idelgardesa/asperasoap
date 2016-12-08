
package aspera.xml.iscptransfernet._2006._04.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChannelParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="DatagramSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="AutoDetectPathMTU" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelParametersType", propOrder = {
    "port",
    "datagramSize",
    "autoDetectPathMTU"
})
public class ChannelParametersType {

    @XmlElement(name = "Port")
    @XmlSchemaType(name = "unsignedShort")
    protected int port;
    @XmlElement(name = "DatagramSize")
    @XmlSchemaType(name = "unsignedInt")
    protected long datagramSize;
    @XmlElement(name = "AutoDetectPathMTU")
    protected boolean autoDetectPathMTU;

    /**
     * Gets the value of the port property.
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

    /**
     * Gets the value of the datagramSize property.
     * 
     */
    public long getDatagramSize() {
        return datagramSize;
    }

    /**
     * Sets the value of the datagramSize property.
     * 
     */
    public void setDatagramSize(long value) {
        this.datagramSize = value;
    }

    /**
     * Gets the value of the autoDetectPathMTU property.
     * 
     */
    public boolean isAutoDetectPathMTU() {
        return autoDetectPathMTU;
    }

    /**
     * Sets the value of the autoDetectPathMTU property.
     * 
     */
    public void setAutoDetectPathMTU(boolean value) {
        this.autoDetectPathMTU = value;
    }

}
