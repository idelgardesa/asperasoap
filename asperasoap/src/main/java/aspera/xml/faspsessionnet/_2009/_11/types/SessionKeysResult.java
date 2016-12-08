
package aspera.xml.faspsessionnet._2009._11.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionKeysResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionKeysResult">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}QueryResult">
 *       &lt;sequence>
 *         &lt;element name="SessionKey" type="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}SessionKey" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionKeysResult", propOrder = {
    "sessionKey"
})
public class SessionKeysResult
    extends QueryResult
{

    @XmlElement(name = "SessionKey")
    protected List<SessionKey> sessionKey;

    /**
     * Gets the value of the sessionKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessionKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessionKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SessionKey }
     * 
     * 
     */
    public List<SessionKey> getSessionKey() {
        if (sessionKey == null) {
            sessionKey = new ArrayList<SessionKey>();
        }
        return this.sessionKey;
    }

}
