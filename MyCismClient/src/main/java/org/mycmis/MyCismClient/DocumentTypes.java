package org.mycmis.MyCismClient;

import java.util.HashMap;
import java.util.Map;

public enum DocumentTypes{
	
	PCHK("Provider Claim Payment"),
	PCKO("Provider Claim Payment Only"),
	PARE("Provder Auto-Recoupment"),
	PEOB("Provider Claim Statement"),
	
	//PRE-D document
	PPRD("Provider Pre-Treatment Estimate"),
	
	//correspondence documents
	PINM("Provider Invalid Member Letter"),
	PISC("Provider Insufficient Claim Letter"),
	PISM("Provider Insufficient Member Letter"),
	
	//DC document types
	PCCR("Capitation Payment"),
	PCCO("Checks with No Remittance Details"),
	PTCR("Total Compensation Payment"),
	PTCO("Total Compensatoin Payment Only"),
	PUCR("Utilization Payment"),
	PUCO("Utilization Payment Only"),
	
	//statements
	PCRM("Remittance Details with No Checks"),		
	PTRM("Total Compensation Statement"),
	PUAR("Utilization Statement [Adjusted]"),
	PURM("Utilization Statement");
	
	private String documentDesc;
	private static Map<String, String> codeToStatusMapping;
	
	private DocumentTypes(String desc){
		this.documentDesc = desc;
	}

	public String getDocumentDesc() {
		return documentDesc;
	}
	
	public static String getDocumentDesc(String documentType) {
        if (codeToStatusMapping == null) {
            initMapping();
        }
        return codeToStatusMapping.get(documentType);
    }
 
    private static void initMapping() {
        codeToStatusMapping = new HashMap<String, String>();
        for (DocumentTypes s : values()) {
            codeToStatusMapping.put(s.name(), s.documentDesc);
        }
    }
	
}