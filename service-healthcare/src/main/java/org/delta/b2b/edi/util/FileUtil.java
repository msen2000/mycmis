/**
 * 
 */
package org.delta.b2b.edi.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

/**
 * @author ca31085
 *
 */
public class FileUtil {

	public static String readXMLFile(String fileName) throws Exception {
		StringBuilder xmlRes = new StringBuilder();
		
		try {
			Reader fileReader = new FileReader(fileName);
			BufferedReader buffReader = new BufferedReader(fileReader);
			
			String str = null;
			while ((str = buffReader.readLine()) != null) {
				xmlRes.append(str);
			}
			System.out.println(" XML ->"+xmlRes.toString());
			
		} catch (Exception e) { 
			e.printStackTrace();
			throw e;
		}
		return xmlRes.toString();
	}
	
	//String ROOT_DIR = "C:\\Temp\\t1.xml";
	public static InputStream getInputStream(String fileName) throws Exception {
		File file = new File(fileName);
		FileInputStream ins = new FileInputStream(file);
		return ins;
	}
}
