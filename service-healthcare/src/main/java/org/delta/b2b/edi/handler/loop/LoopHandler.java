/**
 * 
 */
package org.sen.b2b.edi.handler.loop;

import java.util.List;

import org.sen.b2b.edi.parser.EDIRow;
import org.sen.b2b.edi.t270.L2000A;
import org.sen.b2b.edi.t270.L2000B;
import org.sen.b2b.edi.t270.L2000C;
import org.sen.b2b.edi.t270.L2000D;
import org.sen.b2b.edi.t270.SBHTBeginningOfHierarchicalTransaction;
import org.sen.b2b.edi.t270.*;

/**
 * @author ca31085
 *
 */
public class LoopHandler {
	private SBHTBeginningOfHierarchicalTransaction sbht;
	
	public LoopHandler(T270 t270, EDIRow row) {
		List<Object> loops  = t270.getL2000AOrL2000BOrL2000C(); 
		for(Object obj : loops) {
			if(obj instanceof L2000A) {
				System.out.println("L2000A loop");
				L2000AHandler hand = new L2000AHandler((L2000A)obj, row ); 
			} else if(obj instanceof L2000B) {
				System.out.println("L2000B loop");
				L2000BHandler hand = new L2000BHandler((L2000B)obj, row);
			} else if(obj instanceof L2000C) {
				System.out.println("L2000C loop");
				L2000CHandler hand = new L2000CHandler((L2000C)obj, row);
			} else if(obj instanceof L2000D) {
				System.out.println("L2000D loop");
				L2000DHandler hand = new L2000DHandler((L2000D)obj, row);
			}
		}
		process(row);
	}
	
	public void process(EDIRow row) {
		String[] arr = row.getElementsInArray();
		
	}
}
