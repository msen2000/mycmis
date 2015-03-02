package org.sen.b2b.edi.handler.trailer;

import java.math.BigInteger;

import org.sen.b2b.edi.parser.Row;
import org.sen.b2b.edi.t271.EIEA01NumberOfIncludedFunctionalGroups;
import org.sen.b2b.edi.t271.EIEA02InterchangeControlNumber;
import org.sen.b2b.edi.t271.SIEAInterchangeControlTrailer;
import org.sen.b2b.edi.t271.T271;

public class IEAHandler {
	
	private SIEAInterchangeControlTrailer siea;
	
	public IEAHandler(T271 t271, Row row) {
		siea = t271.getSIEAInterchangeControlTrailer(); 
		process(row);
	}
	//IEA*1*000000001~
	public void process(Row row) {
		String[] arr = row.getElementsInArray();
		
		EIEA01NumberOfIncludedFunctionalGroups e01 = new EIEA01NumberOfIncludedFunctionalGroups();
		e01.setValue(BigInteger.valueOf(Integer.parseInt(arr[0])));
		siea.setEIEA01NumberOfIncludedFunctionalGroups(e01);
		
		EIEA02InterchangeControlNumber e02 = new EIEA02InterchangeControlNumber();
		e02.setValue(BigInteger.valueOf(Integer.parseInt(arr[1])));
		siea.setEIEA02InterchangeControlNumber(e02);
		
		//DecimalFormat myFormatter = new DecimalFormat("000000000");
		//String output = myFormatter.format(arr[1]);
		//System.out.println(1 + " " + 000000000 + " " + output);		
				
	}
}

