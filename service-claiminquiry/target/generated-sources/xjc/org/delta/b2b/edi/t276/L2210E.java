//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.24 at 03:57:26 PM PDT 
//


package org.delta.b2b.edi.t276;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To supply payment and control information to a provider for a particular service
 * 
 * <p>Java class for L-2210E complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L-2210E">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S-SVC-Service_Line_Information" type="{http://www.delta.org/b2b/edi/t276}S-SVC-Service_Line_Information"/>
 *         &lt;element name="S-REF-Service_Line_Item_Identification" type="{http://www.delta.org/b2b/edi/t276}S-REF-Service_Line_Item_Identification" minOccurs="0"/>
 *         &lt;element name="S-DTP-Service_Line_Date" type="{http://www.delta.org/b2b/edi/t276}S-DTP-Service_Line_Date"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="2210E" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Service Line Information" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L-2210E", propOrder = {
    "ssvcServiceLineInformation",
    "srefServiceLineItemIdentification",
    "sdtpServiceLineDate"
})
public class L2210E {

    @XmlElement(name = "S-SVC-Service_Line_Information", required = true)
    protected SSVCServiceLineInformation ssvcServiceLineInformation;
    @XmlElementRef(name = "S-REF-Service_Line_Item_Identification", namespace = "http://www.delta.org/b2b/edi/t276", type = JAXBElement.class)
    protected JAXBElement<SREFServiceLineItemIdentification> srefServiceLineItemIdentification;
    @XmlElement(name = "S-DTP-Service_Line_Date", required = true)
    protected SDTPServiceLineDate sdtpServiceLineDate;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the ssvcServiceLineInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SSVCServiceLineInformation }
     *     
     */
    public SSVCServiceLineInformation getSSVCServiceLineInformation() {
        return ssvcServiceLineInformation;
    }

    /**
     * Sets the value of the ssvcServiceLineInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSVCServiceLineInformation }
     *     
     */
    public void setSSVCServiceLineInformation(SSVCServiceLineInformation value) {
        this.ssvcServiceLineInformation = value;
    }

    /**
     * Gets the value of the srefServiceLineItemIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SREFServiceLineItemIdentification }{@code >}
     *     
     */
    public JAXBElement<SREFServiceLineItemIdentification> getSREFServiceLineItemIdentification() {
        return srefServiceLineItemIdentification;
    }

    /**
     * Sets the value of the srefServiceLineItemIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SREFServiceLineItemIdentification }{@code >}
     *     
     */
    public void setSREFServiceLineItemIdentification(JAXBElement<SREFServiceLineItemIdentification> value) {
        this.srefServiceLineItemIdentification = ((JAXBElement<SREFServiceLineItemIdentification> ) value);
    }

    /**
     * Gets the value of the sdtpServiceLineDate property.
     * 
     * @return
     *     possible object is
     *     {@link SDTPServiceLineDate }
     *     
     */
    public SDTPServiceLineDate getSDTPServiceLineDate() {
        return sdtpServiceLineDate;
    }

    /**
     * Sets the value of the sdtpServiceLineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SDTPServiceLineDate }
     *     
     */
    public void setSDTPServiceLineDate(SDTPServiceLineDate value) {
        this.sdtpServiceLineDate = value;
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
            return "2210E";
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
            return "Service Line Information";
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
