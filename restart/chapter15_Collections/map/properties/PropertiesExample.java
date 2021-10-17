package map.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) {
		Properties prop = new Properties();
		String path = PropertiesExample.class.getResource("db.properties").getPath();
		
		try {
			path = URLDecoder.decode(path, "UTF-8");
			prop.load(new FileReader(path));

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("driver :"+prop.getProperty("driver"));
		System.out.println("url :"+prop.getProperty("url"));
		System.out.println("username :"+prop.getProperty("username"));
		System.out.println("password :"+prop.getProperty("password"));
	}
}
