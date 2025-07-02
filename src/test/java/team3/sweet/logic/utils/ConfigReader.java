package team3.sweet.logic.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties prop;
	
	public static String getProperty(String key){
		
		if ( prop == null ) {
			
			prop = new Properties();
			try {
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "//src//test//resources//Config//config.properties");
				prop.load(fis);
			}catch(Exception e) { e.printStackTrace(); }					
		}
		
		Object obj = prop.get(key);
		if ( obj != null ) return obj.toString();
		else return null;
	}
	
}

