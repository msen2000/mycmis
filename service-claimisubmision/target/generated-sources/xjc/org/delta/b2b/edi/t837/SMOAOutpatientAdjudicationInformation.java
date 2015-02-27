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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey claim-level data related to the adjudication of Medicare claims not related to an inpatient setting
 * 
 * <p>Java class for S-MOA-Outpatient_Adjudication_Information complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S-MOA-Outpatient_Adjudication_Information">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-MOA01-Percentage_as_Decimal" type="{http://www.delta.org/b2b/edi/t837}E-MOA01-Percentage_as_Decimal" minOccurs="0"/>
 *         &lt;element name="E-MOA02-Monetary_Amount" type="{http://www.delta.org/b2b/edi/t837}E-MOA02-Monetary_Amount" minOccurs="0"/>
 *         &lt;element name="E-MOA03-Reference_Identification" type="{http://www.delta.org/b2b/edi/t837}E-MOA03-Reference_Identification" minOccurs="0"/>
 *         &lt;element name="E-MOA04-Reference_Identification" type="{http://www.delta.org/b2b/edi/t837}E-MOA04-Reference_Identification" minOccurs="0"/>
 *         &lt;element name="E-MOA05-Reference_Identification" type="{http://www.delta.org/b2b/edi/t837}E-MOA05-Reference_Identification" minOccurs="0"/>
 *         &lt;element name="E-MOA06-Reference_Identification" type="{http://www.delta.org/b2b/edi/t837}E-MOA06-Reference_Identification" minOccurs="0"/>
 *         &lt;element name="E-MOA07-Reference_Identification" type="{http://www.delta.org/b2b/edi/t837}E-MOA07-Reference_Identification" minOccurs="0"/>
 *         &lt;element name="E-MOA08-Monetary_Amount" type="{http://www.delta.org/b2b/edi/t837}E-MOA08-Monetary_Amount" minOccurs="0"/>
 *         &lt;element name="E-MOA09-Monetary_Amount" type="{http://www.delta.org/b2b/edi/t837}E-MOA09-Monetary_Amount" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="MOA" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Outpatient Adjudication Information" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S-MOA-Outpatient_Adjudication_Information", propOrder = {
    "emoa01PercentageAsDecimal",
    "emoa02MonetaryAmount",
    "emoa03ReferenceIdentification",
    "emoa04ReferenceIdentification",
    "emoa05ReferenceIdentification",
    "emoa06ReferenceIdentification",
    "emoa07ReferenceIdentification",
    "emoa08MonetaryAmount",
    "emoa09MonetaryAmount"
})
public class SMOAOutpatientAdjudicationInformation {

    @XmlElementRef(name = "E-MOA01-Percentage_as_Decimal", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EMOA01PercentageAsDecimal> emoa01PercentageAsDecimal;
    @XmlElementRef(name = "E-MOA02-Monetary_Amount", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EMOA02MonetaryAmount> emoa02MonetaryAmount;
    @XmlElementRef(name = "E-MOA03-Reference_Identification", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EMOA03ReferenceIdentification> emoa03ReferenceIdentification;
    @XmlElementRef(name = "E-MOA04-Reference_Identification", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EMOA04ReferenceIdentification> emoa04ReferenceIdentification;
    @XmlElementRef(name = "E-MOA05-Reference_Identification", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EMOA05ReferenceIdentification> emoa05ReferenceIdentification;
    @XmlElementRef(name = "E-MOA06-Reference_Identification", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EMOA06ReferenceIdentification> emoa06ReferenceIdentification;
    @XmlElementRef(name = "E-MOA07-Reference_Identification", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EMOA07ReferenceIdentification> emoa07ReferenceIdentification;
    @XmlElementRef(name = "E-MOA08-Monetary_Amount", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EMOA08MonetaryAmount> emoa08MonetaryAmount;
    @XmlElementRef(name = "E-MOA09-Monetary_Amount", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<EMOA09MonetaryAmount> emoa09MonetaryAmount;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the emoa01PercentageAsDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EMOA01PercentageAsDecimal }{@code >}
     *     
     */
    public JAXBElement<EMOA01PercentageAsDecimal> getEMOA01PercentageAsDecimal() {
        return emoa01PercentageAsDecimal;
    }

    /**
     * Sets the value of the emoa01PercentageAsDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EMOA01PercentageAsDecimal }{@code >}
     *     
     */
    public void setEMOA01PercentageAsDecimal(JAXBElement<EMOA01PercentageAsDecimal> value) {
        this.emoa01PercentageAsDecimal = ((JAXBElement<EMOA01PercentageAsDecimal> ) value);
    }

    /**
     * Gets the value of the emoa02MonetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EMOA02MonetaryAmount }{@code >}
     *     
     */
    public JAXBElement<EMOA02MonetaryAmount> getEMOA02MonetaryAmount() {
        return emoa02MonetaryAmount;
    }

    /**
     * Sets the value of the emoa02MonetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EMOA02MonetaryAmount }{@code >}
     *     
     */
    public void setEMOA02MonetaryAmount(JAXBElement<EMOA02MonetaryAmount> value) {
        this.emoa02MonetaryAmount = ((JAXBElement<EMOA02MonetaryAmount> ) value);
    }

    /**
     * Gets the value of the emoa03ReferenceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EMOA03ReferenceIdentification }{@code >}
     *     
     */
    public JAXBElement<EMOA03ReferenceIdentification> getEMOA03ReferenceIdentification() {
        return emoa03ReferenceIdentification;
    }

    /**
     * Sets the value of the emoa03ReferenceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EMOA03ReferenceIdentification }{@code >}
     *     
     */
    public void setEMOA03ReferenceIdentification(JAXBElement<EMOA03ReferenceIdentification> value) {
        this.emoa03ReferenceIdentification = ((JAXBElement<EMOA03ReferenceIdentification> ) value);
    }

    /**
     * Gets the value of the emoa04ReferenceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EMOA04ReferenceIdentification }{@code >}
     *     
     */
    public JAXBElement<EMOA04ReferenceIdentification> getEMOA04ReferenceIdentification() {
        return emoa04ReferenceIdentification;
    }

    /**
     * Sets the value of the emoa04ReferenceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EMOA04ReferenceIdentification }{@code >}
     *     
     */
    public void setEMOA04ReferenceIdentification(JAXBElement<EMOA04ReferenceIdentification> value) {
        this.emoa04ReferenceIdentification = ((JAXBElement<EMOA04ReferenceIdentification> ) value);
    }

    /**
     * Gets the value of the emoa05ReferenceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EMOA05ReferenceIdentification }{@code >}
     *     
     */
    public JAXBElement<EMOA05ReferenceIdentification> getEMOA05ReferenceIdentification() {
        return emoa05ReferenceIdentification;
    }

    /**
     * Sets the value of the emoa05ReferenceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EMOA05ReferenceIdentification }{@code >}
     *     
     */
    public void setEMOA05ReferenceIdentification(JAXBElement<EMOA05ReferenceIdentification> value) {
        this.emoa05ReferenceIdentification = ((JAXBElement<EMOA05ReferenceIdentification> ) value);
    }

    /**
     * Gets the value of the emoa06ReferenceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EMOA06ReferenceIdentification }{@code >}
     *     
     */
    public JAXBElement<EMOA06ReferenceIdentification> getEMOA06ReferenceIdentification() {
        return emoa06ReferenceIdentification;
    }

    /**
     * Sets the value of the emoa06ReferenceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EMOA06ReferenceIdentification }{@code >}
     *     
     */
    public void setEMOA06ReferenceIdentification(JAXBElement<EMOA06ReferenceIdentification> value) {
        this.emoa06ReferenceIdentification = ((JAXBElement<EMOA06ReferenceIdentification> ) value);
    }

    /**
     * Gets the value of the emoa07ReferenceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EMOA07ReferenceIdentification }{@code >}
     *     
     */
    public JAXBElement<EMOA07ReferenceIdentification> getEMOA07ReferenceIdentification() {
        return emoa07ReferenceIdentification;
    }

    /**
     * Sets the value of the emoa07ReferenceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EMOA07ReferenceIdentification }{@code >}
     *     
     */
    public void setEMOA07ReferenceIdentification(JAXBElement<EMOA07ReferenceIdentification> value) {
        this.emoa07ReferenceIdentification = ((JAXBElement<EMOA07ReferenceIdentification> ) value);
    }

    /**
     * Gets the value of the emoa08MonetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EMOA08MonetaryAmount }{@code >}
     *     
     */
    public JAXBElement<EMOA08MonetaryAmount> getEMOA08MonetaryAmount() {
        return emoa08MonetaryAmount;
    }

    /**
     * Sets the value of the emoa08MonetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EMOA08MonetaryAmount }{@code >}
     *     
     */
    public void setEMOA08MonetaryAmount(JAXBElement<EMOA08MonetaryAmount> value) {
        this.emoa08MonetaryAmount = ((JAXBElement<EMOA08MonetaryAmount> ) value);
    }

    /**
     * Gets the value of the emoa09MonetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EMOA09MonetaryAmount }{@code >}
     *     
     */
    public JAXBElement<EMOA09MonetaryAmount> getEMOA09MonetaryAmount() {
        return emoa09MonetaryAmount;
    }

    /**
     * Sets the value of the emoa09MonetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EMOA09MonetaryAmount }{@code >}
     *     
     */
    public void setEMOA09MonetaryAmount(JAXBElement<EMOA09MonetaryAmount> value) {
        this.emoa09MonetaryAmount = ((JAXBElement<EMOA09MonetaryAmount> ) value);
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
            return "MOA";
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
            return "Outpatient Adjudication Information";
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