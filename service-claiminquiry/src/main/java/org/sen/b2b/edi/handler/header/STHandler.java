/**
 * 
 */
package org.sen.b2b.edi.handler.header;

import org.sen.b2b.edi.parser.Row;
import org.sen.b2b.edi.t276.SSTTransactionSetHeader;
import org.sen.b2b.edi.t276.*;

/**
 * @author sen
 *
 */
public class STHandler {

	private SSTTransactionSetHeader sst;
	
	public STHandler(T276 t276, Row row) {
		sst = t276.getSSTTransactionSetHeader(); 
		process(row);
	}
	
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
	
		EST01TransactionSetIdentifierCode e01 = new EST01TransactionSetIdentifierCode();
		e01.setValue(arr[0]);
		sst.setEST01TransactionSetIdentifierCode(e01);
		
		EST02TransactionSetControlNumber e02 = new EST02TransactionSetControlNumber();
		e02.setValue(arr[1]);
		sst.setEST02TransactionSetControlNumber(e02);

		EST03ImplementationConventionReference e03 = new EST03ImplementationConventionReference();
		e03.setValue(arr[2]);
		sst.setEST03ImplementationConventionReference(e03);
	}

}
