
package aspera.xml.faspsessionnet._2009._11.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileTransferFilter" type="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}FileTransferFilter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fileTransferFilter"
})
@XmlRootElement(name = "GetInfoRequest")
public class GetInfoRequest {

    @XmlElement(name = "FileTransferFilter", required = true)
    protected FileTransferFilter fileTransferFilter;

    /**
     * Gets the value of the fileTransferFilter property.
     * 
     * @return
     *     possible object is
     *     {@link FileTransferFilter }
     *     
     */
    public FileTransferFilter getFileTransferFilter() {
        return fileTransferFilter;
    }

    /**
     * Sets the value of the fileTransferFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileTransferFilter }
     *     
     */
    public void setFileTransferFilter(FileTransferFilter value) {
        this.fileTransferFilter = value;
    }

}
