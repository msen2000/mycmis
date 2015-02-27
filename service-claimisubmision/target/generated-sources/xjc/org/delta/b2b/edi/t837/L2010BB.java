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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * To supply the full name of an individual or organizational entity
 * 
 * <p>Java class for L-2010BB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L-2010BB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S-NM1-Payer_Name" type="{http://www.delta.org/b2b/edi/t837}S-NM1-Payer_Name"/>
 *         &lt;element name="S-N3-Payer_Address" type="{http://www.delta.org/b2b/edi/t837}S-N3-Payer_Address" minOccurs="0"/>
 *         &lt;element name="S-N4-Payer_City__State__ZIP_Code" type="{http://www.delta.org/b2b/edi/t837}S-N4-Payer_City__State__ZIP_Code" minOccurs="0"/>
 *         &lt;choice maxOccurs="4" minOccurs="0">
 *           &lt;element name="S-REF-Payer_Secondary_Identification" type="{http://www.delta.org/b2b/edi/t837}S-REF-Payer_Secondary_Identification" maxOccurs="3" minOccurs="0"/>
 *           &lt;element name="S-REF-Billing_Provider_Secondary_Identification" type="{http://www.delta.org/b2b/edi/t837}S-REF-Billing_Provider_Secondary_Identification" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="2010BB" />
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
@XmlType(name = "L-2010BB", propOrder = {
    "snm1PayerName",
    "sn3PayerAddress",
    "sn4PayerCityStateZIPCode",
    "srefPayerSecondaryIdentificationOrSREFBillingProviderSecondaryIdentification"
})
public class L2010BB {

    @XmlElement(name = "S-NM1-Payer_Name", required = true)
    protected SNM1PayerName snm1PayerName;
    @XmlElementRef(name = "S-N3-Payer_Address", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<SN3PayerAddress> sn3PayerAddress;
    @XmlElementRef(name = "S-N4-Payer_City__State__ZIP_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<SN4PayerCityStateZIPCode> sn4PayerCityStateZIPCode;
    @XmlElements({
        @XmlElement(name = "S-REF-Payer_Secondary_Identification", type = SREFPayerSecondaryIdentification.class, nillable = true),
        @XmlElement(name = "S-REF-Billing_Provider_Secondary_Identification", type = SREFBillingProviderSecondaryIdentification.class, nillable = true)
    })
    protected List<Object> srefPayerSecondaryIdentificationOrSREFBillingProviderSecondaryIdentification;
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
     * Gets the value of the sn3PayerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SN3PayerAddress }{@code >}
     *     
     */
    public JAXBElement<SN3PayerAddress> getSN3PayerAddress() {
        return sn3PayerAddress;
    }

    /**
     * Sets the value of the sn3PayerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SN3PayerAddress }{@code >}
     *     
     */
    public void setSN3PayerAddress(JAXBElement<SN3PayerAddress> value) {
        this.sn3PayerAddress = ((JAXBElement<SN3PayerAddress> ) value);
    }

    /**
     * Gets the value of the sn4PayerCityStateZIPCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SN4PayerCityStateZIPCode }{@code >}
     *     
     */
    public JAXBElement<SN4PayerCityStateZIPCode> getSN4PayerCityStateZIPCode() {
        return sn4PayerCityStateZIPCode;
    }

    /**
     * Sets the value of the sn4PayerCityStateZIPCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SN4PayerCityStateZIPCode }{@code >}
     *     
     */
    public void setSN4PayerCityStateZIPCode(JAXBElement<SN4PayerCityStateZIPCode> value) {
        this.sn4PayerCityStateZIPCode = ((JAXBElement<SN4PayerCityStateZIPCode> ) value);
    }

    /**
     * Gets the value of the srefPayerSecondaryIdentificationOrSREFBillingProviderSecondaryIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srefPayerSecondaryIdentificationOrSREFBillingProviderSecondaryIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSREFPayerSecondaryIdentificationOrSREFBillingProviderSecondaryIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SREFPayerSecondaryIdentification }
     * {@link SREFBillingProviderSecondaryIdentification }
     * 
     * 
     */
    public List<Object> getSREFPayerSecondaryIdentificationOrSREFBillingProviderSecondaryIdentification() {
        if (srefPayerSecondaryIdentificationOrSREFBillingProviderSecondaryIdentification == null) {
            srefPayerSecondaryIdentificationOrSREFBillingProviderSecondaryIdentification = new ArrayList<Object>();
        }
        return this.srefPayerSecondaryIdentificationOrSREFBillingProviderSecondaryIdentification;
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
            return "2010BB";
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