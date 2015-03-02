package org.sen.b2b.edi.handler.element;

import org.sen.b2b.edi.parser.Row;
import org.sen.b2b.edi.t271.SSTTransactionSetHeader;
import org.sen.b2b.edi.t271.T271;

public class DMGHandler {

	private SSTTransactionSetHeader sst;
	
	public DMGHandler(T271 t271, Row row) {
		sst = t271.getSSTTransactionSetHeader(); 
		
		process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		
	}
}
