//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.03 at 11:47:13 AM PDT 
//


package org.delta.b2b.edi.t270;

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
 *         &lt;element name="S-NM1-Information_Receiver_Name" type="{http://www.delta.org/b2b/edi/t270}S-NM1-Information_Receiver_Name"/>
 *         &lt;element name="S-REF-Information_Receiver_Additional_Identification" type="{http://www.delta.org/b2b/edi/t270}S-REF-Information_Receiver_Additional_Identification" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="S-N3-Information_Receiver_Address" type="{http://www.delta.org/b2b/edi/t270}S-N3-Information_Receiver_Address" minOccurs="0"/>
 *         &lt;element name="S-N4-Information_Receiver_City__State__ZIP_Code" type="{http://www.delta.org/b2b/edi/t270}S-N4-Information_Receiver_City__State__ZIP_Code" minOccurs="0"/>
 *         &lt;element name="S-PRV-Information_Receiver_Provider_Information" type="{http://www.delta.org/b2b/edi/t270}S-PRV-Information_Receiver_Provider_Information" minOccurs="0"/>
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
    "sn3InformationReceiverAddress",
    "sn4InformationReceiverCityStateZIPCode",
    "sprvInformationReceiverProviderInformation"
})
public class L2100B {

    @XmlElement(name = "S-NM1-Information_Receiver_Name", required = true)
    protected SNM1InformationReceiverName snm1InformationReceiverName;
    @XmlElement(name = "S-REF-Information_Receiver_Additional_Identification", nillable = true)
    protected List<SREFInformationReceiverAdditionalIdentification> srefInformationReceiverAdditionalIdentification;
    @XmlElementRef(name = "S-N3-Information_Receiver_Address", namespace = "http://www.delta.org/b2b/edi/t270", type = JAXBElement.class)
    protected JAXBElement<SN3InformationReceiverAddress> sn3InformationReceiverAddress;
    @XmlElementRef(name = "S-N4-Information_Receiver_City__State__ZIP_Code", namespace = "http://www.delta.org/b2b/edi/t270", type = JAXBElement.class)
    protected JAXBElement<SN4InformationReceiverCityStateZIPCode> sn4InformationReceiverCityStateZIPCode;
    @XmlElementRef(name = "S-PRV-Information_Receiver_Provider_Information", namespace = "http://www.delta.org/b2b/edi/t270", type = JAXBElement.class)
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
     * Gets the value of the sn3InformationReceiverAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SN3InformationReceiverAddress }{@code >}
     *     
     */
    public JAXBElement<SN3InformationReceiverAddress> getSN3InformationReceiverAddress() {
        return sn3InformationReceiverAddress;
    }

    /**
     * Sets the value of the sn3InformationReceiverAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SN3InformationReceiverAddress }{@code >}
     *     
     */
    public void setSN3InformationReceiverAddress(JAXBElement<SN3InformationReceiverAddress> value) {
        this.sn3InformationReceiverAddress = ((JAXBElement<SN3InformationReceiverAddress> ) value);
    }

    /**
     * Gets the value of the sn4InformationReceiverCityStateZIPCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SN4InformationReceiverCityStateZIPCode }{@code >}
     *     
     */
    public JAXBElement<SN4InformationReceiverCityStateZIPCode> getSN4InformationReceiverCityStateZIPCode() {
        return sn4InformationReceiverCityStateZIPCode;
    }

    /**
     * Sets the value of the sn4InformationReceiverCityStateZIPCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SN4InformationReceiverCityStateZIPCode }{@code >}
     *     
     */
    public void setSN4InformationReceiverCityStateZIPCode(JAXBElement<SN4InformationReceiverCityStateZIPCode> value) {
        this.sn4InformationReceiverCityStateZIPCode = ((JAXBElement<SN4InformationReceiverCityStateZIPCode> ) value);
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
