/**
 * 
 */
package org.sen.b2b.edi.handler.header;

import org.sen.b2b.edi.parser.Row;
import org.sen.b2b.edi.t271.EST01TransactionSetIdentifierCode;
import org.sen.b2b.edi.t271.EST02TransactionSetControlNumber;
import org.sen.b2b.edi.t271.EST03ImplementationConventionReference;
import org.sen.b2b.edi.t271.SSTTransactionSetHeader;
import org.sen.b2b.edi.t271.T271;

/**
 * @author ca31085
 *
 */
public class STHandler {

	private SSTTransactionSetHeader sst;
	
	public STHandler(T271 t271, Row row) {
		sst = t271.getSSTTransactionSetHeader(); 
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
