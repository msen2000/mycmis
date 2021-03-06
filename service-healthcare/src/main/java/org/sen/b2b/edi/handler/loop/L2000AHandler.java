package org.sen.b2b.edi.handler.loop;

import org.sen.b2b.edi.parser.EDIRow;
import org.sen.b2b.edi.t270.L2000A;
import org.sen.b2b.edi.t270.L2100A;

public class L2000AHandler {
	
	public L2000AHandler(L2000A obj, EDIRow row ) {
		process(row, obj);
	}
	
	public void process(EDIRow row, L2000A obj) {
		String[] arr = row.getElementsInArray();		
		
		L2100A l2100a = new L2100A();
		L2100AHandler l2100h = new L2100AHandler(l2100a, row);		
		obj.setL2100A(l2100a);
	
		
	}
}
