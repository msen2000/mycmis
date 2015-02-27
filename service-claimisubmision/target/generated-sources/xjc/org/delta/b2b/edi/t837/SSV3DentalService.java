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
 * To specify the service line item detail for dental work
 * 
 * <p>Java class for S-SV3-Dental_Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S-SV3-Dental_Service">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="C-C003-Composite_Medical_Procedure_Identifier" type="{http://www.delta.org/b2b/edi/t837}C-C003-Composite_Medical_Procedure_Identifier"/>
 *         &lt;element name="E-SV302-Monetary_Amount" type="{http://www.delta.org/b2b/edi/t837}E-SV302-Monetary_Amount"/>
 *         &lt;element name="E-SV303-Facility_Code_Value" type="{http://www.delta.org/b2b/edi/t837}E-SV303-Facility_Code_Value" minOccurs="0"/>
 *         &lt;element name="C-C006-Oral_Cavity_Designation" type="{http://www.delta.org/b2b/edi/t837}C-C006-Oral_Cavity_Designation" minOccurs="0"/>
 *         &lt;element name="E-SV305-Prosthesis__Crown_or_Inlay_Code" type="{http://www.delta.org/b2b/edi/t837}E-SV305-Prosthesis__Crown_or_Inlay_Code" minOccurs="0"/>
 *         &lt;element name="E-SV306-Quantity" type="{http://www.delta.org/b2b/edi/t837}E-SV306-Quantity" minOccurs="0"/>
 *         &lt;element name="E-SV307-Description" type="{http://www.delta.org/b2b/edi/t837}E-SV307-Description_1" minOccurs="0"/>
 *         &lt;element name="E-SV308-Copay_Status_Code" type="{http://www.delta.org/b2b/edi/t837}E-SV308-Copay_Status_Code" minOccurs="0"/>
 *         &lt;element name="E-SV309-Provider_Agreement_Code" type="{http://www.delta.org/b2b/edi/t837}E-SV309-Provider_Agreement_Code" minOccurs="0"/>
 *         &lt;element name="E-SV310-Yes_No_Condition_or_Response_Code" type="{http://www.delta.org/b2b/edi/t837}E-SV310-Yes_No_Condition_or_Response_Code" minOccurs="0"/>
 *         &lt;element name="C-C004-Composite_Diagnosis_Code_Pointer" type="{http://www.delta.org/b2b/edi/t837}C-C004-Composite_Diagnosis_Code_Pointer" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="SV3" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Dental Service" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S-SV3-Dental_Service", propOrder = {
    "cc003CompositeMedicalProcedureIdentifier",
    "esv302MonetaryAmount",
    "esv303FacilityCodeValue",
    "cc006OralCavityDesignation",
    "esv305ProsthesisCrownOrInlayCode",
    "esv306Quantity",
    "esv307Description",
    "esv308CopayStatusCode",
    "esv309ProviderAgreementCode",
    "esv310YesNoConditionOrResponseCode",
    "cc004CompositeDiagnosisCodePointer"
})
public class SSV3DentalService {

    @XmlElement(name = "C-C003-Composite_Medical_Procedure_Identifier", required = true)
    protected CC003CompositeMedicalProcedureIdentifier cc003CompositeMedicalProcedureIdentifier;
    @XmlElement(name = "E-SV302-Monetary_Amount", required = true)
    protected ESV302MonetaryAmount esv302MonetaryAmount;
    @XmlElementRef(name = "E-SV303-Facility_Code_Value", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ESV303FacilityCodeValue> esv303FacilityCodeValue;
    @XmlElementRef(name = "C-C006-Oral_Cavity_Designation", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<CC006OralCavityDesignation> cc006OralCavityDesignation;
    @XmlElementRef(name = "E-SV305-Prosthesis__Crown_or_Inlay_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ESV305ProsthesisCrownOrInlayCode> esv305ProsthesisCrownOrInlayCode;
    @XmlElementRef(name = "E-SV306-Quantity", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ESV306Quantity> esv306Quantity;
    @XmlElementRef(name = "E-SV307-Description", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ESV307Description1> esv307Description;
    @XmlElementRef(name = "E-SV308-Copay_Status_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ESV308CopayStatusCode> esv308CopayStatusCode;
    @XmlElementRef(name = "E-SV309-Provider_Agreement_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ESV309ProviderAgreementCode> esv309ProviderAgreementCode;
    @XmlElementRef(name = "E-SV310-Yes_No_Condition_or_Response_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ESV310YesNoConditionOrResponseCode> esv310YesNoConditionOrResponseCode;
    @XmlElementRef(name = "C-C004-Composite_Diagnosis_Code_Pointer", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<CC004CompositeDiagnosisCodePointer> cc004CompositeDiagnosisCodePointer;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the cc003CompositeMedicalProcedureIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CC003CompositeMedicalProcedureIdentifier }
     *     
     */
    public CC003CompositeMedicalProcedureIdentifier getCC003CompositeMedicalProcedureIdentifier() {
        return cc003CompositeMedicalProcedureIdentifier;
    }

    /**
     * Sets the value of the cc003CompositeMedicalProcedureIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CC003CompositeMedicalProcedureIdentifier }
     *     
     */
    public void setCC003CompositeMedicalProcedureIdentifier(CC003CompositeMedicalProcedureIdentifier value) {
        this.cc003CompositeMedicalProcedureIdentifier = value;
    }

    /**
     * Gets the value of the esv302MonetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ESV302MonetaryAmount }
     *     
     */
    public ESV302MonetaryAmount getESV302MonetaryAmount() {
        return esv302MonetaryAmount;
    }

    /**
     * Sets the value of the esv302MonetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESV302MonetaryAmount }
     *     
     */
    public void setESV302MonetaryAmount(ESV302MonetaryAmount value) {
        this.esv302MonetaryAmount = value;
    }

    /**
     * Gets the value of the esv303FacilityCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESV303FacilityCodeValue }{@code >}
     *     
     */
    public JAXBElement<ESV303FacilityCodeValue> getESV303FacilityCodeValue() {
        return esv303FacilityCodeValue;
    }

    /**
     * Sets the value of the esv303FacilityCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESV303FacilityCodeValue }{@code >}
     *     
     */
    public void setESV303FacilityCodeValue(JAXBElement<ESV303FacilityCodeValue> value) {
        this.esv303FacilityCodeValue = ((JAXBElement<ESV303FacilityCodeValue> ) value);
    }

    /**
     * Gets the value of the cc006OralCavityDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CC006OralCavityDesignation }{@code >}
     *     
     */
    public JAXBElement<CC006OralCavityDesignation> getCC006OralCavityDesignation() {
        return cc006OralCavityDesignation;
    }

    /**
     * Sets the value of the cc006OralCavityDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CC006OralCavityDesignation }{@code >}
     *     
     */
    public void setCC006OralCavityDesignation(JAXBElement<CC006OralCavityDesignation> value) {
        this.cc006OralCavityDesignation = ((JAXBElement<CC006OralCavityDesignation> ) value);
    }

    /**
     * Gets the value of the esv305ProsthesisCrownOrInlayCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESV305ProsthesisCrownOrInlayCode }{@code >}
     *     
     */
    public JAXBElement<ESV305ProsthesisCrownOrInlayCode> getESV305ProsthesisCrownOrInlayCode() {
        return esv305ProsthesisCrownOrInlayCode;
    }

    /**
     * Sets the value of the esv305ProsthesisCrownOrInlayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESV305ProsthesisCrownOrInlayCode }{@code >}
     *     
     */
    public void setESV305ProsthesisCrownOrInlayCode(JAXBElement<ESV305ProsthesisCrownOrInlayCode> value) {
        this.esv305ProsthesisCrownOrInlayCode = ((JAXBElement<ESV305ProsthesisCrownOrInlayCode> ) value);
    }

    /**
     * Gets the value of the esv306Quantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESV306Quantity }{@code >}
     *     
     */
    public JAXBElement<ESV306Quantity> getESV306Quantity() {
        return esv306Quantity;
    }

    /**
     * Sets the value of the esv306Quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESV306Quantity }{@code >}
     *     
     */
    public void setESV306Quantity(JAXBElement<ESV306Quantity> value) {
        this.esv306Quantity = ((JAXBElement<ESV306Quantity> ) value);
    }

    /**
     * Gets the value of the esv307Description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESV307Description1 }{@code >}
     *     
     */
    public JAXBElement<ESV307Description1> getESV307Description() {
        return esv307Description;
    }

    /**
     * Sets the value of the esv307Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESV307Description1 }{@code >}
     *     
     */
    public void setESV307Description(JAXBElement<ESV307Description1> value) {
        this.esv307Description = ((JAXBElement<ESV307Description1> ) value);
    }

    /**
     * Gets the value of the esv308CopayStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESV308CopayStatusCode }{@code >}
     *     
     */
    public JAXBElement<ESV308CopayStatusCode> getESV308CopayStatusCode() {
        return esv308CopayStatusCode;
    }

    /**
     * Sets the value of the esv308CopayStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESV308CopayStatusCode }{@code >}
     *     
     */
    public void setESV308CopayStatusCode(JAXBElement<ESV308CopayStatusCode> value) {
        this.esv308CopayStatusCode = ((JAXBElement<ESV308CopayStatusCode> ) value);
    }

    /**
     * Gets the value of the esv309ProviderAgreementCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESV309ProviderAgreementCode }{@code >}
     *     
     */
    public JAXBElement<ESV309ProviderAgreementCode> getESV309ProviderAgreementCode() {
        return esv309ProviderAgreementCode;
    }

    /**
     * Sets the value of the esv309ProviderAgreementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESV309ProviderAgreementCode }{@code >}
     *     
     */
    public void setESV309ProviderAgreementCode(JAXBElement<ESV309ProviderAgreementCode> value) {
        this.esv309ProviderAgreementCode = ((JAXBElement<ESV309ProviderAgreementCode> ) value);
    }

    /**
     * Gets the value of the esv310YesNoConditionOrResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ESV310YesNoConditionOrResponseCode }{@code >}
     *     
     */
    public JAXBElement<ESV310YesNoConditionOrResponseCode> getESV310YesNoConditionOrResponseCode() {
        return esv310YesNoConditionOrResponseCode;
    }

    /**
     * Sets the value of the esv310YesNoConditionOrResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ESV310YesNoConditionOrResponseCode }{@code >}
     *     
     */
    public void setESV310YesNoConditionOrResponseCode(JAXBElement<ESV310YesNoConditionOrResponseCode> value) {
        this.esv310YesNoConditionOrResponseCode = ((JAXBElement<ESV310YesNoConditionOrResponseCode> ) value);
    }

    /**
     * Gets the value of the cc004CompositeDiagnosisCodePointer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CC004CompositeDiagnosisCodePointer }{@code >}
     *     
     */
    public JAXBElement<CC004CompositeDiagnosisCodePointer> getCC004CompositeDiagnosisCodePointer() {
        return cc004CompositeDiagnosisCodePointer;
    }

    /**
     * Sets the value of the cc004CompositeDiagnosisCodePointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CC004CompositeDiagnosisCodePointer }{@code >}
     *     
     */
    public void setCC004CompositeDiagnosisCodePointer(JAXBElement<CC004CompositeDiagnosisCodePointer> value) {
        this.cc004CompositeDiagnosisCodePointer = ((JAXBElement<CC004CompositeDiagnosisCodePointer> ) value);
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
            return "SV3";
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
            return "Dental Service";
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