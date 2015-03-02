/**
 * 
 */
package org.sen.b2b.edi.handler.header;

import org.sen.b2b.edi.parser.EDIRow;
import org.sen.b2b.edi.t270.SSTTransactionSetHeader;
import org.sen.b2b.edi.t270.*;

/**
 * @author ca31085
 *
 */
public class STHandler {

	private SSTTransactionSetHeader sst;
	
	public STHandler(T270 t270, EDIRow row) {
		sst = t270.getSSTTransactionSetHeader(); 
		process(row);
	}
	
	public void process(EDIRow row) {
		String[] arr = row.getElementsInArray();
	
		EST01TransactionSetIdentifierCode e01 = new EST01TransactionSetIdentifierCode();
		e01.setValue(arr[0]);
		sst.setEST01TransactionSetIdentifierCode(e01);
		
		EST02TransactionSetControlNumber e02 = new EST02TransactionSetControlNumber();
		e02.setValue(arr[1]);
		sst.setEST02TransactionSetControlNumber(e02);

		if (arr.length > 2) {
			EST03ImplementationConventionReference e03 = new EST03ImplementationConventionReference();
			e03.setValue(arr[2]);
			sst.setEST03ImplementationConventionReference(e03);
		}
	}

}
