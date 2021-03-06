/**
 * 
 */
package org.sen.b2b.edi.handler.header;

import java.math.BigInteger;

import org.sen.b2b.edi.parser.EDIRow;
import org.sen.b2b.edi.t270.*;

/**
 * @author sen
 *
 */
public class GSHandler {
	

	private SGSFunctionalGroupHeader sgs;
	
	public GSHandler(T270 t270, EDIRow row) {
		sgs = t270.getSGSFunctionalGroupHeader();
		process(row);		
	}
	
	public void process(EDIRow row) {
		String[] arr = row.getElementsInArray();
		System.out.println("GS array size "+arr.length);
		
		EGS01FunctionalIdentifierCode e01 = new EGS01FunctionalIdentifierCode();
		e01.setValue(arr[0]);
		sgs.setEGS01FunctionalIdentifierCode(e01);
		EGS02ApplicationSenderSCode e02 = new EGS02ApplicationSenderSCode();
		e02.setValue(arr[1]);
		sgs.setEGS02ApplicationSenderSCode(e02);
		EGS03ApplicationReceiverSCode e03 = new EGS03ApplicationReceiverSCode();
		e03.setValue(arr[2]);
		sgs.setEGS03ApplicationReceiverSCode(e03);
		EGS04Date e04 = new EGS04Date();
		e04.setValue(arr[3]);
		sgs.setEGS04Date(e04);
		EGS05Time e05 = new EGS05Time();
		e05.setValue(arr[4]);
		sgs.setEGS05Time(e05);
		EGS06GroupControlNumber e06 = new EGS06GroupControlNumber();
		e06.setValue(BigInteger.valueOf(100));
		sgs.setEGS06GroupControlNumber(e06);
		EGS07ResponsibleAgencyCode e07 = new EGS07ResponsibleAgencyCode();
		e07.setValue(arr[6]);
		sgs.setEGS07ResponsibleAgencyCode(e07);
		EGS08VersionReleaseIndustryIdentifierCode e08 = new EGS08VersionReleaseIndustryIdentifierCode();
		e08.setValue(arr[7]);
		sgs.setEGS08VersionReleaseIndustryIdentifierCode(e08);
		
		
	}
}
