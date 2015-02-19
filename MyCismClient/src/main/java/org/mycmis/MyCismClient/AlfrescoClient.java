package org.mycmis.MyCismClient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.apache.chemistry.opencmis.client.api.ItemIterable;
import org.apache.chemistry.opencmis.client.api.QueryResult;
import org.apache.chemistry.opencmis.client.api.QueryStatement;
import org.apache.chemistry.opencmis.client.api.Repository;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.client.api.SessionFactory;
import org.apache.chemistry.opencmis.client.runtime.SessionFactoryImpl;
import org.apache.chemistry.opencmis.commons.SessionParameter;
import org.apache.chemistry.opencmis.commons.enums.BindingType;


public class AlfrescoClient {

    private static Session cachedCMISSession = null;

    private static final String RUN_LEVEL = "DE_ID";
    
    private static ThreadLocal<SimpleDateFormat> s_localCmisSqlDatetime = new ThreadLocal<SimpleDateFormat>();
            
    public static final String FORMAT_CMIS_SQL = "yyyy-MM-dd'T'HH:mm:ss.sss+00:00";
            
    public static final String DOCUMENT_FORMAT = "MM/dd/yyyy";
    
    private static SimpleDateFormat DOCUMENT_DATE_FORMAT = new SimpleDateFormat(DOCUMENT_FORMAT);

    private static String TEST_VALUES[][] =
        new String[][] { { "0178ac77-a9f7-492a-aa26-085c4f3efe6d",
                           "01/28/2015", "Provider Claim Statement",
                           "http://rc-lx749:8080/VirtualViewerJavaHTML5/index_public.html?documentId=0178ac77-a9f7-492a-aa26-085c4f3efe6d" },
                         { "c3f7e92a-7596-43b9-9dc6-e8faba0ca9bb",
                           "10/31/2014", "Provider Insufficient Claim Letter",
                           "http://rc-lx749:8080/VirtualViewerJavaHTML5/index_public.html?documentId=c3f7e92a-7596-43b9-9dc6-e8faba0ca9bb" },
                         { "cd5cbe8a-5209-4364-b912-d41d4e34d87d",
                           "11/07/2014", "Provider Claim Payment Only",
                           "http://rc-lx749:8080/VirtualViewerJavaHTML5/index_public.html?documentId=cd5cbe8a-5209-4364-b912-d41d4e34d87d" },
                         { "da05fc72-c7f0-432a-8f6e-c2694f6cde10",
                           "11/07/2014", "Provider Pre-Treatment Estimate",
                           "http://rc-lx749:8080/VirtualViewerJavaHTML5/index_public.html?documentId=da05fc72-c7f0-432a-8f6e-c2694f6cde10" },
                         { "9c556f42-8347-40b6-b06e-16f008b65935",
                           "10/31/2014", "Provider Insufficient Member Letter",
                           "http://rc-lx749:8080/VirtualViewerJavaHTML5/index_public.html?documentId=9c556f42-8347-40b6-b06e-16f008b65935" },
                         { "09689e03-6fa7-4984-bb4f-d92a894b1c3a",
                           "01/28/2015", "Provider Claim Statement",
                           "http://rc-lx749:8080/VirtualViewerJavaHTML5/index_public.html?documentId=09689e03-6fa7-4984-bb4f-d92a894b1c3a" },
                         { "2e15410b-2d2b-40e8-8d28-b9b384bf141a",
                           "11/07/2014", "Provder Auto-Recoupment",
                           "http://rc-lx749:8080/VirtualViewerJavaHTML5/index_public.html?documentId=2e15410b-2d2b-40e8-8d28-b9b384bf141a" },
                         { "de9b7077-8110-4ced-a6ca-3863112331ff",
                           "10/31/2014", "Provider Invalid Member Letter",
                           "http://rc-lx749:8080/VirtualViewerJavaHTML5/index_public.html?documentId=de9b7077-8110-4ced-a6ca-3863112331ff" },
                         { "c89909df-2d19-47ba-8026-b647f096f528",
                           "11/07/2014", "Provider Claim Payment",
                           "http://rc-lx749:8080/VirtualViewerJavaHTML5/index_public.html?documentId=c89909df-2d19-47ba-8026-b647f096f528" } };

    
    private static String ALFRESCO_BASE_URL =
        System.getProperty("ALFRESCO_BASE_URL",
                           "http://rc-lx749:8080/VirtualViewerJavaHTML5/index_public.html?documentId=");

    public static Map<String, PaymentDocument> getPaymentDocumentByDateAndNumber(List<String> documentDateList, List<String> checkoreftNubmerList){
                    Map<String,PaymentDocument> documentMap = new Hashtable<String,PaymentDocument>();
                    if(RUN_LEVEL.equals("DE_ID")){
                            int counter = 0;
                            for(String values: documentDateList){
                                    PaymentDocument document = new PaymentDocument("http://rc-lx749:8080/VirtualViewerJavaHTML5/index_public.html?documentId=c89909df-2d19-47ba-8026-b647f096f528","Provider Claim Payment");
                                    documentMap.put(values+"-"+checkoreftNubmerList.get(counter) , document);
                                    counter++;
                        System.out.println("document " + document);
                            }
                            System.out.println("document map " + documentMap);
                            return documentMap;
                    }
                    List<String> timestampList = new ArrayList<String>();
                    
                    String query = "select ASP1.cmis:objectId DocumentReference, ASP1.pcd:stmtDate StatementDate, ASP1.pcd:docType DocumentType, ASP2.pcd:checkNo CheckNumber, ASP1.pcd:accNo AccountNumber  from pcd:providerPrintCommunication as TYPE join (pcd:printedCommunications AS ASP1 join pcd:checkDetails AS ASP2 on ASP1.cmis:objectId = ASP2.cmis:objectId) on TYPE.cmis:objectId = ASP1.cmis:objectId where ASP1.pcd:docType in ('PCHK','PEOB') and ASP1.pcd:entity not in ('DC','DI') and ASP1.pcd:stmtDate in ($timestamps) and ASP2.pcd:checkNo in ($checknumbers)";
                    
                    String checkoreftNumbers = checkoreftNubmerList.toString().replace("[", "'").replace("]", "'").replace(", ", "','");
                    System.out.println("checkoreftNumbers " + checkoreftNumbers);
                    
                    for(String documentDate : documentDateList){
                            Calendar calendar = Calendar.getInstance();                     
                            //calendar.set(year, month, date, hourOfDay, minute, second);
                            try {
                                    timestampList.add(getCmisSqlDatetimeFormat().format(DOCUMENT_DATE_FORMAT.parse(documentDate)));
                            } catch (ParseException e) {
                                    // TODO Auto-generated catch block
                                    e.printStackTrace();
                            }
                    }
                    String timestamps = timestampList.toString().replace("[", "TIMESTAMP '").replace("]", "'").replace(", ", "',TIMESTAMP '");
                    System.out.println("document dates " + timestamps); 
                    query = query.replace("$timestamps", timestamps);
                    query = query.replace("$checknumbers", checkoreftNumbers);
                    System.out.println("query " + query);
                    Session session = getCMISSession() ;
                    QueryStatement qs=session.createQueryStatement(query);          
                    ItemIterable<QueryResult> resultSets = session.query(qs.toQueryString(), false);
                    System.out.println(qs.toQueryString());
                    for(QueryResult row: resultSets) {       
                            String statementDate = getFormattedDate((GregorianCalendar)row.getPropertyByQueryName("StatementDate").getFirstValue());
                            String checkNumber = (String)row.getPropertyByQueryName("CheckNumber").getFirstValue();
                String docReference=(String)row.getPropertyByQueryName("DocumentReference").getFirstValue();
                String documentDate = getFormattedDate((GregorianCalendar)row.getPropertyByQueryName("StatementDate").getFirstValue());
                String documentType = (String)row.getPropertyByQueryName("DocumentType").getFirstValue();
                documentType = DocumentTypes.getDocumentDesc(documentType);
                //Strip version number from this
                if(docReference != null && docReference.indexOf(";") != -1){
                    docReference=docReference.substring(0,docReference.indexOf(";"));
                }  
                PaymentDocument document = new PaymentDocument(ALFRESCO_BASE_URL +docReference,documentType);
                documentMap.put(statementDate+"-"+checkNumber, document);            
                    }               
                    System.out.println("document " + documentMap);
                    return documentMap;
            }

    public static List<ProviderDocument> getDocumentByTIN(String tax_identifier) {
        List<ProviderDocument> documentList =
            new ArrayList<ProviderDocument>();
        if (RUN_LEVEL.equals("DE_ID")) {
            for (String values[] : TEST_VALUES) {
                ProviderDocument document =
                    new ProviderDocument(values[0], values[1], values[2],
                                         values[3]);
                documentList.add(document);
                System.out.println("document " + document);
            }
            return documentList;

        }

        Session session = getCMISSession();
        String query = "select ASP1.cmis:objectId DocumentReference, ASP1.pcd:stmtDate StatementDate, ASP1.pcd:docType DocumentType, ASP1.pcd:accNo AccountNumber from pcd:printedCommunications AS ASP1 join pcd:providerPrintCommunication as TYPE1 on ASP1.cmis:objectId = TYPE1.cmis:objectId where ASP1.pcd:stmtDate > TIMESTAMP ? and ASP1.pcd:accNo= ? and ASP1.pcd:docType in ('PCHK','PCKO','PARE','PEOB','PPRD','PINM','PISC','PISM') and ASP1.pcd:docType <> 'DC'"; 
        Calendar now = Calendar.getInstance();
        //subtract a year
        now.add(Calendar.YEAR, -2);

        QueryStatement qs = session.createQueryStatement(query);
        qs.setDateTime(1, now);
        qs.setString(2, tax_identifier);

        ItemIterable<QueryResult> resultSets = session.query(query, false);
        System.out.println(qs.toQueryString());
        for (QueryResult row : resultSets) {
            String docReference =
                (String)row.getPropertyByQueryName("DocumentReference").getFirstValue();
            String documentDate =
                getFormattedDate((GregorianCalendar)row.getPropertyByQueryName("StatementDate").getFirstValue());
            String documentType =
                (String)row.getPropertyByQueryName("DocumentType").getFirstValue();
            documentType = DocumentTypes.getDocumentDesc(documentType);
            //Strip version number from this
            if (docReference != null && docReference.indexOf(";") != -1) {
                docReference =
                        docReference.substring(0, docReference.indexOf(";"));
            }
            ProviderDocument document =
                new ProviderDocument(docReference, documentDate, documentType,
                                     ALFRESCO_BASE_URL + docReference);

            documentList.add(document);
            System.out.println("document " + document);
        }
        return documentList;
    }

    public static String getFormattedDate(GregorianCalendar calender) {
        return DOCUMENT_DATE_FORMAT.format(calender.getTime());
    }


    private static Session getCMISSession() {
        if (cachedCMISSession == null) {
            SessionFactory factory = SessionFactoryImpl.newInstance();
            Map<String, String> parameter = new HashMap<String, String>();
            String username = System.getProperty("ALFRESCO_SERVER_ATOM_PUB_URL");
            String password = System.getProperty("ALFRESCO_SERVER_USERNAME");
            String atom_pub_url = System.getProperty("ALFRESCO_SERVER_PASSWORD");
                            
            
            // user credentials
            parameter.put(SessionParameter.USER, username);
            parameter.put(SessionParameter.PASSWORD, password);
            parameter.put(SessionParameter.ATOMPUB_URL,
                          atom_pub_url);
            parameter.put(SessionParameter.BINDING_TYPE,
                          BindingType.ATOMPUB.value());
            parameter.put(SessionParameter.OBJECT_FACTORY_CLASS,
                          "org.alfresco.cmis.client.impl.AlfrescoObjectFactoryImpl");
            //parameter.put(SessionParameter.REPOSITORY_ID, "/Sites/p2eportal/documentLibrary/Census Files");
            System.out.println("Connection to Alfresco Server using " + atom_pub_url +  " with username = " + username);
            List<Repository> repositories = factory.getRepositories(parameter);
            for (Repository res : repositories) {
                System.out.println("Repository ID=" + res.getId() + ":Name= " +
                                   res.getName());
            }
            // create session
            cachedCMISSession = repositories.get(0).createSession();


            return cachedCMISSession;

        }
        // Get some repository info
        System.out.println("Repository Name: " +
                           cachedCMISSession.getRepositoryInfo().getName());
        System.out.println("Repository ID: " +
                           cachedCMISSession.getRepositoryInfo().getId());
        System.out.println("CMIS Version: " +
                           cachedCMISSession.getRepositoryInfo().getCmisVersion());
        return cachedCMISSession;
    }
    
    /**
         * @return Returns a thread-safe formatter for the cmis sql datetime format
         */
        public static SimpleDateFormat getCmisSqlDatetimeFormat()
        {
            if (s_localCmisSqlDatetime.get() != null)
            {
                return s_localCmisSqlDatetime.get();
            }
            //'2015-01-06T08:00:00.000+00:00
           
            SimpleDateFormat formatter = new SimpleDateFormat(FORMAT_CMIS_SQL);
            formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
            formatter.setLenient(false);
            // put this into the threadlocal object
            s_localCmisSqlDatetime.set(formatter);
            // done
            return s_localCmisSqlDatetime.get();
        }

    public static void main(String... arg) {
    	
    	//TODO: Unit test code commented.
    	
    	/*
        AlfrescoClient alfrescoClient= new AlfrescoClient();
        String tinNumber = (String)ADFContext.getCurrent().getSessionScope().get("TIN");
        System.out.println("Passing TIN TO alfrescoClient.getDocumentByTIN"+tinNumber);
        lstProviderDocument=alfrescoClient.getDocumentByTIN(tinNumber);
        */
    	
        getDocumentByTIN("");

    }

}
