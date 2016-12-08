
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
 *         &lt;element name="FileTransferKeysResult" type="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}FileTransferKeysResult"/>
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
    "fileTransferKeysResult"
})
@XmlRootElement(name = "GetFileTransfersResponse")
public class GetFileTransfersResponse {

    @XmlElement(name = "FileTransferKeysResult", required = true)
    protected FileTransferKeysResult fileTransferKeysResult;

    /**
     * Gets the value of the fileTransferKeysResult property.
     * 
     * @return
     *     possible object is
     *     {@link FileTransferKeysResult }
     *     
     */
    public FileTransferKeysResult getFileTransferKeysResult() {
        return fileTransferKeysResult;
    }

    /**
     * Sets the value of the fileTransferKeysResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileTransferKeysResult }
     *     
     */
    public void setFileTransferKeysResult(FileTransferKeysResult value) {
        this.fileTransferKeysResult = value;
    }

}
