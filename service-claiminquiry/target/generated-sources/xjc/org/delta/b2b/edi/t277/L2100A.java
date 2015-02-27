//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.24 at 03:57:26 PM PDT 
//


package org.delta.b2b.edi.t277;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To supply the full name of an individual or organizational entity
 * 
 * <p>Java class for L-2100A complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L-2100A">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S-NM1-Payer_Name" type="{http://www.delta.org/b2b/edi/t277}S-NM1-Payer_Name"/>
 *         &lt;element name="S-PER-Payer_Contact_Information" type="{http://www.delta.org/b2b/edi/t277}S-PER-Payer_Contact_Information" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="2100A" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Payer Name" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L-2100A", propOrder = {
    "snm1PayerName",
    "sperPayerContactInformation"
})
public class L2100A {

    @XmlElement(name = "S-NM1-Payer_Name", required = true)
    protected SNM1PayerName snm1PayerName;
    @XmlElementRef(name = "S-PER-Payer_Contact_Information", namespace = "http://www.delta.org/b2b/edi/t277", type = JAXBElement.class)
    protected JAXBElement<SPERPayerContactInformation> sperPayerContactInformation;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the snm1PayerName property.
     * 
     * @return
     *     possible object is
     *     {@link SNM1PayerName }
     *     
     */
    public SNM1PayerName getSNM1PayerName() {
        return snm1PayerName;
    }

    /**
     * Sets the value of the snm1PayerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNM1PayerName }
     *     
     */
    public void setSNM1PayerName(SNM1PayerName value) {
        this.snm1PayerName = value;
    }

    /**
     * Gets the value of the sperPayerContactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SPERPayerContactInformation }{@code >}
     *     
     */
    public JAXBElement<SPERPayerContactInformation> getSPERPayerContactInformation() {
        return sperPayerContactInformation;
    }

    /**
     * Sets the value of the sperPayerContactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SPERPayerContactInformation }{@code >}
     *     
     */
    public void setSPERPayerContactInformation(JAXBElement<SPERPayerContactInformation> value) {
        this.sperPayerContactInformation = ((JAXBElement<SPERPayerContactInformation> ) value);
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
            return "2100A";
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
            return "Payer Name";
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
            return "Loop";
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
