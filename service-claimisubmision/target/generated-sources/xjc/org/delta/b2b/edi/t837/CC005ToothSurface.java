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
 * To identify one or more tooth surface codes 
 * 
 * <p>Java class for C-C005-Tooth_Surface complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C-C005-Tooth_Surface">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-TOO01-Tooth_Surface_Code" type="{http://www.delta.org/b2b/edi/t837}E-TOO01-Tooth_Surface_Code"/>
 *         &lt;element name="E-TOO02-Tooth_Surface_Code" type="{http://www.delta.org/b2b/edi/t837}E-TOO02-Tooth_Surface_Code" minOccurs="0"/>
 *         &lt;element name="E-TOO03-Tooth_Surface_Code" type="{http://www.delta.org/b2b/edi/t837}E-TOO03-Tooth_Surface_Code" minOccurs="0"/>
 *         &lt;element name="E-TOO04-Tooth_Surface_Code" type="{http://www.delta.org/b2b/edi/t837}E-TOO04-Tooth_Surface_Code" minOccurs="0"/>
 *         &lt;element name="E-TOO05-Tooth_Surface_Code" type="{http://www.delta.org/b2b/edi/t837}E-TOO05-Tooth_Surface_Code" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ApplicationInfo" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Required when the procedure code requires tooth surface codes. If not required by this implementation guide, do not send." />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="C005" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Tooth Surface" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Composite" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C-C005-Tooth_Surface", propOrder = {
    "etoo01ToothSurfaceCode",
    "etoo02ToothSurfaceCode",
    "etoo03ToothSurfaceCode",
    "etoo04ToothSurfaceCode",
    "etoo05ToothSurfaceCode"
})
public class CC005ToothSurface {

    @XmlElement(name = "E-TOO01-Tooth_Surface_Code", required = true)
    protected ETOO01ToothSurfaceCode etoo01ToothSurfaceCode;
    @XmlElementRef(name = "E-TOO02-Tooth_Surface_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ETOO02ToothSurfaceCode> etoo02ToothSurfaceCode;
    @XmlElementRef(name = "E-TOO03-Tooth_Surface_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ETOO03ToothSurfaceCode> etoo03ToothSurfaceCode;
    @XmlElementRef(name = "E-TOO04-Tooth_Surface_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ETOO04ToothSurfaceCode> etoo04ToothSurfaceCode;
    @XmlElementRef(name = "E-TOO05-Tooth_Surface_Code", namespace = "http://www.delta.org/b2b/edi/t837", type = JAXBElement.class)
    protected JAXBElement<ETOO05ToothSurfaceCode> etoo05ToothSurfaceCode;
    @XmlAttribute(name = "ApplicationInfo")
    protected String applicationInfo;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the etoo01ToothSurfaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link ETOO01ToothSurfaceCode }
     *     
     */
    public ETOO01ToothSurfaceCode getETOO01ToothSurfaceCode() {
        return etoo01ToothSurfaceCode;
    }

    /**
     * Sets the value of the etoo01ToothSurfaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETOO01ToothSurfaceCode }
     *     
     */
    public void setETOO01ToothSurfaceCode(ETOO01ToothSurfaceCode value) {
        this.etoo01ToothSurfaceCode = value;
    }

    /**
     * Gets the value of the etoo02ToothSurfaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ETOO02ToothSurfaceCode }{@code >}
     *     
     */
    public JAXBElement<ETOO02ToothSurfaceCode> getETOO02ToothSurfaceCode() {
        return etoo02ToothSurfaceCode;
    }

    /**
     * Sets the value of the etoo02ToothSurfaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ETOO02ToothSurfaceCode }{@code >}
     *     
     */
    public void setETOO02ToothSurfaceCode(JAXBElement<ETOO02ToothSurfaceCode> value) {
        this.etoo02ToothSurfaceCode = ((JAXBElement<ETOO02ToothSurfaceCode> ) value);
    }

    /**
     * Gets the value of the etoo03ToothSurfaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ETOO03ToothSurfaceCode }{@code >}
     *     
     */
    public JAXBElement<ETOO03ToothSurfaceCode> getETOO03ToothSurfaceCode() {
        return etoo03ToothSurfaceCode;
    }

    /**
     * Sets the value of the etoo03ToothSurfaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ETOO03ToothSurfaceCode }{@code >}
     *     
     */
    public void setETOO03ToothSurfaceCode(JAXBElement<ETOO03ToothSurfaceCode> value) {
        this.etoo03ToothSurfaceCode = ((JAXBElement<ETOO03ToothSurfaceCode> ) value);
    }

    /**
     * Gets the value of the etoo04ToothSurfaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ETOO04ToothSurfaceCode }{@code >}
     *     
     */
    public JAXBElement<ETOO04ToothSurfaceCode> getETOO04ToothSurfaceCode() {
        return etoo04ToothSurfaceCode;
    }

    /**
     * Sets the value of the etoo04ToothSurfaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ETOO04ToothSurfaceCode }{@code >}
     *     
     */
    public void setETOO04ToothSurfaceCode(JAXBElement<ETOO04ToothSurfaceCode> value) {
        this.etoo04ToothSurfaceCode = ((JAXBElement<ETOO04ToothSurfaceCode> ) value);
    }

    /**
     * Gets the value of the etoo05ToothSurfaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ETOO05ToothSurfaceCode }{@code >}
     *     
     */
    public JAXBElement<ETOO05ToothSurfaceCode> getETOO05ToothSurfaceCode() {
        return etoo05ToothSurfaceCode;
    }

    /**
     * Sets the value of the etoo05ToothSurfaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ETOO05ToothSurfaceCode }{@code >}
     *     
     */
    public void setETOO05ToothSurfaceCode(JAXBElement<ETOO05ToothSurfaceCode> value) {
        this.etoo05ToothSurfaceCode = ((JAXBElement<ETOO05ToothSurfaceCode> ) value);
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
            return "Required when the procedure code requires tooth surface codes. If not required by this implementation guide, do not send.";
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
            return "C005";
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
            return "Tooth Surface";
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