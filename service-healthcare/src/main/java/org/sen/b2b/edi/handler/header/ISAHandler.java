package org.sen.b2b.edi.handler.header;

import org.sen.b2b.edi.parser.EDIRow;
import org.sen.b2b.edi.t270.EISA01AuthorizationInformationQualifier;
import org.sen.b2b.edi.t270.EISA02AuthorizationInformation;
import org.sen.b2b.edi.t270.EISA03SecurityInformationQualifier;
import org.sen.b2b.edi.t270.EISA04SecurityInformation;
import org.sen.b2b.edi.t270.EISA05InterchangeIDQualifier;
import org.sen.b2b.edi.t270.EISA06InterchangeSenderID;
import org.sen.b2b.edi.t270.EISA07InterchangeIDQualifier;
import org.sen.b2b.edi.t270.EISA08InterchangeReceiverID;
import org.sen.b2b.edi.t270.EISA09InterchangeDate;
import org.sen.b2b.edi.t270.EISA10InterchangeTime;
import org.sen.b2b.edi.t270.EISA11RepetitionSeparator;
import org.sen.b2b.edi.t270.EISA12InterchangeControlVersionNumber;
import org.sen.b2b.edi.t270.EISA13InterchangeControlNumber;
import org.sen.b2b.edi.t270.EISA14AcknowledgmentRequested;
import org.sen.b2b.edi.t270.EISA15InterchangeUsageIndicator;
import org.sen.b2b.edi.t270.EISA16ComponentElementSeparator;
import org.sen.b2b.edi.t270.SISAInterchangeControlHeader;

public class ISAHandler {

	private SISAInterchangeControlHeader isah;
	
	public ISAHandler(SISAInterchangeControlHeader isah, EDIRow row) {
		this.isah = isah;
		process(row);
	}
	
	public void process(EDIRow row) {
		String[] arr = row.getElementsInArray();
		
		EISA01AuthorizationInformationQualifier eisa01 = new EISA01AuthorizationInformationQualifier();
		eisa01.setValue(arr[0]);
		isah.setEISA01AuthorizationInformationQualifier(eisa01);
		
		EISA02AuthorizationInformation eisa02 = new EISA02AuthorizationInformation();
		eisa02.setValue(arr[1]);
		isah.setEISA02AuthorizationInformation(eisa02);
		
		EISA03SecurityInformationQualifier e03 = new EISA03SecurityInformationQualifier();
		e03.setValue(arr[2]);
		isah.setEISA03SecurityInformationQualifier(e03);
		
		EISA04SecurityInformation e04 = new EISA04SecurityInformation();
		e04.setValue(arr[3]);
		isah.setEISA04SecurityInformation(e04);
		
		EISA05InterchangeIDQualifier e05 = new EISA05InterchangeIDQualifier();
		e05.setValue(arr[4]);
		isah.setEISA05InterchangeIDQualifier(e05);
		
		EISA06InterchangeSenderID e06 = new EISA06InterchangeSenderID();
		e06.setValue(arr[5]);
		isah.setEISA06InterchangeSenderID(e06);
		
		EISA07InterchangeIDQualifier e07 = new EISA07InterchangeIDQualifier();
		e07.setValue(arr[6]);
		isah.setEISA07InterchangeIDQualifier(e07);
		
		EISA08InterchangeReceiverID e08 = new EISA08InterchangeReceiverID();
		e08.setValue(arr[7]);
		isah.setEISA08InterchangeReceiverID(e08);
		
		EISA09InterchangeDate e09 = new EISA09InterchangeDate();
		e09.setValue(arr[8]);
		isah.setEISA09InterchangeDate(e09);
		
		EISA10InterchangeTime e10 = new EISA10InterchangeTime();
		e10.setValue(arr[9]);
		isah.setEISA10InterchangeTime(e10);
		
		EISA11RepetitionSeparator e11 = new EISA11RepetitionSeparator();
		e11.setValue(arr[10]);
		isah.setEISA11RepetitionSeparator(e11);
		
		EISA12InterchangeControlVersionNumber e12 = new EISA12InterchangeControlVersionNumber();
		e12.setValue(arr[11]);
		isah.setEISA12InterchangeControlVersionNumber(e12);
		
		EISA13InterchangeControlNumber e13 = new EISA13InterchangeControlNumber();
		e13.setName(arr[12]);
		isah.setEISA13InterchangeControlNumber(e13);
		
		EISA14AcknowledgmentRequested e14 = new EISA14AcknowledgmentRequested();
		e14.setValue(arr[13]);
		isah.setEISA14AcknowledgmentRequested(e14);
		
		EISA15InterchangeUsageIndicator e15 = new EISA15InterchangeUsageIndicator();
		e15.setValue(arr[14]);
		isah.setEISA15InterchangeUsageIndicator(e15);
		
		EISA16ComponentElementSeparator e16  = new EISA16ComponentElementSeparator();
		e16.setValue(arr[15]);
		isah.setEISA16ComponentElementSeparator(e16);
		
	}
}
