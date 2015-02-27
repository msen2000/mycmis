//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.25 at 02:23:02 PM PDT 
//


package org.delta.b2b.edi.t837;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To supply demographic information
 * 
 * <p>Java class for S-DMG-Patient_Demographic_Information complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S-DMG-Patient_Demographic_Information">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-DMG01-Date_Time_Period_Format_Qualifier" type="{http://www.delta.org/b2b/edi/t837}E-DMG01-Date_Time_Period_Format_Qualifier"/>
 *         &lt;element name="E-DMG02-Date_Time_Period" type="{http://www.delta.org/b2b/edi/t837}E-DMG02-Date_Time_Period"/>
 *         &lt;element name="E-DMG03-Gender_Code" type="{http://www.delta.org/b2b/edi/t837}E-DMG03-Gender_Code"/>
 *         &lt;element name="E-DMG04-Marital_Status_Code" type="{http://www.delta.org/b2b/edi/t837}E-DMG04-Marital_Status_Code" minOccurs="0"/>
 *         &lt;element name="C-C056-Composite_Race_or_Ethnicity_Information" type="{http://www.delta.org/b2b/edi/t837}C-C056-Composite_Race_or_Ethnicity_Information" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="E-DMG06-Citizenship_Status_Code" type="{http://www.delta.org/b2b/edi/t837}E-DMG06-Citizenship_Status_Code" minOccurs="0"/>
 *         &lt;element name="E-DMG07-Country_Code" type="{http://www.delta.org/b2b/edi/t837}E-DMG07-Country_Code" minOccurs="0"/>
 *         &lt;element name="E-DMG08-Basis_of_Verification_Code" type="{http://www.delta.org/b2b/edi/t837}E-DMG08-Basis_of_Verification_Code" minOccurs="0"/>
 *         &lt;element name="E-DMG09-Quantity" type="{http://www.delta.org/b2b/edi/t837}E-DMG09-Quantity" minOccurs="0"/>
 *         &lt;element name="E-DMG10-Code_List_Qualifier_Code" type="{http://www.delta.org/b2b/edi/t837}E-DMG10-Code_List_Qualifier_Code" minOccurs="0"/>
 *         &lt;element name="E-DMG11-Industry_Code" type="{http://www.delta.org/b2b/edi/t837}E-DMG11-Industry_Code" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="DMG" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Patient Demographic Information" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S-DMG-Patient_Demographic_Information", propOrder = {
    "edmg01DateTimePeriodFormatQualifier",
    "edmg02DateTimePeriod",
    "edmg03GenderCode",
    "edmg04MaritalStatusCode",
    "cc056CompositeRaceOrEthnicityInformation",
    "edmg06CitizenshipStatusCode",
    "edmg07CountryCode",
    "edmg08BasisOfVerificationCode",
    "edmg09Quantity",
    "edmg10CodeListQualifierCode",
    "edmg11IndustryCode"
})
public class SDMGPatientDemographicInformation {

    @XmlElement(name = "E-DMG01-Date_Time_Period_Format_Qualifier", required = true)
    protected EDMG01DateTimePeriodFormatQualifier edmg01DateTimePeriodFormatQualifier;
    @XmlElement(name = "E-DMG02-Date_Time_Period", required = true)
    protected EDMG02DateTimePeriod edmg02DateTimePeriod;
    @XmlElement(name = "E-DMG03-Gender_Code", required = true)
    protected EDMG03GenderCode edmg03GenderCode;
    @XmlElementRef(name = "E-DMG04-Marital_Status_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EDMG04MaritalStatusCode> edmg04MaritalStatusCode;
    @XmlElement(name = "C-C056-Composite_Race_or_Ethnicity_Information", nillable = true)
    protected List<CC056CompositeRaceOrEthnicityInformation> cc056CompositeRaceOrEthnicityInformation;
    @XmlElementRef(name = "E-DMG06-Citizenship_Status_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EDMG06CitizenshipStatusCode> edmg06CitizenshipStatusCode;
    @XmlElementRef(name = "E-DMG07-Country_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EDMG07CountryCode> edmg07CountryCode;
    @XmlElementRef(name = "E-DMG08-Basis_of_Verification_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EDMG08BasisOfVerificationCode> edmg08BasisOfVerificationCode;
    @XmlElementRef(name = "E-DMG09-Quantity", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EDMG09Quantity> edmg09Quantity;
    @XmlElementRef(name = "E-DMG10-Code_List_Qualifier_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EDMG10CodeListQualifierCode> edmg10CodeListQualifierCode;
    @XmlElementRef(name = "E-DMG11-Industry_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EDMG11IndustryCode> edmg11IndustryCode;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the edmg01DateTimePeriodFormatQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link EDMG01DateTimePeriodFormatQualifier }
     *     
     */
    public EDMG01DateTimePeriodFormatQualifier getEDMG01DateTimePeriodFormatQualifier() {
        return edmg01DateTimePeriodFormatQualifier;
    }

    /**
     * Sets the value of the edmg01DateTimePeriodFormatQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDMG01DateTimePeriodFormatQualifier }
     *     
     */
    public void setEDMG01DateTimePeriodFormatQualifier(EDMG01DateTimePeriodFormatQualifier value) {
        this.edmg01DateTimePeriodFormatQualifier = value;
    }

    /**
     * Gets the value of the edmg02DateTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EDMG02DateTimePeriod }
     *     
     */
    public EDMG02DateTimePeriod getEDMG02DateTimePeriod() {
        return edmg02DateTimePeriod;
    }

    /**
     * Sets the value of the edmg02DateTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDMG02DateTimePeriod }
     *     
     */
    public void setEDMG02DateTimePeriod(EDMG02DateTimePeriod value) {
        this.edmg02DateTimePeriod = value;
    }

    /**
     * Gets the value of the edmg03GenderCode property.
     * 
     * @return
     *     possible object is
     *     {@link EDMG03GenderCode }
     *     
     */
    public EDMG03GenderCode getEDMG03GenderCode() {
        return edmg03GenderCode;
    }

    /**
     * Sets the value of the edmg03GenderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDMG03GenderCode }
     *     
     */
    public void setEDMG03GenderCode(EDMG03GenderCode value) {
        this.edmg03GenderCode = value;
    }

    /**
     * Gets the value of the edmg04MaritalStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EDMG04MaritalStatusCode }{@code >}
     *     
     */
    public JAXBElement<EDMG04MaritalStatusCode> getEDMG04MaritalStatusCode() {
        return edmg04MaritalStatusCode;
    }

    /**
     * Sets the value of the edmg04MaritalStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EDMG04MaritalStatusCode }{@code >}
     *     
     */
    public void setEDMG04MaritalStatusCode(JAXBElement<EDMG04MaritalStatusCode> value) {
        this.edmg04MaritalStatusCode = ((JAXBElement<EDMG04MaritalStatusCode> ) value);
    }

    /**
     * Gets the value of the cc056CompositeRaceOrEthnicityInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cc056CompositeRaceOrEthnicityInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCC056CompositeRaceOrEthnicityInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CC056CompositeRaceOrEthnicityInformation }
     * 
     * 
     */
    public List<CC056CompositeRaceOrEthnicityInformation> getCC056CompositeRaceOrEthnicityInformation() {
        if (cc056CompositeRaceOrEthnicityInformation == null) {
            cc056CompositeRaceOrEthnicityInformation = new ArrayList<CC056CompositeRaceOrEthnicityInformation>();
        }
        return this.cc056CompositeRaceOrEthnicityInformation;
    }

    /**
     * Gets the value of the edmg06CitizenshipStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EDMG06CitizenshipStatusCode }{@code >}
     *     
     */
    public JAXBElement<EDMG06CitizenshipStatusCode> getEDMG06CitizenshipStatusCode() {
        return edmg06CitizenshipStatusCode;
    }

    /**
     * Sets the value of the edmg06CitizenshipStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EDMG06CitizenshipStatusCode }{@code >}
     *     
     */
    public void setEDMG06CitizenshipStatusCode(JAXBElement<EDMG06CitizenshipStatusCode> value) {
        this.edmg06CitizenshipStatusCode = ((JAXBElement<EDMG06CitizenshipStatusCode> ) value);
    }

    /**
     * Gets the value of the edmg07CountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EDMG07CountryCode }{@code >}
     *     
     */
    public JAXBElement<EDMG07CountryCode> getEDMG07CountryCode() {
        return edmg07CountryCode;
    }

    /**
     * Sets the value of the edmg07CountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EDMG07CountryCode }{@code >}
     *     
     */
    public void setEDMG07CountryCode(JAXBElement<EDMG07CountryCode> value) {
        this.edmg07CountryCode = ((JAXBElement<EDMG07CountryCode> ) value);
    }

    /**
     * Gets the value of the edmg08BasisOfVerificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EDMG08BasisOfVerificationCode }{@code >}
     *     
     */
    public JAXBElement<EDMG08BasisOfVerificationCode> getEDMG08BasisOfVerificationCode() {
        return edmg08BasisOfVerificationCode;
    }

    /**
     * Sets the value of the edmg08BasisOfVerificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EDMG08BasisOfVerificationCode }{@code >}
     *     
     */
    public void setEDMG08BasisOfVerificationCode(JAXBElement<EDMG08BasisOfVerificationCode> value) {
        this.edmg08BasisOfVerificationCode = ((JAXBElement<EDMG08BasisOfVerificationCode> ) value);
    }

    /**
     * Gets the value of the edmg09Quantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EDMG09Quantity }{@code >}
     *     
     */
    public JAXBElement<EDMG09Quantity> getEDMG09Quantity() {
        return edmg09Quantity;
    }

    /**
     * Sets the value of the edmg09Quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EDMG09Quantity }{@code >}
     *     
     */
    public void setEDMG09Quantity(JAXBElement<EDMG09Quantity> value) {
        this.edmg09Quantity = ((JAXBElement<EDMG09Quantity> ) value);
    }

    /**
     * Gets the value of the edmg10CodeListQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EDMG10CodeListQualifierCode }{@code >}
     *     
     */
    public JAXBElement<EDMG10CodeListQualifierCode> getEDMG10CodeListQualifierCode() {
        return edmg10CodeListQualifierCode;
    }

    /**
     * Sets the value of the edmg10CodeListQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EDMG10CodeListQualifierCode }{@code >}
     *     
     */
    public void setEDMG10CodeListQualifierCode(JAXBElement<EDMG10CodeListQualifierCode> value) {
        this.edmg10CodeListQualifierCode = ((JAXBElement<EDMG10CodeListQualifierCode> ) value);
    }

    /**
     * Gets the value of the edmg11IndustryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EDMG11IndustryCode }{@code >}
     *     
     */
    public JAXBElement<EDMG11IndustryCode> getEDMG11IndustryCode() {
        return edmg11IndustryCode;
    }

    /**
     * Sets the value of the edmg11IndustryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EDMG11IndustryCode }{@code >}
     *     
     */
    public void setEDMG11IndustryCode(JAXBElement<EDMG11IndustryCode> value) {
        this.edmg11IndustryCode = ((JAXBElement<EDMG11IndustryCode> ) value);
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
            return "DMG";
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
            return "Patient Demographic Information";
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
            return "Segment";
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
