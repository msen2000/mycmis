package org.sen.b2b.edi.handler.element;

import org.sen.b2b.edi.parser.Row;
import org.sen.b2b.edi.t271.L2115C;
import org.sen.b2b.edi.t271.T271;

public class LSHandler {
	private L2115C l2115c;
	
	public LSHandler(T271 t271, Row row) {
				
		l2115c = new L2115C(); 		
		process(row);
	}
	
	public void process(Row row) {
	
	}
}
