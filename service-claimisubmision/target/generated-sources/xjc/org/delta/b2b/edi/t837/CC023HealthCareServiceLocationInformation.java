//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.25 at 02:23:02 PM PDT 
//


package org.delta.b2b.edi.t837;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide information that identifies the place of service or the type of bill related to the location at which a health care service was rendered 
 * 
 * <p>Java class for C-C023-Health_Care_Service_Location_Information complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C-C023-Health_Care_Service_Location_Information">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-CLM01-Facility_Code_Value" type="{http://www.delta.org/b2b/edi/t837}E-CLM01-Facility_Code_Value"/>
 *         &lt;element name="E-CLM02-Facility_Code_Qualifier" type="{http://www.delta.org/b2b/edi/t837}E-CLM02-Facility_Code_Qualifier"/>
 *         &lt;element name="E-CLM03-Claim_Frequency_Type_Code" type="{http://www.delta.org/b2b/edi/t837}E-CLM03-Claim_Frequency_Type_Code"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="C023" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Health Care Service Location Information" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Composite" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C-C023-Health_Care_Service_Location_Information", propOrder = {
    "eclm01FacilityCodeValue",
    "eclm02FacilityCodeQualifier",
    "eclm03ClaimFrequencyTypeCode"
})
public class CC023HealthCareServiceLocationInformation {

    @XmlElement(name = "E-CLM01-Facility_Code_Value", required = true)
    protected ECLM01FacilityCodeValue eclm01FacilityCodeValue;
    @XmlElement(name = "E-CLM02-Facility_Code_Qualifier", required = true)
    protected ECLM02FacilityCodeQualifier eclm02FacilityCodeQualifier;
    @XmlElement(name = "E-CLM03-Claim_Frequency_Type_Code", required = true)
    protected ECLM03ClaimFrequencyTypeCode eclm03ClaimFrequencyTypeCode;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the eclm01FacilityCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link ECLM01FacilityCodeValue }
     *     
     */
    public ECLM01FacilityCodeValue getECLM01FacilityCodeValue() {
        return eclm01FacilityCodeValue;
    }

    /**
     * Sets the value of the eclm01FacilityCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECLM01FacilityCodeValue }
     *     
     */
    public void setECLM01FacilityCodeValue(ECLM01FacilityCodeValue value) {
        this.eclm01FacilityCodeValue = value;
    }

    /**
     * Gets the value of the eclm02FacilityCodeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link ECLM02FacilityCodeQualifier }
     *     
     */
    public ECLM02FacilityCodeQualifier getECLM02FacilityCodeQualifier() {
        return eclm02FacilityCodeQualifier;
    }

    /**
     * Sets the value of the eclm02FacilityCodeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECLM02FacilityCodeQualifier }
     *     
     */
    public void setECLM02FacilityCodeQualifier(ECLM02FacilityCodeQualifier value) {
        this.eclm02FacilityCodeQualifier = value;
    }

    /**
     * Gets the value of the eclm03ClaimFrequencyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ECLM03ClaimFrequencyTypeCode }
     *     
     */
    public ECLM03ClaimFrequencyTypeCode getECLM03ClaimFrequencyTypeCode() {
        return eclm03ClaimFrequencyTypeCode;
    }

    /**
     * Sets the value of the eclm03ClaimFrequencyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECLM03ClaimFrequencyTypeCode }
     *     
     */
    public void setECLM03ClaimFrequencyTypeCode(ECLM03ClaimFrequencyTypeCode value) {
        this.eclm03ClaimFrequencyTypeCode = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        if (id == null) {
            return "C023";
        } else {
            return id;
        }
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        if (name == null) {
            return "Health Care Service Location Information";
        } else {
            return name;
        }
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "Composite";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
