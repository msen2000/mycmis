//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.03 at 11:47:13 AM PDT 
//


package org.delta.b2b.edi.t271;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify one or more reference numbers or identification numbers as specified by the Reference Qualifier 
 * 
 * <p>Java class for C-C040-Reference_Identifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C-C040-Reference_Identifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-REF01-Reference_Identification_Qualifier" type="{http://www.delta.org/b2b/edi/t271}E-REF01-Reference_Identification_Qualifier_1"/>
 *         &lt;element name="E-REF02-Reference_Identification" type="{http://www.delta.org/b2b/edi/t271}E-REF02-Reference_Identification_1"/>
 *         &lt;element name="E-REF03-Reference_Identification_Qualifier" type="{http://www.delta.org/b2b/edi/t271}E-REF03-Reference_Identification_Qualifier"/>
 *         &lt;element name="E-REF04-Reference_Identification" type="{http://www.delta.org/b2b/edi/t271}E-REF04-Reference_Identification"/>
 *         &lt;element name="E-REF05-Reference_Identification_Qualifier" type="{http://www.delta.org/b2b/edi/t271}E-REF05-Reference_Identification_Qualifier"/>
 *         &lt;element name="E-REF06-Reference_Identification" type="{http://www.delta.org/b2b/edi/t271}E-REF06-Reference_Identification"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="C040" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Reference Identifier" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Composite" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C-C040-Reference_Identifier", propOrder = {
    "eref01ReferenceIdentificationQualifier",
    "eref02ReferenceIdentification",
    "eref03ReferenceIdentificationQualifier",
    "eref04ReferenceIdentification",
    "eref05ReferenceIdentificationQualifier",
    "eref06ReferenceIdentification"
})
public class CC040ReferenceIdentifier {

    @XmlElement(name = "E-REF01-Reference_Identification_Qualifier", required = true)
    protected EREF01ReferenceIdentificationQualifier1 eref01ReferenceIdentificationQualifier;
    @XmlElement(name = "E-REF02-Reference_Identification", required = true)
    protected EREF02ReferenceIdentification1 eref02ReferenceIdentification;
    @XmlElement(name = "E-REF03-Reference_Identification_Qualifier", required = true)
    protected EREF03ReferenceIdentificationQualifier eref03ReferenceIdentificationQualifier;
    @XmlElement(name = "E-REF04-Reference_Identification", required = true)
    protected EREF04ReferenceIdentification eref04ReferenceIdentification;
    @XmlElement(name = "E-REF05-Reference_Identification_Qualifier", required = true)
    protected EREF05ReferenceIdentificationQualifier eref05ReferenceIdentificationQualifier;
    @XmlElement(name = "E-REF06-Reference_Identification", required = true)
    protected EREF06ReferenceIdentification eref06ReferenceIdentification;
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
     *     {@link EREF01ReferenceIdentificationQualifier1 }
     *     
     */
    public EREF01ReferenceIdentificationQualifier1 getEREF01ReferenceIdentificationQualifier() {
        return eref01ReferenceIdentificationQualifier;
    }

    /**
     * Sets the value of the eref01ReferenceIdentificationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EREF01ReferenceIdentificationQualifier1 }
     *     
     */
    public void setEREF01ReferenceIdentificationQualifier(EREF01ReferenceIdentificationQualifier1 value) {
        this.eref01ReferenceIdentificationQualifier = value;
    }

    /**
     * Gets the value of the eref02ReferenceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EREF02ReferenceIdentification1 }
     *     
     */
    public EREF02ReferenceIdentification1 getEREF02ReferenceIdentification() {
        return eref02ReferenceIdentification;
    }

    /**
     * Sets the value of the eref02ReferenceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EREF02ReferenceIdentification1 }
     *     
     */
    public void setEREF02ReferenceIdentification(EREF02ReferenceIdentification1 value) {
        this.eref02ReferenceIdentification = value;
    }

    /**
     * Gets the value of the eref03ReferenceIdentificationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link EREF03ReferenceIdentificationQualifier }
     *     
     */
    public EREF03ReferenceIdentificationQualifier getEREF03ReferenceIdentificationQualifier() {
        return eref03ReferenceIdentificationQualifier;
    }

    /**
     * Sets the value of the eref03ReferenceIdentificationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EREF03ReferenceIdentificationQualifier }
     *     
     */
    public void setEREF03ReferenceIdentificationQualifier(EREF03ReferenceIdentificationQualifier value) {
        this.eref03ReferenceIdentificationQualifier = value;
    }

    /**
     * Gets the value of the eref04ReferenceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EREF04ReferenceIdentification }
     *     
     */
    public EREF04ReferenceIdentification getEREF04ReferenceIdentification() {
        return eref04ReferenceIdentification;
    }

    /**
     * Sets the value of the eref04ReferenceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EREF04ReferenceIdentification }
     *     
     */
    public void setEREF04ReferenceIdentification(EREF04ReferenceIdentification value) {
        this.eref04ReferenceIdentification = value;
    }

    /**
     * Gets the value of the eref05ReferenceIdentificationQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link EREF05ReferenceIdentificationQualifier }
     *     
     */
    public EREF05ReferenceIdentificationQualifier getEREF05ReferenceIdentificationQualifier() {
        return eref05ReferenceIdentificationQualifier;
    }

    /**
     * Sets the value of the eref05ReferenceIdentificationQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EREF05ReferenceIdentificationQualifier }
     *     
     */
    public void setEREF05ReferenceIdentificationQualifier(EREF05ReferenceIdentificationQualifier value) {
        this.eref05ReferenceIdentificationQualifier = value;
    }

    /**
     * Gets the value of the eref06ReferenceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link EREF06ReferenceIdentification }
     *     
     */
    public EREF06ReferenceIdentification getEREF06ReferenceIdentification() {
        return eref06ReferenceIdentification;
    }

    /**
     * Sets the value of the eref06ReferenceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EREF06ReferenceIdentification }
     *     
     */
    public void setEREF06ReferenceIdentification(EREF06ReferenceIdentification value) {
        this.eref06ReferenceIdentification = value;
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
            return "C040";
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
            return "Reference Identifier";
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
