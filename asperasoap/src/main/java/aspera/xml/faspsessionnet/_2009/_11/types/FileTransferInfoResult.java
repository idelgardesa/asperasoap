
package aspera.xml.faspsessionnet._2009._11.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileTransferInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileTransferInfoResult">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}QueryResult">
 *       &lt;sequence>
 *         &lt;element name="FileTransferInfo" type="{urn:Aspera:XML:FASPSessionNET:2009/11:Types}FileTransferInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileTransferInfoResult", propOrder = {
    "fileTransferInfo"
})
public class FileTransferInfoResult
    extends QueryResult
{

    @XmlElement(name = "FileTransferInfo")
    protected List<FileTransferInfo> fileTransferInfo;

    /**
     * Gets the value of the fileTransferInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileTransferInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileTransferInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileTransferInfo }
     * 
     * 
     */
    public List<FileTransferInfo> getFileTransferInfo() {
        if (fileTransferInfo == null) {
            fileTransferInfo = new ArrayList<FileTransferInfo>();
        }
        return this.fileTransferInfo;
    }

}
