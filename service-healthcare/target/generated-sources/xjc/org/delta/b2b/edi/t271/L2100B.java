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
 * To supply the full name of an individual or organizational entity
 * 
 * <p>Java class for L-2100B complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L-2100B">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S-NM1-Information_Receiver_Name" type="{http://www.delta.org/b2b/edi/t271}S-NM1-Information_Receiver_Name"/>
 *         &lt;element name="S-REF-Information_Receiver_Additional_Identification" type="{http://www.delta.org/b2b/edi/t271}S-REF-Information_Receiver_Additional_Identification" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="S-AAA-Information_Receiver_Request_Validation" type="{http://www.delta.org/b2b/edi/t271}S-AAA-Information_Receiver_Request_Validation" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="S-PRV-Information_Receiver_Provider_Information" type="{http://www.delta.org/b2b/edi/t271}S-PRV-Information_Receiver_Provider_Information" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="2100B" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Information Receiver Name" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L-2100B", propOrder = {
    "snm1InformationReceiverName",
    "srefInformationReceiverAdditionalIdentification",
    "saaaInformationReceiverRequestValidation",
    "sprvInformationReceiverProviderInformation"
})
public class L2100B {

    @XmlElement(name = "S-NM1-Information_Receiver_Name", required = true)
    protected SNM1InformationReceiverName snm1InformationReceiverName;
    @XmlElement(name = "S-REF-Information_Receiver_Additional_Identification", nillable = true)
    protected List<SREFInformationReceiverAdditionalIdentification> srefInformationReceiverAdditionalIdentification;
    @XmlElement(name = "S-AAA-Information_Receiver_Request_Validation", nillable = true)
    protected List<SAAAInformationReceiverRequestValidation> saaaInformationReceiverRequestValidation;
    @XmlElementRef(name = "S-PRV-Information_Receiver_Provider_Information", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<SPRVInformationReceiverProviderInformation> sprvInformationReceiverProviderInformation;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the snm1InformationReceiverName property.
     * 
     * @return
     *     possible object is
     *     {@link SNM1InformationReceiverName }
     *     
     */
    public SNM1InformationReceiverName getSNM1InformationReceiverName() {
        return snm1InformationReceiverName;
    }

    /**
     * Sets the value of the snm1InformationReceiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SNM1InformationReceiverName }
     *     
     */
    public void setSNM1InformationReceiverName(SNM1InformationReceiverName value) {
        this.snm1InformationReceiverName = value;
    }

    /**
     * Gets the value of the srefInformationReceiverAdditionalIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srefInformationReceiverAdditionalIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSREFInformationReceiverAdditionalIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SREFInformationReceiverAdditionalIdentification }
     * 
     * 
     */
    public List<SREFInformationReceiverAdditionalIdentification> getSREFInformationReceiverAdditionalIdentification() {
        if (srefInformationReceiverAdditionalIdentification == null) {
            srefInformationReceiverAdditionalIdentification = new ArrayList<SREFInformationReceiverAdditionalIdentification>();
        }
        return this.srefInformationReceiverAdditionalIdentification;
    }

    /**
     * Gets the value of the saaaInformationReceiverRequestValidation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saaaInformationReceiverRequestValidation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSAAAInformationReceiverRequestValidation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SAAAInformationReceiverRequestValidation }
     * 
     * 
     */
    public List<SAAAInformationReceiverRequestValidation> getSAAAInformationReceiverRequestValidation() {
        if (saaaInformationReceiverRequestValidation == null) {
            saaaInformationReceiverRequestValidation = new ArrayList<SAAAInformationReceiverRequestValidation>();
        }
        return this.saaaInformationReceiverRequestValidation;
    }

    /**
     * Gets the value of the sprvInformationReceiverProviderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SPRVInformationReceiverProviderInformation }{@code >}
     *     
     */
    public JAXBElement<SPRVInformationReceiverProviderInformation> getSPRVInformationReceiverProviderInformation() {
        return sprvInformationReceiverProviderInformation;
    }

    /**
     * Sets the value of the sprvInformationReceiverProviderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SPRVInformationReceiverProviderInformation }{@code >}
     *     
     */
    public void setSPRVInformationReceiverProviderInformation(JAXBElement<SPRVInformationReceiverProviderInformation> value) {
        this.sprvInformationReceiverProviderInformation = ((JAXBElement<SPRVInformationReceiverProviderInformation> ) value);
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
            return "2100B";
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
            return "Information Receiver Name";
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
