package org.sen.b2b.edi.handler.trailer;

import java.math.BigInteger;
import java.text.DecimalFormat;

import org.sen.b2b.edi.parser.EDIRow;
import org.sen.b2b.edi.t270.EIEA01NumberOfIncludedFunctionalGroups;
import org.sen.b2b.edi.t270.EIEA02InterchangeControlNumber;
import org.sen.b2b.edi.t270.SIEAInterchangeControlTrailer;
import org.sen.b2b.edi.t270.T270;

public class IEAHandler {
	
	private SIEAInterchangeControlTrailer siea;
	
	public IEAHandler(T270 t270, EDIRow row) {
		siea = t270.getSIEAInterchangeControlTrailer(); 
		process(row);
	}
	//IEA*1*000000001~
	public void process(EDIRow row) {
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

