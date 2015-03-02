package org.sen.b2b.edi.handler.element;

import org.sen.b2b.edi.parser.EDIRow;
import org.sen.b2b.edi.t270.SBHTBeginningOfHierarchicalTransaction;
import org.sen.b2b.edi.t270.T270;

public class ISAMapper {

	private SBHTBeginningOfHierarchicalTransaction sbht;
	
	public ISAMapper(T270 t270, EDIRow row) {
		sbht = t270.getSBHTBeginningOfHierarchicalTransaction(); 
		
		process(row);
	}
	
	public void process(EDIRow row) {
		String[] arr = row.getElementsInArray();
		
	}

	
}
