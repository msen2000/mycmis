package guestbook;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import javax.servlet.http.*;

//import org.sen.limo.model.DBConnection;

import com.google.appengine.api.datastore.*;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.appengine.api.utils.SystemProperty;
@SuppressWarnings("serial")
public class SignGuestbookServlet extends HttpServlet {    
	private static final Logger log = Logger.getLogger(SignGuestbookServlet.class.getName());

	/*
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
                throws IOException {
        UserService userService = UserServiceFactory.getUserService();
        User user = userService.getCurrentUser();
        // We have one entity group per Guestbook with all Greetings residing
        // in the same entity group as the Guestbook to which they belong.
        // This lets us run a transactional ancestor query to retrieve all
        // Greetings for a given Guestbook.  However, the write rate to each
        // Guestbook should be limited to ~1/second.
        String guestbookName = req.getParameter("guestbookName");
        Key guestbookKey = KeyFactory.createKey("Guestbook", guestbookName);
        String content = req.getParameter("content");
        Date date = new Date();
        Entity greeting = new Entity("Greeting", guestbookKey);
        greeting.setProperty("user", user);
        greeting.setProperty("date", date);
        greeting.setProperty("content", content);

        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        datastore.put(greeting);

        resp.sendRedirect("/guestbook.jsp?guestbookName=" + guestbookName);
    }
    */

	@Override
	 public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
		doGet(req,resp);
	}
	
	@Override
	 public void doGet(HttpServletRequest req, HttpServletResponse resp)
             throws IOException {
		System.out.println("$%%%%%%%%%% SignGuestbookServlet doGet ############## ");
		
	    String url = null;
	    try {
	    	
//	    	Connection con1 = DBConnection.getDBConnection();
//	    	System.out.println("$%%%%%%%%%% con1"+con1);
	    	
	      if (SystemProperty.environment.value() ==
	          SystemProperty.Environment.Value.Production) {
	    	  System.out.println("$%%%%%%%%%% Production ############## ");
	        // Load the class that provides the new "jdbc:google:mysql://" prefix.
	        //Class.forName("com.google.cloud.sql.Driver");
	        Class.forName("com.google.appengine.api.rdbms.AppEngineDriver");
	        
	        //url = "jdbc:google:mysql://your-project-id:your-instance-name/guestbook?user=root";
	        url = "jdbc:google:mysql://ablimoservices:ablimoservicesdb/guestbook?";	        
	      } else {
	    	  System.out.println("$%%%%%%%%%% Development ############## ");
	        //Local MySQL instance to use during development.
	        //Class.forName("com.mysql.jdbc.Driver");
	    	//Class.forName("com.google.cloud.sql.Driver");
	    	//Class.forName("com.mysql.jdbc.Driver");
	    	Class.forName("com.google.appengine.api.rdbms.AppEngineDriver");
	    	  
	        //url = "jdbc:mysql://localhost:3306/guestbook?user=root";
	        //url = "jdbc:mysql://localhost:3306/limo?user=root";
	    	//url = "jdbc:google:mysql://ablimoservices:ablimoservicesdb/limo?";
	    	url = "jdbc:google:mysql://ablimoservices:ablimoservicesdb/guestbook?";
	        // connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/limo","root", "password");
	      }
	    } catch (Exception e) {
	      e.printStackTrace();
	      return;
	    }

	    PrintWriter out = resp.getWriter();
	    try {
	      //Connection conn = DriverManager.getConnection(url);
	    	//Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/limo","root", "password");
	    	//Connection conn  = DriverManager.getConnection("jdbc:google:mysql://ablimoservices:ablimoservicesdb/limo?user=root&password=");
	    	//Connection conn  = DriverManager.getConnection("jdbc:google:mysql://ablimoservices:ablimoservicesdb/guestbook");
	    	Connection conn  = DriverManager.getConnection("jdbc:google:rdbms://ablimoservices:ablimoservicesdb/guestbook");
	    	//Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/limo?user=root&password=password");
	    	
	    	 System.out.println("$%%%%%%%%%% conn ############## "+conn);
	      try {
	        String fname = req.getParameter("fname");
	        String content = req.getParameter("content");
	        if (fname == "" || content == "") {
	          out.println(
	              "<html><head></head><body>You are missing either a message or a name! Try again! " +
	              "Redirecting in 3 seconds...</body></html>");
	        } else {
	          String statement = "INSERT INTO entries (guestName, content) VALUES( ? , ? )";
	          PreparedStatement stmt = conn.prepareStatement(statement);
	          stmt.setString(1, fname);
	          stmt.setString(2, content);
	          int success = 2;
	          success = stmt.executeUpdate();
	          if (success == 1) {
	            out.println(
	                "<html><head></head><body>Success! Redirecting in 3 seconds...</body></html>");
	          } else if (success == 0) {
	            out.println(
	                "<html><head></head><body>Failure! Please try again! " +
	                "Redirecting in 3 seconds...</body></html>");
	          }
	        }
	      } finally {
	        conn.close();
	      }
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	    resp.setHeader("Refresh", "3; url=/guestbook.jsp");
	  }
	
	public void JPAConnection() {
		  // Set the persistence driver and url based on environment, production or local.
	    Map<String, String> properties = new HashMap();
	    if (SystemProperty.environment.value() ==
	          SystemProperty.Environment.Value.Production) {
	      properties.put("javax.persistence.jdbc.driver",
	          "com.mysql.jdbc.GoogleDriver");
	      properties.put("javax.persistence.jdbc.url",
	          "jdbc:google:mysql://your-project-id:your-instance-name/demo");
	    } else {
	      properties.put("javax.persistence.jdbc.driver",
	          "com.mysql.jdbc.Driver");
	      properties.put("javax.persistence.jdbc.url",
	          "jdbc:mysql://127.0.0.1:3306/demo");
	    }

	    // Create a EntityManager which will perform operations on the database.
//	    EntityManagerFactory emf = Persistence.createEntityManagerFactory(
//	        "persistence-unit-name", propertiesMap);
	    
	    //JDO
	    //PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory(propertiesMap, "persistence-unit-name");
	    
	}
}