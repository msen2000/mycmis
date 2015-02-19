package org.mycmis.MyCismClient;

public class PaymentDocument {
	
	private String documentURL;		
	private String documentType;
		
	public PaymentDocument(String documentURL, String documentType) {
		this.documentURL = documentURL;
		this.documentType = documentType;
	}

	public String getDocumentURL() {
		return documentURL;
	}

	public void setDocumentURL(String documentURL) {
		this.documentURL = documentURL;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

}
