package org.sen.b2b.edi.handler.loop;

import org.sen.b2b.edi.handler.element.NM1SourceHandler;
import org.sen.b2b.edi.parser.EDIRow;
import org.sen.b2b.edi.t270.L2100A;
import org.sen.b2b.edi.t270.SNM1InformationSourceName;

public class L2100AHandler {
	
	private L2100A l2100a;
	
	public L2100AHandler(L2100A obj, EDIRow row) {
		l2100a = obj; 		
		process(row);
	}
	
	public void process(EDIRow row) {
		String[] arr = row.getElementsInArray();
		
		SNM1InformationSourceName snm1 = new SNM1InformationSourceName();
		NM1SourceHandler nm1h = new NM1SourceHandler(snm1, row);		
		l2100a.setSNM1InformationSourceName(snm1);
	}
}
