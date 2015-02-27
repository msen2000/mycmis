package org.delta.b2b.edi.handler.element;

import org.delta.b2b.edi.parser.EDIRow;
import org.delta.b2b.edi.t270.SSTTransactionSetHeader;
import org.delta.b2b.edi.t270.T270;

public class DMGHandler {

	private SSTTransactionSetHeader sst;
	
	public DMGHandler(T270 t270, EDIRow row) {
		sst = t270.getSSTTransactionSetHeader(); 
		
		process(row);
	}
	
	public void process(EDIRow row) {
		String[] arr = row.getElementsInArray();
		
	}
}
