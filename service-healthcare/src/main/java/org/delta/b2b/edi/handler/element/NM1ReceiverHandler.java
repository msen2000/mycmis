package org.delta.b2b.edi.handler.element;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.delta.b2b.edi.parser.EDIRow;
import org.delta.b2b.edi.t270.ENM101EntityIdentifierCode1;
import org.delta.b2b.edi.t270.ENM102EntityTypeQualifier;
import org.delta.b2b.edi.t270.ENM103NameLastOrOrganizationName;
import org.delta.b2b.edi.t270.ENM104NameFirst;
import org.delta.b2b.edi.t270.ENM105NameMiddle;
import org.delta.b2b.edi.t270.ENM106NamePrefix;
import org.delta.b2b.edi.t270.ENM107NameSuffix;
import org.delta.b2b.edi.t270.ENM108IdentificationCodeQualifier1;
import org.delta.b2b.edi.t270.ENM109IdentificationCode;
import org.delta.b2b.edi.t270.ENM110EntityRelationshipCode;
import org.delta.b2b.edi.t270.ENM111EntityIdentifierCode;
import org.delta.b2b.edi.t270.ENM112NameLastOrOrganizationName;
import org.delta.b2b.edi.t270.SNM1InformationReceiverName;

public class NM1ReceiverHandler {
	
	private SNM1InformationReceiverName snm1;
	
	public NM1ReceiverHandler(SNM1InformationReceiverName snm1, EDIRow row) {
		this.snm1 = snm1; 
		
		process(row);
	}
	
	public void process(EDIRow row) {
		String[] arr = row.getElementsInArray();
		
		System.out.println("NM1 array lenght :"+arr.length);
		ENM101EntityIdentifierCode1 e01 = new ENM101EntityIdentifierCode1();
		e01.setValue(arr[0]);
		snm1.setENM101EntityIdentifierCode(e01);
		
		ENM102EntityTypeQualifier e02 = new ENM102EntityTypeQualifier();
		e02.setValue(arr[1]);
		snm1.setENM102EntityTypeQualifier(e02);
		
		ENM103NameLastOrOrganizationName e03 = new ENM103NameLastOrOrganizationName();
		e03.setValue(arr[2]);
		snm1.setENM103NameLastOrOrganizationName(e03);
		
		ENM104NameFirst e04 = new ENM104NameFirst();
		e04.setValue(arr[3]);
		JAXBElement<ENM104NameFirst> jaxe04 = new JAXBElement(QName.valueOf("E-NM104-Name_First"), ENM104NameFirst.class, null, e04);
		snm1.setENM104NameFirst(jaxe04);
		
		ENM105NameMiddle e05 = new ENM105NameMiddle();
		e05.setValue(arr[4]);
		JAXBElement<ENM105NameMiddle> jaxe05 = new JAXBElement(QName.valueOf("E-NM105-Name_Middle"), ENM105NameMiddle.class, null, e05);
		snm1.setENM105NameMiddle(jaxe05);
		
		ENM106NamePrefix e06 = new ENM106NamePrefix();
		e06.setType(arr[5]);
		JAXBElement<ENM106NamePrefix> jaxe06 = new JAXBElement(QName.valueOf("E-NM106-Name_Prefix"), ENM106NamePrefix.class, null, e06);
		snm1.setENM106NamePrefix(jaxe06);
		
		ENM107NameSuffix e07 = new ENM107NameSuffix();
		e07.setValue(arr[6]);
		JAXBElement<ENM107NameSuffix> jaxe07 = new JAXBElement(QName.valueOf("E-NM107-Name_Suffix"), ENM107NameSuffix.class, null, e07);
		snm1.setENM107NameSuffix(jaxe07);
		
		ENM108IdentificationCodeQualifier1 e08 = new ENM108IdentificationCodeQualifier1();
		e08.setValue(arr[7]);
		snm1.setENM108IdentificationCodeQualifier(e08);
		
		ENM109IdentificationCode e09 = new ENM109IdentificationCode();
		e09.setValue(arr[8]);
		snm1.setENM109IdentificationCode(e09);
		/*
		ENM110EntityRelationshipCode e10 = new ENM110EntityRelationshipCode();
		e10.setType(arr[9]);
		JAXBElement<ENM110EntityRelationshipCode> jaxe10 = new JAXBElement(QName.valueOf("E-NM110-Entity_Relationship_Code"), ENM110EntityRelationshipCode.class, null, e10);
		snm1.setENM110EntityRelationshipCode(jaxe10);
		
		ENM111EntityIdentifierCode e11 = new ENM111EntityIdentifierCode();
		e11.setType(arr[10]);
		JAXBElement<ENM111EntityIdentifierCode> jaxe11 = new JAXBElement(QName.valueOf("E-NM111-Entity_Identifier_Code"), ENM111EntityIdentifierCode.class, null, e11);
		snm1.setENM111EntityIdentifierCode(jaxe11);
		
		ENM112NameLastOrOrganizationName e12 = new ENM112NameLastOrOrganizationName();
		e12.setType(arr[11]);
		JAXBElement<ENM112NameLastOrOrganizationName> jaxe12 = new JAXBElement(QName.valueOf("E-NM112-Name_Last_or_Organization_Name"), ENM112NameLastOrOrganizationName.class, null, e12);
		snm1.setENM112NameLastOrOrganizationName(jaxe12);
		*/
	}
}
