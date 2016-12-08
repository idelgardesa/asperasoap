
package aspera.xml.faspsessionnet._2009._11.types;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SessionFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IterationToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxResults" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="SessionUUID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SessionStatus" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ServerAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ClientAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Cookie" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CookieFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinSessionStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MaxSessionStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MinSessionEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MaxSessionEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PrivateKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LastSessionOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionFilter", propOrder = {
    "iterationToken",
    "maxResults",
    "sessionUUID",
    "sessionStatus",
    "serverAddress",
    "clientAddress",
    "cookie",
    "cookieFilter",
    "jobId",
    "direction",
    "minSessionStartDate",
    "maxSessionStartDate",
    "minSessionEndDate",
    "maxSessionEndDate",
    "privateKey",
    "lastSessionOnly",
    "user"
})
@XmlSeeAlso({
    FileTransferFilter.class
})
public class SessionFilter {

    @XmlElement(name = "IterationToken")
    protected String iterationToken;
    @XmlElement(name = "MaxResults")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxResults;
    @XmlElement(name = "SessionUUID")
    protected List<String> sessionUUID;
    @XmlElement(name = "SessionStatus")
    protected List<String> sessionStatus;
    @XmlElement(name = "ServerAddress")
    protected List<String> serverAddress;
    @XmlElement(name = "ClientAddress")
    protected List<String> clientAddress;
    @XmlElement(name = "Cookie")
    protected List<String> cookie;
    @XmlElement(name = "CookieFilter")
    protected String cookieFilter;
    @XmlElement(name = "JobId")
    protected List<String> jobId;
    @XmlElement(name = "Direction")
    protected String direction;
    @XmlElement(name = "MinSessionStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minSessionStartDate;
    @XmlElement(name = "MaxSessionStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxSessionStartDate;
    @XmlElement(name = "MinSessionEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minSessionEndDate;
    @XmlElement(name = "MaxSessionEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxSessionEndDate;
    @XmlElement(name = "PrivateKey")
    protected List<String> privateKey;
    @XmlElement(name = "LastSessionOnly")
    protected Boolean lastSessionOnly;
    @XmlElement(name = "User")
    protected List<String> user;

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

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxResults(BigInteger value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the sessionUUID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessionUUID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessionUUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSessionUUID() {
        if (sessionUUID == null) {
            sessionUUID = new ArrayList<String>();
        }
        return this.sessionUUID;
    }

    /**
     * Gets the value of the sessionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSessionStatus() {
        if (sessionStatus == null) {
            sessionStatus = new ArrayList<String>();
        }
        return this.sessionStatus;
    }

    /**
     * Gets the value of the serverAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServerAddress() {
        if (serverAddress == null) {
            serverAddress = new ArrayList<String>();
        }
        return this.serverAddress;
    }

    /**
     * Gets the value of the clientAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClientAddress() {
        if (clientAddress == null) {
            clientAddress = new ArrayList<String>();
        }
        return this.clientAddress;
    }

    /**
     * Gets the value of the cookie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cookie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCookie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCookie() {
        if (cookie == null) {
            cookie = new ArrayList<String>();
        }
        return this.cookie;
    }

    /**
     * Gets the value of the cookieFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCookieFilter() {
        return cookieFilter;
    }

    /**
     * Sets the value of the cookieFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCookieFilter(String value) {
        this.cookieFilter = value;
    }

    /**
     * Gets the value of the jobId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getJobId() {
        if (jobId == null) {
            jobId = new ArrayList<String>();
        }
        return this.jobId;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the minSessionStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinSessionStartDate() {
        return minSessionStartDate;
    }

    /**
     * Sets the value of the minSessionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinSessionStartDate(XMLGregorianCalendar value) {
        this.minSessionStartDate = value;
    }

    /**
     * Gets the value of the maxSessionStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxSessionStartDate() {
        return maxSessionStartDate;
    }

    /**
     * Sets the value of the maxSessionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxSessionStartDate(XMLGregorianCalendar value) {
        this.maxSessionStartDate = value;
    }

    /**
     * Gets the value of the minSessionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinSessionEndDate() {
        return minSessionEndDate;
    }

    /**
     * Sets the value of the minSessionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinSessionEndDate(XMLGregorianCalendar value) {
        this.minSessionEndDate = value;
    }

    /**
     * Gets the value of the maxSessionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxSessionEndDate() {
        return maxSessionEndDate;
    }

    /**
     * Sets the value of the maxSessionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxSessionEndDate(XMLGregorianCalendar value) {
        this.maxSessionEndDate = value;
    }

    /**
     * Gets the value of the privateKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privateKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivateKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrivateKey() {
        if (privateKey == null) {
            privateKey = new ArrayList<String>();
        }
        return this.privateKey;
    }

    /**
     * Gets the value of the lastSessionOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastSessionOnly() {
        return lastSessionOnly;
    }

    /**
     * Sets the value of the lastSessionOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastSessionOnly(Boolean value) {
        this.lastSessionOnly = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the user property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUser() {
        if (user == null) {
            user = new ArrayList<String>();
        }
        return this.user;
    }

}
