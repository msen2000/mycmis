package org.mycmis.MyCismClient;

import java.io.Serializable;
import java.util.Date;

public class CMISDocument implements Serializable {

    private static final long serialVersionUID = 1L;
    private String docUrl;
    private String enrolleeName;
    private String docSize;
    private Date statementDate;
    private String docID;
    private String statementDateString;
    
    
    public CMISDocument() {
        super();
    }

    public void setDocUrl(String docUrl) {
        this.docUrl = docUrl;
    }

    public String getDocUrl() {
        return docUrl;
    }

    public void setEnrolleeName(String enrolleeName) {
        this.enrolleeName = enrolleeName;
    }

    public String getEnrolleeName() {
        return enrolleeName;
    }

    public void setDocSize(String docSize) {
        this.docSize = docSize;
    }

    public String getDocSize() {
        return docSize;
    }

    public void setStatementDate(Date statementDate) {
        this.statementDate = statementDate;
    }

    public Date getStatementDate() {
        return statementDate;
    }

    public void setDocID(String docID) {
        this.docID = docID;
    }

    public String getDocID() {
        return docID;
    }

    public void setStatementDateString(String statementDateString) {
        this.statementDateString = statementDateString;
    }

    public String getStatementDateString() {
        return statementDateString;
    }
}
