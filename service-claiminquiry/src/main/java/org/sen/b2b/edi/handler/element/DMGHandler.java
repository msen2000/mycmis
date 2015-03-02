package org.sen.b2b.edi.handler.element;

import org.sen.b2b.edi.parser.Row;
import org.sen.b2b.edi.t276.SSTTransactionSetHeader;
import org.sen.b2b.edi.t276.T276;

public class DMGHandler {

	private SSTTransactionSetHeader sst;
	
	public DMGHandler(T276 t276, Row row) {
		sst = t276.getSSTTransactionSetHeader(); 
		
		process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		
	}
}
