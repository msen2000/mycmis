//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.25 at 02:23:02 PM PDT 
//


package org.delta.b2b.edi.t837;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify identifying information
 * 
 * <p>Java class for S-REF-Other_Payer_Service_Facility_Location_Secondary_Identification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S-REF-Other_Payer_Service_Facility_Location_Secondary_Identification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-REF01-Reference_Identification_Qualifier" type="{http://www.delta.org/b2b/edi/t837}E-REF01-Reference_Identification_Qualifier_19"/>
 *         &lt;element name="E-REF02-Reference_Identification" type="{http://www.delta.org/b2b/edi/t837}E-REF02-Reference_Identification"/>
 *         &lt;element name="E-REF03-Description" type="{http://www.delta.org/b2b/edi/t837}E-REF03-Description" minOccurs="0"/>
 *         &lt;element name="C-C040-Reference_Identifier" type="{http://www.delta.org/b2b/edi/t837}C-C040-Reference_Identifier" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="REF" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Other Payer Service Facility Location Secondary Identification" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S-REF-Other_Payer_Service_Facility_Location_Secondary_Identification", propOrder = {
    "eref01ReferenceIdentificationQualifier",
    "eref02ReferenceIdentification",
    "eref03Description",
    "cc040ReferenceIdentifier"
})
public class SREFOtherPayerServiceFacilityLocationSecondaryIdentification {

    @XmlElement(name = "E-REF01-Reference_Identification_Qualifier", required = true)
    protected EREF01ReferenceIdentificationQualifier19 eref01ReferenceIdentificationQualifier;
    @XmlElement(name = "E-REF02-Reference_Identification", required = true)
    protected EREF02ReferenceIdentification eref02ReferenceIdentification;
    @XmlElementRef(name = "E-REF03-Description", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EREF03Description> eref03Description;
    @XmlElementRef(name = "C-C040-Reference_Identifier", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<CC040ReferenceIdentifier> cc040ReferenceIdentifier;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the eref01ReferenceIdentificationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link EREF01ReferenceIdentificationQualifier19 }
     *     
     */
    public EREF01ReferenceIdentificationQualifier19 getEREF01ReferenceIdentificationQualifier() {
        return eref01ReferenceIdentificationQualifier;
    }

    /**
     * Sets the value of the eref01ReferenceIdentificationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EREF01ReferenceIdentificationQualifier19 }
     *     
     */
    public void setEREF01ReferenceIdentificationQualifier(EREF01ReferenceIdentificationQualifier19 value) {
        this.eref01ReferenceIdentificationQualifier = value;
    }

    /**
     * Gets the value of the eref02ReferenceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EREF02ReferenceIdentification }
     *     
     */
    public EREF02ReferenceIdentification getEREF02ReferenceIdentification() {
        return eref02ReferenceIdentification;
    }

    /**
     * Sets the value of the eref02ReferenceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EREF02ReferenceIdentification }
     *     
     */
    public void setEREF02ReferenceIdentification(EREF02ReferenceIdentification value) {
        this.eref02ReferenceIdentification = value;
    }

    /**
     * Gets the value of the eref03Description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EREF03Description }{@code >}
     *     
     */
    public JAXBElement<EREF03Description> getEREF03Description() {
        return eref03Description;
    }

    /**
     * Sets the value of the eref03Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EREF03Description }{@code >}
     *     
     */
    public void setEREF03Description(JAXBElement<EREF03Description> value) {
        this.eref03Description = ((JAXBElement<EREF03Description> ) value);
    }

    /**
     * Gets the value of the cc040ReferenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CC040ReferenceIdentifier }{@code >}
     *     
     */
    public JAXBElement<CC040ReferenceIdentifier> getCC040ReferenceIdentifier() {
        return cc040ReferenceIdentifier;
    }

    /**
     * Sets the value of the cc040ReferenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CC040ReferenceIdentifier }{@code >}
     *     
     */
    public void setCC040ReferenceIdentifier(JAXBElement<CC040ReferenceIdentifier> value) {
        this.cc040ReferenceIdentifier = ((JAXBElement<CC040ReferenceIdentifier> ) value);
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
            return "REF";
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
            return "Other Payer Service Facility Location Secondary Identification";
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
