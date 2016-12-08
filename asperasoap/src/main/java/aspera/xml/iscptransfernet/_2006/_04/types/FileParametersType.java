
package aspera.xml.iscptransfernet._2006._04.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreatePath" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ResumeCheck" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileParametersType", propOrder = {
    "createPath",
    "resumeCheck"
})
public class FileParametersType {

    @XmlElement(name = "CreatePath")
    protected boolean createPath;
    @XmlElement(name = "ResumeCheck", required = true)
    protected String resumeCheck;

    /**
     * Gets the value of the createPath property.
     * 
     */
    public boolean isCreatePath() {
        return createPath;
    }

    /**
     * Sets the value of the createPath property.
     * 
     */
    public void setCreatePath(boolean value) {
        this.createPath = value;
    }

    /**
     * Gets the value of the resumeCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResumeCheck() {
        return resumeCheck;
    }

    /**
     * Sets the value of the resumeCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResumeCheck(String value) {
        this.resumeCheck = value;
    }

}
