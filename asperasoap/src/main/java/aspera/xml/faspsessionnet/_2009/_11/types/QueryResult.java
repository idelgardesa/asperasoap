
package aspera.xml.faspsessionnet._2009._11.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="RemainingResultCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="IterationToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResult", propOrder = {
    "resultCount",
    "remainingResultCount",
    "iterationToken"
})
@XmlSeeAlso({
    FileTransferStatisticsResult.class,
    InfoResult.class,
    SessionInfoResult.class,
    FileTransferKeysResult.class,
    FileTransferInfoResult.class,
    SessionKeysResult.class,
    StatisticsResult.class,
    SessionStatisticsResult.class
})
public class QueryResult {

    @XmlElement(name = "ResultCount")
    @XmlSchemaType(name = "unsignedInt")
    protected long resultCount;
    @XmlElement(name = "RemainingResultCount")
    @XmlSchemaType(name = "unsignedInt")
    protected long remainingResultCount;
    @XmlElement(name = "IterationToken", required = true)
    protected String iterationToken;

    /**
     * Gets the value of the resultCount property.
     * 
     */
    public long getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     */
    public void setResultCount(long value) {
        this.resultCount = value;
    }

    /**
     * Gets the value of the remainingResultCount property.
     * 
     */
    public long getRemainingResultCount() {
        return remainingResultCount;
    }

    /**
     * Sets the value of the remainingResultCount property.
     * 
     */
    public void setRemainingResultCount(long value) {
        this.remainingResultCount = value;
    }

    /**
     * Gets the value of the iterationToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterationToken() {
        return iterationToken;
    }

    /**
     * Sets the value of the iterationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterationToken(String value) {
        this.iterationToken = value;
    }

}
