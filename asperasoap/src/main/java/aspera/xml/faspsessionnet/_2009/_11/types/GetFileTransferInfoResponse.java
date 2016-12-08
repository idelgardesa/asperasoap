
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
 *         &lt;element name="FileTransferInfoResult" type="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}FileTransferInfoResult"/>
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
    "fileTransferInfoResult"
})
@XmlRootElement(name = "GetFileTransferInfoResponse")
public class GetFileTransferInfoResponse {

    @XmlElement(name = "FileTransferInfoResult", required = true)
    protected FileTransferInfoResult fileTransferInfoResult;

    /**
     * Gets the value of the fileTransferInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link FileTransferInfoResult }
     *     
     */
    public FileTransferInfoResult getFileTransferInfoResult() {
        return fileTransferInfoResult;
    }

    /**
     * Sets the value of the fileTransferInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileTransferInfoResult }
     *     
     */
    public void setFileTransferInfoResult(FileTransferInfoResult value) {
        this.fileTransferInfoResult = value;
    }

}
