//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.03 at 11:47:13 AM PDT 
//


package org.delta.b2b.edi.t271;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the identifying characteristics of a provider
 * 
 * <p>Java class for S-PRV-Provider_Information complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S-PRV-Provider_Information">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-PRV01-Provider_Code" type="{http://www.delta.org/b2b/edi/t271}E-PRV01-Provider_Code_1"/>
 *         &lt;element name="E-PRV02-Reference_Identification_Qualifier" type="{http://www.delta.org/b2b/edi/t271}E-PRV02-Reference_Identification_Qualifier" minOccurs="0"/>
 *         &lt;element name="E-PRV03-Reference_Identification" type="{http://www.delta.org/b2b/edi/t271}E-PRV03-Reference_Identification" minOccurs="0"/>
 *         &lt;element name="E-PRV04-State_or_Province_Code" type="{http://www.delta.org/b2b/edi/t271}E-PRV04-State_or_Province_Code" minOccurs="0"/>
 *         &lt;element name="C-C035-Provider_Specialty_Information" type="{http://www.delta.org/b2b/edi/t271}C-C035-Provider_Specialty_Information" minOccurs="0"/>
 *         &lt;element name="E-PRV06-Provider_Organization_Code" type="{http://www.delta.org/b2b/edi/t271}E-PRV06-Provider_Organization_Code" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="PRV" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Provider Information" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S-PRV-Provider_Information", propOrder = {
    "eprv01ProviderCode",
    "eprv02ReferenceIdentificationQualifier",
    "eprv03ReferenceIdentification",
    "eprv04StateOrProvinceCode",
    "cc035ProviderSpecialtyInformation",
    "eprv06ProviderOrganizationCode"
})
public class SPRVProviderInformation {

    @XmlElement(name = "E-PRV01-Provider_Code", required = true)
    protected EPRV01ProviderCode1 eprv01ProviderCode;
    @XmlElementRef(name = "E-PRV02-Reference_Identification_Qualifier", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EPRV02ReferenceIdentificationQualifier> eprv02ReferenceIdentificationQualifier;
    @XmlElementRef(name = "E-PRV03-Reference_Identification", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EPRV03ReferenceIdentification> eprv03ReferenceIdentification;
    @XmlElementRef(name = "E-PRV04-State_or_Province_Code", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EPRV04StateOrProvinceCode> eprv04StateOrProvinceCode;
    @XmlElementRef(name = "C-C035-Provider_Specialty_Information", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<CC035ProviderSpecialtyInformation> cc035ProviderSpecialtyInformation;
    @XmlElementRef(name = "E-PRV06-Provider_Organization_Code", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EPRV06ProviderOrganizationCode> eprv06ProviderOrganizationCode;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the eprv01ProviderCode property.
     * 
     * @return
     *     possible object is
     *     {@link EPRV01ProviderCode1 }
     *     
     */
    public EPRV01ProviderCode1 getEPRV01ProviderCode() {
        return eprv01ProviderCode;
    }

    /**
     * Sets the value of the eprv01ProviderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPRV01ProviderCode1 }
     *     
     */
    public void setEPRV01ProviderCode(EPRV01ProviderCode1 value) {
        this.eprv01ProviderCode = value;
    }

    /**
     * Gets the value of the eprv02ReferenceIdentificationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EPRV02ReferenceIdentificationQualifier }{@code >}
     *     
     */
    public JAXBElement<EPRV02ReferenceIdentificationQualifier> getEPRV02ReferenceIdentificationQualifier() {
        return eprv02ReferenceIdentificationQualifier;
    }

    /**
     * Sets the value of the eprv02ReferenceIdentificationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EPRV02ReferenceIdentificationQualifier }{@code >}
     *     
     */
    public void setEPRV02ReferenceIdentificationQualifier(JAXBElement<EPRV02ReferenceIdentificationQualifier> value) {
        this.eprv02ReferenceIdentificationQualifier = ((JAXBElement<EPRV02ReferenceIdentificationQualifier> ) value);
    }

    /**
     * Gets the value of the eprv03ReferenceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EPRV03ReferenceIdentification }{@code >}
     *     
     */
    public JAXBElement<EPRV03ReferenceIdentification> getEPRV03ReferenceIdentification() {
        return eprv03ReferenceIdentification;
    }

    /**
     * Sets the value of the eprv03ReferenceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EPRV03ReferenceIdentification }{@code >}
     *     
     */
    public void setEPRV03ReferenceIdentification(JAXBElement<EPRV03ReferenceIdentification> value) {
        this.eprv03ReferenceIdentification = ((JAXBElement<EPRV03ReferenceIdentification> ) value);
    }

    /**
     * Gets the value of the eprv04StateOrProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EPRV04StateOrProvinceCode }{@code >}
     *     
     */
    public JAXBElement<EPRV04StateOrProvinceCode> getEPRV04StateOrProvinceCode() {
        return eprv04StateOrProvinceCode;
    }

    /**
     * Sets the value of the eprv04StateOrProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EPRV04StateOrProvinceCode }{@code >}
     *     
     */
    public void setEPRV04StateOrProvinceCode(JAXBElement<EPRV04StateOrProvinceCode> value) {
        this.eprv04StateOrProvinceCode = ((JAXBElement<EPRV04StateOrProvinceCode> ) value);
    }

    /**
     * Gets the value of the cc035ProviderSpecialtyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CC035ProviderSpecialtyInformation }{@code >}
     *     
     */
    public JAXBElement<CC035ProviderSpecialtyInformation> getCC035ProviderSpecialtyInformation() {
        return cc035ProviderSpecialtyInformation;
    }

    /**
     * Sets the value of the cc035ProviderSpecialtyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CC035ProviderSpecialtyInformation }{@code >}
     *     
     */
    public void setCC035ProviderSpecialtyInformation(JAXBElement<CC035ProviderSpecialtyInformation> value) {
        this.cc035ProviderSpecialtyInformation = ((JAXBElement<CC035ProviderSpecialtyInformation> ) value);
    }

    /**
     * Gets the value of the eprv06ProviderOrganizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EPRV06ProviderOrganizationCode }{@code >}
     *     
     */
    public JAXBElement<EPRV06ProviderOrganizationCode> getEPRV06ProviderOrganizationCode() {
        return eprv06ProviderOrganizationCode;
    }

    /**
     * Sets the value of the eprv06ProviderOrganizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EPRV06ProviderOrganizationCode }{@code >}
     *     
     */
    public void setEPRV06ProviderOrganizationCode(JAXBElement<EPRV06ProviderOrganizationCode> value) {
        this.eprv06ProviderOrganizationCode = ((JAXBElement<EPRV06ProviderOrganizationCode> ) value);
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
            return "PRV";
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
            return "Provider Information";
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
