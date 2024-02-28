package Practice3;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class propertyDemo {

	public static void main(String[] args) {
	  String file = System.getProperty("user.dir");
	 // System.out.println(file);
	  file= file+"\\src\\Practice3\\DemoProp.properties";
	  // System.out.println(file);
	  
	  Properties p = new Properties();
	  try {
		FileInputStream fis = new FileInputStream(file);
		 try {
			p.load(fis);
			Set<Object> s = p.keySet();
			for(Object k : s) {
				String ll =(String)k;
				System.out.println(ll+": "+p.getProperty(ll));
			}
//			String value = p.getProperty("URL");
//			String value1 = p.getProperty("NAME");
//			String value2 = p.getProperty("USER");
//			String value3 = p.getProperty("LOCATION");
//			System.out.println(value);
//			System.out.println(value1);
//			System.out.println(value2);
//			System.out.println(value3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  try {
		  //Sending Data to file 
		FileOutputStream kk = new FileOutputStream("DemoProp.properties");
		p.setProperty("db.url","Db1");
		p.setProperty("db.store","Db2");
		p.setProperty("db.location","Db3");
		
		try {
			p.store(kk,"");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	}

}
