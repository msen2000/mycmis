package org.delta.b2b.edi.handler.element;

import org.delta.b2b.edi.parser.EDIRow;
import org.delta.b2b.edi.t270.SBHTBeginningOfHierarchicalTransaction;
import org.delta.b2b.edi.t270.T270;

public class EQHandler {

	private SBHTBeginningOfHierarchicalTransaction sbht;
	
	public EQHandler(T270 t270, EDIRow row) {
		sbht = t270.getSBHTBeginningOfHierarchicalTransaction(); 
		
		process(row);
	}
	
	public void process(EDIRow row) {
		String[] arr = row.getElementsInArray();
		
	}

}
