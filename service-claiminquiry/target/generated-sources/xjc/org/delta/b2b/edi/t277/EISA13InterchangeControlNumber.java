//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.24 at 03:57:26 PM PDT 
//


package org.delta.b2b.edi.t277;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A control number assigned by the interchange sender
 * 
 * <p>Java class for E-ISA13-Interchange_Control_Number complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="E-ISA13-Interchange_Control_Number">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://www.delta.org/b2b/edi/t277>EDI-Element-Integer-Type">
 *       &lt;attribute name="EDIDataType" type="{http://www.w3.org/2001/XMLSchema}string" fixed="N0" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" fixed="I12" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Interchange Control Number" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "E-ISA13-Interchange_Control_Number")
public class EISA13InterchangeControlNumber
    extends EDIElementIntegerType
{


}
