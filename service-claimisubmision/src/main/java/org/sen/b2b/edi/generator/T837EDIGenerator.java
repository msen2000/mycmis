/**
 * 
 */
package org.sen.b2b.edi.generator;

import java.util.List;

import org.sen.b2b.edi.generator.loop.L2000AGenerator;
import org.sen.b2b.edi.generator.loop.L2000BGenerator;
import org.sen.b2b.edi.generator.loop.L2000CGenerator;
import org.sen.b2b.edi.t837.L2000A;
import org.sen.b2b.edi.t837.L2000B;
import org.sen.b2b.edi.t837.L2000C;
import org.sen.b2b.edi.t837.SBHTBeginningOfHierarchicalTransaction;
import org.sen.b2b.edi.t837.SGEFunctionalGroupTrailer;
import org.sen.b2b.edi.t837.SGSFunctionalGroupHeader;
import org.sen.b2b.edi.t837.SIEAInterchangeControlTrailer;
import org.sen.b2b.edi.t837.SISAInterchangeControlHeader;
import org.sen.b2b.edi.t837.SSETransactionSetTrailer;
import org.sen.b2b.edi.t837.SSTTransactionSetHeader;
import org.sen.b2b.edi.t837.T837;

/**
 * @author sen
 *
 */
public class T837EDIGenerator implements EDIGenerator { 

	private T837 t837;
	private StringBuilder str270 = new StringBuilder();
	private static String eleSeperator = "*";
	private static String segSeperator = "~";
	
	public T837EDIGenerator() {
		
	}
	public T837EDIGenerator(T837 t837){
		this.t837 = t837;
	}
		
	@Override
	public String generateEDI() {
		str270.append(generateSISA());
		str270.append(segSeperator);
		str270.append(generateSGS());
		str270.append(segSeperator);
		str270.append(generateSST());		
		str270.append(segSeperator);
		str270.append(generateSBHT());
		
		str270.append(segSeperator);
		str270.append(generateSHL());
		
		str270.append(segSeperator);
		str270.append(generateSSE());
		str270.append(segSeperator);
		str270.append(generateSGE());
		str270.append(segSeperator);
		str270.append(generateSIEA());
		
		return str270.toString();
	}
	
	//HL*1**20*1~ // Loop Generators
	public String generateSHL(){		
		StringBuilder strBul = new StringBuilder();
		List<Object> list = t837.getL2000AOrL2000BOrL2000C();
		
		for(Object obj : list) {
			if(obj instanceof L2000A) {
				System.out.println("L2000A loop");
				L2000A l2000a = (L2000A)obj;
				L2000AGenerator gen = new L2000AGenerator();
				strBul.append(gen.generateL2000A(l2000a));
			}			
			if(obj instanceof L2000B) {
				System.out.println("L2000B loop");
				L2000B l2000b = (L2000B)obj;				
				L2000BGenerator gen = new L2000BGenerator();
				//strBul.append(gen.generateL2000B(l2000b));				
			}			
			if(obj instanceof L2000C) {
				System.out.println("L2000C loop");
				L2000C l2000c = (L2000C)obj;			
				L2000CGenerator gen = new L2000CGenerator();
				strBul.append(gen.generateL2000C(l2000c));
			}				
		}
		return strBul.toString();
	}
				
	
	//IEA*1*000000001~
	public String generateSIEA(){
		SIEAInterchangeControlTrailer siea = t837.getSIEAInterchangeControlTrailer();
		if(null == siea) 
			return "";
		
		StringBuilder strBul = new StringBuilder();		
		strBul.append("IEA");
		strBul.append(eleSeperator);
		strBul.append(siea.getEIEA01NumberOfIncludedFunctionalGroups().getValue());
		strBul.append(eleSeperator);
		strBul.append(siea.getEIEA02InterchangeControlNumber().getValue());
		strBul.append(eleSeperator);
		return strBul.toString();
	}
	
	//GE*1*1~
	public String generateSGE(){
		SGEFunctionalGroupTrailer sge = t837.getSGEFunctionalGroupTrailer();
		
		StringBuilder strBul = new StringBuilder();		
		strBul.append("GE");
		strBul.append(eleSeperator);
		strBul.append(sge.getEGE01NumberOfTransactionSetsIncluded().getValue());
		strBul.append(eleSeperator);
		strBul.append(sge.getEGE02GroupControlNumber().getValue());
		strBul.append(eleSeperator);
		return strBul.toString();
	}
	
	//SE*13*0001~
	public String generateSSE(){
		SSETransactionSetTrailer sse = t837.getSSETransactionSetTrailer();
		if(null == sse) 
			return "";
		
		StringBuilder strBul = new StringBuilder();		
		strBul.append("SE");
		strBul.append(eleSeperator);
		strBul.append(sse.getESE01NumberOfIncludedSegments().getValue());
		strBul.append(eleSeperator);
		strBul.append(sse.getESE02TransactionSetControlNumber().getValue());
		strBul.append(eleSeperator);
		return strBul.toString();
	}
	
	//BHT*0022*13*DDPA-123456*20110204*1015~
	public String generateSBHT(){
		SBHTBeginningOfHierarchicalTransaction sbht = t837.getSBHTBeginningOfHierarchicalTransaction();
		if(null == sbht) 
			return "";
		StringBuilder strBul = new StringBuilder();		
		strBul.append("BHT");
		strBul.append(eleSeperator);
		strBul.append(sbht.getEBHT01HierarchicalStructureCode().getValue());
		strBul.append(eleSeperator);
		strBul.append(sbht.getEBHT02TransactionSetPurposeCode().getValue());
		strBul.append(eleSeperator);
		if(null != sbht.getEBHT03ReferenceIdentification())
			strBul.append(sbht.getEBHT03ReferenceIdentification().getValue());
		strBul.append(eleSeperator);
		strBul.append(sbht.getEBHT04Date().getValue());
		strBul.append(eleSeperator);
		strBul.append(sbht.getEBHT05Time().getValue());
		strBul.append(eleSeperator);
		if(null != sbht.getEBHT06TransactionTypeCode()) 
			strBul.append(sbht.getEBHT06TransactionTypeCode().getValue());
		strBul.append(eleSeperator);
		
		return strBul.toString();
	}
	
	//ST*270*0001~
	public String generateSST(){
		SSTTransactionSetHeader sst = t837.getSSTTransactionSetHeader();
		if(null == sst) 
			return "";
		
		StringBuilder strBul = new StringBuilder();		
		strBul.append("ST");
		strBul.append(eleSeperator);
		strBul.append(sst.getEST01TransactionSetIdentifierCode().getValue());
		strBul.append(eleSeperator);
		strBul.append(sst.getEST02TransactionSetControlNumber().getValue());
		strBul.append(eleSeperator);
		if(null != sst.getEST03ImplementationConventionReference())
			strBul.append(sst.getEST03ImplementationConventionReference().getValue());
		strBul.append(eleSeperator);
		return strBul.toString();
	}
	
	//GS*HS*DDPA*TX*20110204*1015*1*X*004010X092~
	public String generateSGS(){
		SGSFunctionalGroupHeader sgs = t837.getSGSFunctionalGroupHeader();
		if(null == sgs)
			return null;
		
		StringBuilder strGS = new StringBuilder();		
		strGS.append("GS");
		strGS.append(eleSeperator);
		if(null != sgs.getEGS01FunctionalIdentifierCode())
			strGS.append(sgs.getEGS01FunctionalIdentifierCode().getValue());
		strGS.append(eleSeperator);
		strGS.append(sgs.getEGS02ApplicationSenderSCode().getValue());
		strGS.append(eleSeperator);
		strGS.append(sgs.getEGS03ApplicationReceiverSCode().getValue());
		strGS.append(eleSeperator);
		strGS.append(sgs.getEGS04Date().getValue());
		strGS.append(eleSeperator);
		strGS.append(sgs.getEGS05Time().getValue());
		strGS.append(eleSeperator);
		strGS.append(sgs.getEGS06GroupControlNumber().getValue());
		strGS.append(eleSeperator);
		strGS.append(sgs.getEGS07ResponsibleAgencyCode().getValue());
		strGS.append(eleSeperator);
		strGS.append(sgs.getEGS08VersionReleaseIndustryIdentifierCode().getValue());
		strGS.append(eleSeperator);
		return strGS.toString();
	}
	
	//ISA*00*          *00*          *ZZ*DDPA           *ZZ*TX             *110204*1015*U*00401*000000001*0*T*:~
	public String generateSISA() {
		SISAInterchangeControlHeader isa = t837.getSISAInterchangeControlHeader();		
		if(null == isa) 
			return "";		
		StringBuilder sISA = new StringBuilder();		
		sISA.append("ISA");
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA01AuthorizationInformationQualifier().getValue());
		sISA.append(eleSeperator);
		//sISA.append(isa.getEISA02AuthorizationInformation().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA03SecurityInformationQualifier().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA04SecurityInformation().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA05InterchangeIDQualifier().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA06InterchangeSenderID().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA07InterchangeIDQualifier().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA08InterchangeReceiverID().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA09InterchangeDate().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA10InterchangeTime().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA11RepetitionSeparator().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA12InterchangeControlVersionNumber().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA13InterchangeControlNumber().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA14AcknowledgmentRequested().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA15InterchangeUsageIndicator().getValue());
		sISA.append(eleSeperator);
		sISA.append(isa.getEISA16ComponentElementSeparator().getValue());
		
		return sISA.toString();
	}

}
