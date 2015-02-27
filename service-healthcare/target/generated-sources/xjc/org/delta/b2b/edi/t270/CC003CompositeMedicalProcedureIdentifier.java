//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.03 at 11:47:13 AM PDT 
//


package org.delta.b2b.edi.t270;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a medical procedure by its standardized codes and applicable modifiers 
 * 
 * <p>Java class for C-C003-Composite_Medical_Procedure_Identifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C-C003-Composite_Medical_Procedure_Identifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-EQ01-Product_Service_ID_Qualifier" type="{http://www.delta.org/b2b/edi/t270}E-EQ01-Product_Service_ID_Qualifier"/>
 *         &lt;element name="E-EQ02-Product_Service_ID" type="{http://www.delta.org/b2b/edi/t270}E-EQ02-Product_Service_ID"/>
 *         &lt;element name="E-EQ03-Procedure_Modifier" type="{http://www.delta.org/b2b/edi/t270}E-EQ03-Procedure_Modifier" minOccurs="0"/>
 *         &lt;element name="E-EQ04-Procedure_Modifier" type="{http://www.delta.org/b2b/edi/t270}E-EQ04-Procedure_Modifier" minOccurs="0"/>
 *         &lt;element name="E-EQ05-Procedure_Modifier" type="{http://www.delta.org/b2b/edi/t270}E-EQ05-Procedure_Modifier" minOccurs="0"/>
 *         &lt;element name="E-EQ06-Procedure_Modifier" type="{http://www.delta.org/b2b/edi/t270}E-EQ06-Procedure_Modifier" minOccurs="0"/>
 *         &lt;element name="E-EQ07-Description" type="{http://www.delta.org/b2b/edi/t270}E-EQ07-Description" minOccurs="0"/>
 *         &lt;element name="E-EQ08-Product_Service_ID" type="{http://www.delta.org/b2b/edi/t270}E-EQ08-Product_Service_ID" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ApplicationInfo" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Required if utilizing a Medical Procedure Code inquiry when the information receiver believes that the information source supports this high level of functionality and EQ01 is not used. If not required by this implementation guide, do not send." />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="C003" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Composite Medical Procedure Identifier" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Composite" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C-C003-Composite_Medical_Procedure_Identifier", propOrder = {
    "eeq01ProductServiceIDQualifier",
    "eeq02ProductServiceID",
    "eeq03ProcedureModifier",
    "eeq04ProcedureModifier",
    "eeq05ProcedureModifier",
    "eeq06ProcedureModifier",
    "eeq07Description",
    "eeq08ProductServiceID"
})
public class CC003CompositeMedicalProcedureIdentifier {

    @XmlElement(name = "E-EQ01-Product_Service_ID_Qualifier", required = true)
    protected EEQ01ProductServiceIDQualifier eeq01ProductServiceIDQualifier;
    @XmlElement(name = "E-EQ02-Product_Service_ID", required = true)
    protected EEQ02ProductServiceID eeq02ProductServiceID;
    @XmlElementRef(name = "E-EQ03-Procedure_Modifier", namespace = "http://www.delta.org/b2b/edi/t270", type = JAXBElement.class)
    protected JAXBElement<EEQ03ProcedureModifier> eeq03ProcedureModifier;
    @XmlElementRef(name = "E-EQ04-Procedure_Modifier", namespace = "http://www.delta.org/b2b/edi/t270", type = JAXBElement.class)
    protected JAXBElement<EEQ04ProcedureModifier> eeq04ProcedureModifier;
    @XmlElementRef(name = "E-EQ05-Procedure_Modifier", namespace = "http://www.delta.org/b2b/edi/t270", type = JAXBElement.class)
    protected JAXBElement<EEQ05ProcedureModifier> eeq05ProcedureModifier;
    @XmlElementRef(name = "E-EQ06-Procedure_Modifier", namespace = "http://www.delta.org/b2b/edi/t270", type = JAXBElement.class)
    protected JAXBElement<EEQ06ProcedureModifier> eeq06ProcedureModifier;
    @XmlElementRef(name = "E-EQ07-Description", namespace = "http://www.delta.org/b2b/edi/t270", type = JAXBElement.class)
    protected JAXBElement<EEQ07Description> eeq07Description;
    @XmlElementRef(name = "E-EQ08-Product_Service_ID", namespace = "http://www.delta.org/b2b/edi/t270", type = JAXBElement.class)
    protected JAXBElement<EEQ08ProductServiceID> eeq08ProductServiceID;
    @XmlAttribute(name = "ApplicationInfo")
    protected String applicationInfo;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the eeq01ProductServiceIDQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link EEQ01ProductServiceIDQualifier }
     *     
     */
    public EEQ01ProductServiceIDQualifier getEEQ01ProductServiceIDQualifier() {
        return eeq01ProductServiceIDQualifier;
    }

    /**
     * Sets the value of the eeq01ProductServiceIDQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EEQ01ProductServiceIDQualifier }
     *     
     */
    public void setEEQ01ProductServiceIDQualifier(EEQ01ProductServiceIDQualifier value) {
        this.eeq01ProductServiceIDQualifier = value;
    }

    /**
     * Gets the value of the eeq02ProductServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link EEQ02ProductServiceID }
     *     
     */
    public EEQ02ProductServiceID getEEQ02ProductServiceID() {
        return eeq02ProductServiceID;
    }

    /**
     * Sets the value of the eeq02ProductServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EEQ02ProductServiceID }
     *     
     */
    public void setEEQ02ProductServiceID(EEQ02ProductServiceID value) {
        this.eeq02ProductServiceID = value;
    }

    /**
     * Gets the value of the eeq03ProcedureModifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EEQ03ProcedureModifier }{@code >}
     *     
     */
    public JAXBElement<EEQ03ProcedureModifier> getEEQ03ProcedureModifier() {
        return eeq03ProcedureModifier;
    }

    /**
     * Sets the value of the eeq03ProcedureModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EEQ03ProcedureModifier }{@code >}
     *     
     */
    public void setEEQ03ProcedureModifier(JAXBElement<EEQ03ProcedureModifier> value) {
        this.eeq03ProcedureModifier = ((JAXBElement<EEQ03ProcedureModifier> ) value);
    }

    /**
     * Gets the value of the eeq04ProcedureModifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EEQ04ProcedureModifier }{@code >}
     *     
     */
    public JAXBElement<EEQ04ProcedureModifier> getEEQ04ProcedureModifier() {
        return eeq04ProcedureModifier;
    }

    /**
     * Sets the value of the eeq04ProcedureModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EEQ04ProcedureModifier }{@code >}
     *     
     */
    public void setEEQ04ProcedureModifier(JAXBElement<EEQ04ProcedureModifier> value) {
        this.eeq04ProcedureModifier = ((JAXBElement<EEQ04ProcedureModifier> ) value);
    }

    /**
     * Gets the value of the eeq05ProcedureModifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EEQ05ProcedureModifier }{@code >}
     *     
     */
    public JAXBElement<EEQ05ProcedureModifier> getEEQ05ProcedureModifier() {
        return eeq05ProcedureModifier;
    }

    /**
     * Sets the value of the eeq05ProcedureModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EEQ05ProcedureModifier }{@code >}
     *     
     */
    public void setEEQ05ProcedureModifier(JAXBElement<EEQ05ProcedureModifier> value) {
        this.eeq05ProcedureModifier = ((JAXBElement<EEQ05ProcedureModifier> ) value);
    }

    /**
     * Gets the value of the eeq06ProcedureModifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EEQ06ProcedureModifier }{@code >}
     *     
     */
    public JAXBElement<EEQ06ProcedureModifier> getEEQ06ProcedureModifier() {
        return eeq06ProcedureModifier;
    }

    /**
     * Sets the value of the eeq06ProcedureModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EEQ06ProcedureModifier }{@code >}
     *     
     */
    public void setEEQ06ProcedureModifier(JAXBElement<EEQ06ProcedureModifier> value) {
        this.eeq06ProcedureModifier = ((JAXBElement<EEQ06ProcedureModifier> ) value);
    }

    /**
     * Gets the value of the eeq07Description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EEQ07Description }{@code >}
     *     
     */
    public JAXBElement<EEQ07Description> getEEQ07Description() {
        return eeq07Description;
    }

    /**
     * Sets the value of the eeq07Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EEQ07Description }{@code >}
     *     
     */
    public void setEEQ07Description(JAXBElement<EEQ07Description> value) {
        this.eeq07Description = ((JAXBElement<EEQ07Description> ) value);
    }

    /**
     * Gets the value of the eeq08ProductServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EEQ08ProductServiceID }{@code >}
     *     
     */
    public JAXBElement<EEQ08ProductServiceID> getEEQ08ProductServiceID() {
        return eeq08ProductServiceID;
    }

    /**
     * Sets the value of the eeq08ProductServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EEQ08ProductServiceID }{@code >}
     *     
     */
    public void setEEQ08ProductServiceID(JAXBElement<EEQ08ProductServiceID> value) {
        this.eeq08ProductServiceID = ((JAXBElement<EEQ08ProductServiceID> ) value);
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
            return "Required if utilizing a Medical Procedure Code inquiry when the information receiver believes that the information source supports this high level of functionality and EQ01 is not used. If not required by this implementation guide, do not send.";
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
            return "C003";
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
            return "Composite Medical Procedure Identifier";
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
