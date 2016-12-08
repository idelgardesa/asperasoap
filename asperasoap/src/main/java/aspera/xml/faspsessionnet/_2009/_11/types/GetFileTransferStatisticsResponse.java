
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
 *         &lt;element name="FileTransferStatisticsResult" type="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}FileTransferStatisticsResult"/>
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
    "fileTransferStatisticsResult"
})
@XmlRootElement(name = "GetFileTransferStatisticsResponse")
public class GetFileTransferStatisticsResponse {

    @XmlElement(name = "FileTransferStatisticsResult", required = true)
    protected FileTransferStatisticsResult fileTransferStatisticsResult;

    /**
     * Gets the value of the fileTransferStatisticsResult property.
     * 
     * @return
     *     possible object is
     *     {@link FileTransferStatisticsResult }
     *     
     */
    public FileTransferStatisticsResult getFileTransferStatisticsResult() {
        return fileTransferStatisticsResult;
    }

    /**
     * Sets the value of the fileTransferStatisticsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileTransferStatisticsResult }
     *     
     */
    public void setFileTransferStatisticsResult(FileTransferStatisticsResult value) {
        this.fileTransferStatisticsResult = value;
    }

}
