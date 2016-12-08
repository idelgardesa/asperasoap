
package aspera.xml.faspsessionnet._2006._01.types;

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
 *         &lt;element name="Aggregate" type="{urn:Aspera:XML:FASPSessionNET:2006/01:Types}AggregateStatisticsType"/>
 *         &lt;element name="File" type="{urn:Aspera:XML:FASPSessionNET:2006/01:Types}FileStatisticsType"/>
 *         &lt;element name="Network" type="{urn:Aspera:XML:FASPSessionNET:2006/01:Types}NetworkStatisticsType"/>
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
    "aggregate",
    "file",
    "network"
})
public class StatisticsType {

    @XmlElement(name = "Aggregate", required = true)
    protected AggregateStatisticsType aggregate;
    @XmlElement(name = "File", required = true)
    protected FileStatisticsType file;
    @XmlElement(name = "Network", required = true)
    protected NetworkStatisticsType network;

    /**
     * Gets the value of the aggregate property.
     * 
     * @return
     *     possible object is
     *     {@link AggregateStatisticsType }
     *     
     */
    public AggregateStatisticsType getAggregate() {
        return aggregate;
    }

    /**
     * Sets the value of the aggregate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregateStatisticsType }
     *     
     */
    public void setAggregate(AggregateStatisticsType value) {
        this.aggregate = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link FileStatisticsType }
     *     
     */
    public FileStatisticsType getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileStatisticsType }
     *     
     */
    public void setFile(FileStatisticsType value) {
        this.file = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkStatisticsType }
     *     
     */
    public NetworkStatisticsType getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkStatisticsType }
     *     
     */
    public void setNetwork(NetworkStatisticsType value) {
        this.network = value;
    }

}
