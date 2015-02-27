/**
 * 
 */
package org.sen.service.translate;

import com.google.api.translate.Language;
import com.google.api.translate.Translate;
import com.google.api.*;

/**
 * @author Sen
 *
 */
public class TranslateService {

	/**
	 * @param args
	 */
	 public static void main(String[] args) throws Exception {
	    // Set the HTTP referrer to your website address.
	    GoogleAPI.setHttpReferrer("http://ablimoservices.appspot.com/");
	    //GoogleAPI.setHttpReferrer("http://code.google.com/p/google-api-translate-java/");
	    
	    // Set the Google Translate API key
	    // See: http://code.google.com/apis/language/translate/v2/getting_started.html
	    GoogleAPI.setKey("AIzaSyAlXw7jE2KiKzJqGcyePAofg38k3YIGyEQ");

	    String translatedText = Translate.DEFAULT.execute("Bonjour le monde", Language.FRENCH, Language.ENGLISH);

	    System.out.println(translatedText);
	  }

}




