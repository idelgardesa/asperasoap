
package aspera.xml.faspsessionnet._2009._11.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FileTransferFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileTransferFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}SessionFilter">
 *       &lt;sequence>
 *         &lt;element name="TransferId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransferStatus" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Filepath" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FilenameFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinTransferStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MaxTransferStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MinTransferEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MaxTransferEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileTransferFilter", propOrder = {
    "transferId",
    "transferStatus",
    "filepath",
    "filenameFilter",
    "minTransferStartDate",
    "maxTransferStartDate",
    "minTransferEndDate",
    "maxTransferEndDate"
})
public class FileTransferFilter
    extends SessionFilter
{

    @XmlElement(name = "TransferId", type = Long.class)
    protected List<Long> transferId;
    @XmlElement(name = "TransferStatus")
    protected List<String> transferStatus;
    @XmlElement(name = "Filepath")
    protected List<String> filepath;
    @XmlElement(name = "FilenameFilter")
    protected String filenameFilter;
    @XmlElement(name = "MinTransferStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minTransferStartDate;
    @XmlElement(name = "MaxTransferStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxTransferStartDate;
    @XmlElement(name = "MinTransferEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minTransferEndDate;
    @XmlElement(name = "MaxTransferEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxTransferEndDate;

    /**
     * Gets the value of the transferId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getTransferId() {
        if (transferId == null) {
            transferId = new ArrayList<Long>();
        }
        return this.transferId;
    }

    /**
     * Gets the value of the transferStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransferStatus() {
        if (transferStatus == null) {
            transferStatus = new ArrayList<String>();
        }
        return this.transferStatus;
    }

    /**
     * Gets the value of the filepath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filepath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilepath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFilepath() {
        if (filepath == null) {
            filepath = new ArrayList<String>();
        }
        return this.filepath;
    }

    /**
     * Gets the value of the filenameFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilenameFilter() {
        return filenameFilter;
    }

    /**
     * Sets the value of the filenameFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilenameFilter(String value) {
        this.filenameFilter = value;
    }

    /**
     * Gets the value of the minTransferStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinTransferStartDate() {
        return minTransferStartDate;
    }

    /**
     * Sets the value of the minTransferStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinTransferStartDate(XMLGregorianCalendar value) {
        this.minTransferStartDate = value;
    }

    /**
     * Gets the value of the maxTransferStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxTransferStartDate() {
        return maxTransferStartDate;
    }

    /**
     * Sets the value of the maxTransferStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxTransferStartDate(XMLGregorianCalendar value) {
        this.maxTransferStartDate = value;
    }

    /**
     * Gets the value of the minTransferEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinTransferEndDate() {
        return minTransferEndDate;
    }

    /**
     * Sets the value of the minTransferEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinTransferEndDate(XMLGregorianCalendar value) {
        this.minTransferEndDate = value;
    }

    /**
     * Gets the value of the maxTransferEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxTransferEndDate() {
        return maxTransferEndDate;
    }

    /**
     * Sets the value of the maxTransferEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxTransferEndDate(XMLGregorianCalendar value) {
        this.maxTransferEndDate = value;
    }

}
