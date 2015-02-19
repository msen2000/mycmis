package org.mycmis.MyCismClient;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.chemistry.opencmis.client.api.ItemIterable;
import org.apache.chemistry.opencmis.client.api.QueryResult;
import org.apache.chemistry.opencmis.client.api.QueryStatement;
import org.apache.chemistry.opencmis.client.api.Repository;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.client.api.SessionFactory;
import org.apache.chemistry.opencmis.client.runtime.SessionFactoryImpl;
import org.apache.chemistry.opencmis.commons.SessionParameter;
import org.apache.chemistry.opencmis.commons.enums.BindingType;


/**
 * this is CMIS client service.
 * 
 * @author NA
 *
 */
public class AlfrescoService {    
    
    public AlfrescoService() {
        super();
    }
    
    public static List<CMISDocument> searchDocumentsByContractKeys(Map parameters){
//    	CMISDOcument is a custom POJO
		List<CMISDocument> documents=new ArrayList<CMISDocument>();
		SessionFactory sessionFactory = SessionFactoryImpl.newInstance();
            
//		String endPoint=EBDPortalProperties.env.getProperty("alfresco.service.atompub.url"); 
//		String userName=EBDPortalProperties.env.getProperty("alfresco.service.username");
//		String password=EBDPortalProperties.env.getProperty("alfresco.service.password");
//		String alfrescoBaseUrl=EBDPortalProperties.env.getProperty("alfresco.doc.baseurl");            
		String endPoint="http://rc-lx827:8080/alfresco/api/-default-/cmis/versions/1.1/atom/query"; 
		String userName="admin";
		String password="alfresco";
		String alfrescoBaseUrl="http://rc-lx827:8080/share/page/document-details?nodeRef=workspace://SpacesStore/";

		Set<String> contractKeys=(Set<String>) parameters.get("ContractKeys"); 
		String docType=(String)parameters.get("docType");
		Map<String,String> parameter = new HashMap<String,String>(); 
		parameter.put(SessionParameter.USER, userName);
		parameter.put(SessionParameter.PASSWORD, password);
		parameter.put(SessionParameter.ATOMPUB_URL, endPoint);
		parameter.put(SessionParameter.BINDING_TYPE, BindingType.ATOMPUB.value());
		List<Repository> repositories = sessionFactory.getRepositories(parameter);
		Session session = repositories.get(0).createSession();
                
        Calendar now = Calendar.getInstance();
        //subtract a year
        now.add(Calendar.YEAR, -1);
                   QueryStatement qs=session.createQueryStatement("select cmdoc.cmis:objectId cmis:objectId, cmdoc.cmis:name cmis:name, PDA.pcd:name " + 
                    "pcd:name, PCA.pcd:accNo pcd:accNo, cmdoc.cmis:contentStreamLength cmis:contentStreamLength, PCA.pcd:stmtDate pcd:stmtDate from cmis:document as cmdoc join " + 
                    "(pcd:printedCommunications as PCA join pcd:printedDocumentAddress as PDA on " + 
                    "PCA.cmis:objectId=PDA.cmis:objectId ) on cmdoc.cmis:objectId=PCA.cmis:objectId where " + 
                    "PCA.pcd:stmtDate> TIMESTAMP ? and PCA.pcd:docType= ? and PCA.pcd:accNo in (?) " +
                       "order by PCA.pcd:stmtDate desc");
                   //

                    qs.setDateTime(1, now); 
                    qs.setString(2, docType);
                    String[] contractKeysArray=contractKeys.toArray(new String[contractKeys.size()]);
                    qs.setString(3,contractKeysArray);
                    ItemIterable<QueryResult> results = session.query(qs.toQueryString(), false).getPage(1000);
                   System.out.println(qs.toQueryString());
                    DecimalFormat df = new DecimalFormat("#.00"); 
                    for(QueryResult hit: results) {
                        CMISDocument document=new CMISDocument();
                        String docReference=(String)hit.getPropertyByQueryName("cmis:objectId").getFirstValue();
                        //Strip version number from this
                        docReference=docReference.substring(0,docReference.indexOf(";"));
                        String accName=(String)hit.getPropertyByQueryName("pcd:name").getFirstValue();
                        BigInteger docSize=(BigInteger)hit.getPropertyByQueryName("cmis:contentStreamLength").getFirstValue();
                        Object accNo=hit.getPropertyByQueryName("pcd:accNo").getFirstValue();
                        //This is calendar
                        Object statementDate=hit.getPropertyByQueryName("pcd:stmtDate").getFirstValue();
                        if(statementDate!=null&&statementDate instanceof Calendar){
                           Calendar tempStmentDate=(Calendar)statementDate; 
                           Date tempDate=tempStmentDate.getTime();
                           SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
                           document.setStatementDateString(sdf.format(tempDate));
               
            }
            document.setDocID(docReference);
            document.setDocUrl(alfrescoBaseUrl+docReference);
            document.setEnrolleeName(accName);
            document.setDocSize(df.format(docSize.doubleValue()/1024)+" KB");
            documents.add(document);
            System.out.println("docReference: " + document.getDocUrl()+" accNo: "+accNo +" accName: "+ document.getEnrolleeName()+" docSize: "+document.getDocSize()+" statementDate "+statementDate);
            
        }
            return documents;
    }
    
    public static void main(String args[]){
//        HashMap testMap=new HashMap();
//        Set contKeys=new HashSet<String>();
//        contKeys.add("1132820086-01");
//        contKeys.add("1120962944-03");
//        testMap.put("ContractKeys",contKeys);
//        testMap.put("docType","SEOB");
//        
//        searchDocumentsByContractKeys(testMap);
//        SortUtil util=new SortUtil();
//        List<CMISDocument> documents=new ArrayList<CMISDocument>();
//        CMISDocument document=new CMISDocument();
//            Calendar now = Calendar.getInstance();
//            document.setStatementDate(now.getTime());
//            documents.add(document);
//            //subtract a year
//            now.add(Calendar.YEAR, -1);
//            CMISDocument document2=new CMISDocument();      
//            document2.setStatementDate(now.getTime());
//            documents.add(document2);
//           documents= util.sortMyDocumentListAsc(documents);
        }
}
