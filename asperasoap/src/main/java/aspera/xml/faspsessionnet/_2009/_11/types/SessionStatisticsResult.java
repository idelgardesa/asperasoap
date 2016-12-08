
package aspera.xml.faspsessionnet._2009._11.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionStatisticsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionStatisticsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}QueryResult">
 *       &lt;sequence>
 *         &lt;element name="SessionStatistics" type="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}SessionStatistics" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionStatisticsResult", propOrder = {
    "sessionStatistics"
})
public class SessionStatisticsResult
    extends QueryResult
{

    @XmlElement(name = "SessionStatistics")
    protected List<SessionStatistics> sessionStatistics;

    /**
     * Gets the value of the sessionStatistics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessionStatistics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessionStatistics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SessionStatistics }
     * 
     * 
     */
    public List<SessionStatistics> getSessionStatistics() {
        if (sessionStatistics == null) {
            sessionStatistics = new ArrayList<SessionStatistics>();
        }
        return this.sessionStatistics;
    }

}
