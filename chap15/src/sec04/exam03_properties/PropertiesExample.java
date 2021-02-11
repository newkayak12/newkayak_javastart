package sec04.exam03_properties;

import java.io.*;
import java.net.*;
import java.util.*;

public class PropertiesExample  {
	public static void main(String[] args)  throws IOException {
		//property는 키와 값을 String으로 제한한 Map컬렉션
		//옵션정보, 데이터베이스 연결 정보, 국제화 정보를 기록한 텍스트 파일로 활용
		// 애플리케이션에서 주로 변경이 잦은 문자열을 저장해서 유지보수를 편리하게 만듦
		//이러면 따로 클래스를 손대는 것이 아니라 property만 손대면 설정을 바꿀 수 있음
		
		
//		한글은 UNICODE로 변환되어 저장
		
//			File f = new File("config.properties");
//			FileOutputStream fo = new FileOutputStream(f);
//			DataOutputStream dao = new DataOutputStream(fo);
//			f.createNewFile();
//					
//			dao.writeUTF("driver = oracle.jdbc.OracleDriver\n");
//			dao.writeUTF("url = jdbc:oralce\n");
//			dao.writeUTF("user = scott\n");
//			dao.writeUTF("password = parker\n");
		
			
		
			Properties prop = new Properties();
//			String path = PropertiesExample.class.getResource("config.properties").getPath();
//			path = URLDecoder.decode(path,"UTF-8");
			String path ="config.properties";
			
			prop.load(new FileReader(path));
			
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String id = prop.getProperty("id");
			String password = prop.getProperty("password");
			
			System.out.println(driver+"\n"+url+"\n"+id+"\n"+password);
			
		
		
	}
}
