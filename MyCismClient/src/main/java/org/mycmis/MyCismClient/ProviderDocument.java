package org.mycmis.MyCismClient;


public class ProviderDocument {
	
	private String documentURL;
	private String documentReference;	
	private String documentStatementDate;	
	private String documentType;	
	
	public ProviderDocument() {
		
	}
	
	public ProviderDocument(String documentReference, String documentStatementDate, String documentType, String documentURL) {
		this.documentReference = documentReference;
		this.documentStatementDate = documentStatementDate;
		this.documentType = documentType;
		this.documentURL = documentURL;
	}
	
	public String getDocumentURL() {
		return documentURL;
	}

	public void setDocumentURL(String documentURL) {
		this.documentURL = documentURL;
	}

	public String getDocumentReference() {
		return documentReference;
	}

	public void setDocumentReference(String documentReference) {
		this.documentReference = documentReference;
	}

	public String getDocumentStatementDate() {
		return documentStatementDate;
	}

	public void setDocumentStatementDate(String documentStatementDate) {
		this.documentStatementDate = documentStatementDate;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	
	@Override
	public String toString() {
		return "ProviderDocument [documentReference=" + documentReference
				+ ", documentStatementDate=" + documentStatementDate
				+ ", documentType=" + documentType + "]"
				+ ", documentURL="+documentURL;
	}

}
