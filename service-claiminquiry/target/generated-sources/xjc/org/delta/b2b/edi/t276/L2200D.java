//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.24 at 03:57:26 PM PDT 
//


package org.delta.b2b.edi.t276;

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
 * To uniquely identify a transaction to an application
 * 
 * <p>Java class for L-2200D complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L-2200D">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S-TRN-Claim_Status_Tracking_Number" type="{http://www.delta.org/b2b/edi/t276}S-TRN-Claim_Status_Tracking_Number"/>
 *         &lt;choice maxOccurs="7" minOccurs="0">
 *           &lt;element name="S-REF-Payer_Claim_Control_Number" type="{http://www.delta.org/b2b/edi/t276}S-REF-Payer_Claim_Control_Number" minOccurs="0"/>
 *           &lt;element name="S-REF-Institutional_Bill_Type_Identification" type="{http://www.delta.org/b2b/edi/t276}S-REF-Institutional_Bill_Type_Identification" minOccurs="0"/>
 *           &lt;element name="S-REF-Application_or_Location_System_Identifier" type="{http://www.delta.org/b2b/edi/t276}S-REF-Application_or_Location_System_Identifier" minOccurs="0"/>
 *           &lt;element name="S-REF-Group_Number" type="{http://www.delta.org/b2b/edi/t276}S-REF-Group_Number" minOccurs="0"/>
 *           &lt;element name="S-REF-Patient_Control_Number" type="{http://www.delta.org/b2b/edi/t276}S-REF-Patient_Control_Number" minOccurs="0"/>
 *           &lt;element name="S-REF-Pharmacy_Prescription_Number" type="{http://www.delta.org/b2b/edi/t276}S-REF-Pharmacy_Prescription_Number" minOccurs="0"/>
 *           &lt;element name="S-REF-Claim_Identification_Number_For_Clearinghouses_and_Other_Transmission_Intermediaries" type="{http://www.delta.org/b2b/edi/t276}S-REF-Claim_Identification_Number_For_Clearinghouses_and_Other_Transmission_Intermediaries" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="S-AMT-Claim_Submitted_Charges" type="{http://www.delta.org/b2b/edi/t276}S-AMT-Claim_Submitted_Charges" minOccurs="0"/>
 *         &lt;element name="S-DTP-Claim_Service_Date" type="{http://www.delta.org/b2b/edi/t276}S-DTP-Claim_Service_Date" minOccurs="0"/>
 *         &lt;element name="L-2210D" type="{http://www.delta.org/b2b/edi/t276}L-2210D" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="2200D" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Claim Status Tracking Number" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L-2200D", propOrder = {
    "strnClaimStatusTrackingNumber",
    "srefPayerClaimControlNumberOrSREFInstitutionalBillTypeIdentificationOrSREFApplicationOrLocationSystemIdentifier",
    "samtClaimSubmittedCharges",
    "sdtpClaimServiceDate",
    "l2210D"
})
public class L2200D {

    @XmlElement(name = "S-TRN-Claim_Status_Tracking_Number", required = true)
    protected STRNClaimStatusTrackingNumber strnClaimStatusTrackingNumber;
    @XmlElements({
        @XmlElement(name = "S-REF-Application_or_Location_System_Identifier", type = SREFApplicationOrLocationSystemIdentifier.class, nillable = true),
        @XmlElement(name = "S-REF-Institutional_Bill_Type_Identification", type = SREFInstitutionalBillTypeIdentification.class, nillable = true),
        @XmlElement(name = "S-REF-Claim_Identification_Number_For_Clearinghouses_and_Other_Transmission_Intermediaries", type = SREFClaimIdentificationNumberForClearinghousesAndOtherTransmissionIntermediaries.class, nillable = true),
        @XmlElement(name = "S-REF-Group_Number", type = SREFGroupNumber.class, nillable = true),
        @XmlElement(name = "S-REF-Pharmacy_Prescription_Number", type = SREFPharmacyPrescriptionNumber.class, nillable = true),
        @XmlElement(name = "S-REF-Payer_Claim_Control_Number", type = SREFPayerClaimControlNumber.class, nillable = true),
        @XmlElement(name = "S-REF-Patient_Control_Number", type = SREFPatientControlNumber.class, nillable = true)
    })
    protected List<Object> srefPayerClaimControlNumberOrSREFInstitutionalBillTypeIdentificationOrSREFApplicationOrLocationSystemIdentifier;
    @XmlElementRef(name = "S-AMT-Claim_Submitted_Charges", namespace = "http://www.delta.org/b2b/edi/t276", type = JAXBElement.class)
    protected JAXBElement<SAMTClaimSubmittedCharges> samtClaimSubmittedCharges;
    @XmlElementRef(name = "S-DTP-Claim_Service_Date", namespace = "http://www.delta.org/b2b/edi/t276", type = JAXBElement.class)
    protected JAXBElement<SDTPClaimServiceDate> sdtpClaimServiceDate;
    @XmlElement(name = "L-2210D", nillable = true)
    protected List<L2210D> l2210D;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the strnClaimStatusTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link STRNClaimStatusTrackingNumber }
     *     
     */
    public STRNClaimStatusTrackingNumber getSTRNClaimStatusTrackingNumber() {
        return strnClaimStatusTrackingNumber;
    }

    /**
     * Sets the value of the strnClaimStatusTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRNClaimStatusTrackingNumber }
     *     
     */
    public void setSTRNClaimStatusTrackingNumber(STRNClaimStatusTrackingNumber value) {
        this.strnClaimStatusTrackingNumber = value;
    }

    /**
     * Gets the value of the srefPayerClaimControlNumberOrSREFInstitutionalBillTypeIdentificationOrSREFApplicationOrLocationSystemIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srefPayerClaimControlNumberOrSREFInstitutionalBillTypeIdentificationOrSREFApplicationOrLocationSystemIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSREFPayerClaimControlNumberOrSREFInstitutionalBillTypeIdentificationOrSREFApplicationOrLocationSystemIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SREFApplicationOrLocationSystemIdentifier }
     * {@link SREFInstitutionalBillTypeIdentification }
     * {@link SREFClaimIdentificationNumberForClearinghousesAndOtherTransmissionIntermediaries }
     * {@link SREFGroupNumber }
     * {@link SREFPharmacyPrescriptionNumber }
     * {@link SREFPayerClaimControlNumber }
     * {@link SREFPatientControlNumber }
     * 
     * 
     */
    public List<Object> getSREFPayerClaimControlNumberOrSREFInstitutionalBillTypeIdentificationOrSREFApplicationOrLocationSystemIdentifier() {
        if (srefPayerClaimControlNumberOrSREFInstitutionalBillTypeIdentificationOrSREFApplicationOrLocationSystemIdentifier == null) {
            srefPayerClaimControlNumberOrSREFInstitutionalBillTypeIdentificationOrSREFApplicationOrLocationSystemIdentifier = new ArrayList<Object>();
        }
        return this.srefPayerClaimControlNumberOrSREFInstitutionalBillTypeIdentificationOrSREFApplicationOrLocationSystemIdentifier;
    }

    /**
     * Gets the value of the samtClaimSubmittedCharges property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SAMTClaimSubmittedCharges }{@code >}
     *     
     */
    public JAXBElement<SAMTClaimSubmittedCharges> getSAMTClaimSubmittedCharges() {
        return samtClaimSubmittedCharges;
    }

    /**
     * Sets the value of the samtClaimSubmittedCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SAMTClaimSubmittedCharges }{@code >}
     *     
     */
    public void setSAMTClaimSubmittedCharges(JAXBElement<SAMTClaimSubmittedCharges> value) {
        this.samtClaimSubmittedCharges = ((JAXBElement<SAMTClaimSubmittedCharges> ) value);
    }

    /**
     * Gets the value of the sdtpClaimServiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SDTPClaimServiceDate }{@code >}
     *     
     */
    public JAXBElement<SDTPClaimServiceDate> getSDTPClaimServiceDate() {
        return sdtpClaimServiceDate;
    }

    /**
     * Sets the value of the sdtpClaimServiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SDTPClaimServiceDate }{@code >}
     *     
     */
    public void setSDTPClaimServiceDate(JAXBElement<SDTPClaimServiceDate> value) {
        this.sdtpClaimServiceDate = ((JAXBElement<SDTPClaimServiceDate> ) value);
    }

    /**
     * Gets the value of the l2210D property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l2210D property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL2210D().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L2210D }
     * 
     * 
     */
    public List<L2210D> getL2210D() {
        if (l2210D == null) {
            l2210D = new ArrayList<L2210D>();
        }
        return this.l2210D;
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
            return "2200D";
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
            return "Claim Status Tracking Number";
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