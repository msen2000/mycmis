package org.delta.b2b.edi.handler.trailer;

import org.delta.b2b.edi.parser.EDIRow;
import org.delta.b2b.edi.t270.SSETransactionSetTrailer;
import org.delta.b2b.edi.t270.*;

public class SEHandler {

	private SSETransactionSetTrailer sse;
	
	public SEHandler(T270 t270, EDIRow row) {
		sse = t270.getSSETransactionSetTrailer(); 
		process(row);
	}
	
	public void process(EDIRow row) {
		String[] arr = row.getElementsInArray();
		
		ESE01NumberOfIncludedSegments e01 = new ESE01NumberOfIncludedSegments();
		e01.setValue(arr[0]);
		sse.setESE01NumberOfIncludedSegments(e01);
		
		ESE02TransactionSetControlNumber e02 = new ESE02TransactionSetControlNumber();
		e02.setValue(arr[1]);
		sse.setESE02TransactionSetControlNumber(e02);
	}
}
