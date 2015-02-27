//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.03 at 11:47:13 AM PDT 
//


package org.delta.b2b.edi.t271;

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
 * To supply eligibility or benefit information
 * 
 * <p>Java class for L-2110C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L-2110C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S-EB-Subscriber_Eligibility_or_Benefit_Information" type="{http://www.delta.org/b2b/edi/t271}S-EB-Subscriber_Eligibility_or_Benefit_Information"/>
 *         &lt;element name="S-HSD-Health_Care_Services_Delivery" type="{http://www.delta.org/b2b/edi/t271}S-HSD-Health_Care_Services_Delivery" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="S-REF-Subscriber_Additional_Identification" type="{http://www.delta.org/b2b/edi/t271}S-REF-Subscriber_Additional_Identification_1" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="S-DTP-Subscriber_Eligibility_Benefit_Date" type="{http://www.delta.org/b2b/edi/t271}S-DTP-Subscriber_Eligibility_Benefit_Date" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="S-AAA-Subscriber_Request_Validation" type="{http://www.delta.org/b2b/edi/t271}S-AAA-Subscriber_Request_Validation_1" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="S-MSG-Message_Text" type="{http://www.delta.org/b2b/edi/t271}S-MSG-Message_Text" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="L-2115C" type="{http://www.delta.org/b2b/edi/t271}L-2115C" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="L-LS" type="{http://www.delta.org/b2b/edi/t271}L-LS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="2110C" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Subscriber Eligibility or Benefit Information" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L-2110C", propOrder = {
    "sebSubscriberEligibilityOrBenefitInformation",
    "shsdHealthCareServicesDelivery",
    "srefSubscriberAdditionalIdentification",
    "sdtpSubscriberEligibilityBenefitDate",
    "saaaSubscriberRequestValidation",
    "smsgMessageText",
    "l2115C",
    "lls"
})
public class L2110C {

    @XmlElement(name = "S-EB-Subscriber_Eligibility_or_Benefit_Information", required = true)
    protected SEBSubscriberEligibilityOrBenefitInformation sebSubscriberEligibilityOrBenefitInformation;
    @XmlElement(name = "S-HSD-Health_Care_Services_Delivery", nillable = true)
    protected List<SHSDHealthCareServicesDelivery> shsdHealthCareServicesDelivery;
    @XmlElement(name = "S-REF-Subscriber_Additional_Identification", nillable = true)
    protected List<SREFSubscriberAdditionalIdentification1> srefSubscriberAdditionalIdentification;
    @XmlElement(name = "S-DTP-Subscriber_Eligibility_Benefit_Date", nillable = true)
    protected List<SDTPSubscriberEligibilityBenefitDate> sdtpSubscriberEligibilityBenefitDate;
    @XmlElement(name = "S-AAA-Subscriber_Request_Validation", nillable = true)
    protected List<SAAASubscriberRequestValidation1> saaaSubscriberRequestValidation;
    @XmlElement(name = "S-MSG-Message_Text", nillable = true)
    protected List<SMSGMessageText> smsgMessageText;
    @XmlElement(name = "L-2115C", nillable = true)
    protected List<L2115C> l2115C;
    @XmlElementRef(name = "L-LS", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<LLS> lls;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the sebSubscriberEligibilityOrBenefitInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SEBSubscriberEligibilityOrBenefitInformation }
     *     
     */
    public SEBSubscriberEligibilityOrBenefitInformation getSEBSubscriberEligibilityOrBenefitInformation() {
        return sebSubscriberEligibilityOrBenefitInformation;
    }

    /**
     * Sets the value of the sebSubscriberEligibilityOrBenefitInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEBSubscriberEligibilityOrBenefitInformation }
     *     
     */
    public void setSEBSubscriberEligibilityOrBenefitInformation(SEBSubscriberEligibilityOrBenefitInformation value) {
        this.sebSubscriberEligibilityOrBenefitInformation = value;
    }

    /**
     * Gets the value of the shsdHealthCareServicesDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shsdHealthCareServicesDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSHSDHealthCareServicesDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SHSDHealthCareServicesDelivery }
     * 
     * 
     */
    public List<SHSDHealthCareServicesDelivery> getSHSDHealthCareServicesDelivery() {
        if (shsdHealthCareServicesDelivery == null) {
            shsdHealthCareServicesDelivery = new ArrayList<SHSDHealthCareServicesDelivery>();
        }
        return this.shsdHealthCareServicesDelivery;
    }

    /**
     * Gets the value of the srefSubscriberAdditionalIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srefSubscriberAdditionalIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSREFSubscriberAdditionalIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SREFSubscriberAdditionalIdentification1 }
     * 
     * 
     */
    public List<SREFSubscriberAdditionalIdentification1> getSREFSubscriberAdditionalIdentification() {
        if (srefSubscriberAdditionalIdentification == null) {
            srefSubscriberAdditionalIdentification = new ArrayList<SREFSubscriberAdditionalIdentification1>();
        }
        return this.srefSubscriberAdditionalIdentification;
    }

    /**
     * Gets the value of the sdtpSubscriberEligibilityBenefitDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdtpSubscriberEligibilityBenefitDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSDTPSubscriberEligibilityBenefitDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SDTPSubscriberEligibilityBenefitDate }
     * 
     * 
     */
    public List<SDTPSubscriberEligibilityBenefitDate> getSDTPSubscriberEligibilityBenefitDate() {
        if (sdtpSubscriberEligibilityBenefitDate == null) {
            sdtpSubscriberEligibilityBenefitDate = new ArrayList<SDTPSubscriberEligibilityBenefitDate>();
        }
        return this.sdtpSubscriberEligibilityBenefitDate;
    }

    /**
     * Gets the value of the saaaSubscriberRequestValidation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saaaSubscriberRequestValidation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSAAASubscriberRequestValidation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SAAASubscriberRequestValidation1 }
     * 
     * 
     */
    public List<SAAASubscriberRequestValidation1> getSAAASubscriberRequestValidation() {
        if (saaaSubscriberRequestValidation == null) {
            saaaSubscriberRequestValidation = new ArrayList<SAAASubscriberRequestValidation1>();
        }
        return this.saaaSubscriberRequestValidation;
    }

    /**
     * Gets the value of the smsgMessageText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smsgMessageText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSMSGMessageText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SMSGMessageText }
     * 
     * 
     */
    public List<SMSGMessageText> getSMSGMessageText() {
        if (smsgMessageText == null) {
            smsgMessageText = new ArrayList<SMSGMessageText>();
        }
        return this.smsgMessageText;
    }

    /**
     * Gets the value of the l2115C property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l2115C property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL2115C().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L2115C }
     * 
     * 
     */
    public List<L2115C> getL2115C() {
        if (l2115C == null) {
            l2115C = new ArrayList<L2115C>();
        }
        return this.l2115C;
    }

    /**
     * Gets the value of the lls property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LLS }{@code >}
     *     
     */
    public JAXBElement<LLS> getLLS() {
        return lls;
    }

    /**
     * Sets the value of the lls property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LLS }{@code >}
     *     
     */
    public void setLLS(JAXBElement<LLS> value) {
        this.lls = ((JAXBElement<LLS> ) value);
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
            return "2110C";
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
            return "Subscriber Eligibility or Benefit Information";
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