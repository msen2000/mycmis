//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.03 at 11:47:13 AM PDT 
//


package org.delta.b2b.edi.t271;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify one or more diagnosis code pointers 
 * 
 * <p>Java class for C-C004-Composite_Diagnosis_Code_Pointer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C-C004-Composite_Diagnosis_Code_Pointer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-EB01-Diagnosis_Code_Pointer" type="{http://www.delta.org/b2b/edi/t271}E-EB01-Diagnosis_Code_Pointer"/>
 *         &lt;element name="E-EB02-Diagnosis_Code_Pointer" type="{http://www.delta.org/b2b/edi/t271}E-EB02-Diagnosis_Code_Pointer" minOccurs="0"/>
 *         &lt;element name="E-EB03-Diagnosis_Code_Pointer" type="{http://www.delta.org/b2b/edi/t271}E-EB03-Diagnosis_Code_Pointer" minOccurs="0"/>
 *         &lt;element name="E-EB04-Diagnosis_Code_Pointer" type="{http://www.delta.org/b2b/edi/t271}E-EB04-Diagnosis_Code_Pointer" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ApplicationInfo" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Required when a 2100C HI segment is used and the information in this 2110C EB loop is related to a diagnosis code. If 2100C HI segment is not used or if the information in this 2110C EB loop is not related to a diagnosis code, do not send." />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="C004" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Composite Diagnosis Code Pointer" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Composite" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C-C004-Composite_Diagnosis_Code_Pointer", propOrder = {
    "eeb01DiagnosisCodePointer",
    "eeb02DiagnosisCodePointer",
    "eeb03DiagnosisCodePointer",
    "eeb04DiagnosisCodePointer"
})
public class CC004CompositeDiagnosisCodePointer {

    @XmlElement(name = "E-EB01-Diagnosis_Code_Pointer", required = true)
    protected EEB01DiagnosisCodePointer eeb01DiagnosisCodePointer;
    @XmlElementRef(name = "E-EB02-Diagnosis_Code_Pointer", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EEB02DiagnosisCodePointer> eeb02DiagnosisCodePointer;
    @XmlElementRef(name = "E-EB03-Diagnosis_Code_Pointer", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EEB03DiagnosisCodePointer> eeb03DiagnosisCodePointer;
    @XmlElementRef(name = "E-EB04-Diagnosis_Code_Pointer", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EEB04DiagnosisCodePointer> eeb04DiagnosisCodePointer;
    @XmlAttribute(name = "ApplicationInfo")
    protected String applicationInfo;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the eeb01DiagnosisCodePointer property.
     * 
     * @return
     *     possible object is
     *     {@link EEB01DiagnosisCodePointer }
     *     
     */
    public EEB01DiagnosisCodePointer getEEB01DiagnosisCodePointer() {
        return eeb01DiagnosisCodePointer;
    }

    /**
     * Sets the value of the eeb01DiagnosisCodePointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EEB01DiagnosisCodePointer }
     *     
     */
    public void setEEB01DiagnosisCodePointer(EEB01DiagnosisCodePointer value) {
        this.eeb01DiagnosisCodePointer = value;
    }

    /**
     * Gets the value of the eeb02DiagnosisCodePointer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EEB02DiagnosisCodePointer }{@code >}
     *     
     */
    public JAXBElement<EEB02DiagnosisCodePointer> getEEB02DiagnosisCodePointer() {
        return eeb02DiagnosisCodePointer;
    }

    /**
     * Sets the value of the eeb02DiagnosisCodePointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EEB02DiagnosisCodePointer }{@code >}
     *     
     */
    public void setEEB02DiagnosisCodePointer(JAXBElement<EEB02DiagnosisCodePointer> value) {
        this.eeb02DiagnosisCodePointer = ((JAXBElement<EEB02DiagnosisCodePointer> ) value);
    }

    /**
     * Gets the value of the eeb03DiagnosisCodePointer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EEB03DiagnosisCodePointer }{@code >}
     *     
     */
    public JAXBElement<EEB03DiagnosisCodePointer> getEEB03DiagnosisCodePointer() {
        return eeb03DiagnosisCodePointer;
    }

    /**
     * Sets the value of the eeb03DiagnosisCodePointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EEB03DiagnosisCodePointer }{@code >}
     *     
     */
    public void setEEB03DiagnosisCodePointer(JAXBElement<EEB03DiagnosisCodePointer> value) {
        this.eeb03DiagnosisCodePointer = ((JAXBElement<EEB03DiagnosisCodePointer> ) value);
    }

    /**
     * Gets the value of the eeb04DiagnosisCodePointer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EEB04DiagnosisCodePointer }{@code >}
     *     
     */
    public JAXBElement<EEB04DiagnosisCodePointer> getEEB04DiagnosisCodePointer() {
        return eeb04DiagnosisCodePointer;
    }

    /**
     * Sets the value of the eeb04DiagnosisCodePointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EEB04DiagnosisCodePointer }{@code >}
     *     
     */
    public void setEEB04DiagnosisCodePointer(JAXBElement<EEB04DiagnosisCodePointer> value) {
        this.eeb04DiagnosisCodePointer = ((JAXBElement<EEB04DiagnosisCodePointer> ) value);
    }

    /**
     * Gets the value of the applicationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationInfo() {
        if (applicationInfo == null) {
            return "Required when a 2100C HI segment is used and the information in this 2110C EB loop is related to a diagnosis code. If 2100C HI segment is not used or if the information in this 2110C EB loop is not related to a diagnosis code, do not send.";
        } else {
            return applicationInfo;
        }
    }

    /**
     * Sets the value of the applicationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationInfo(String value) {
        this.applicationInfo = value;
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
            return "C004";
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
            return "Composite Diagnosis Code Pointer";
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
