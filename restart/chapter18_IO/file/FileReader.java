package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class FileReader {
	public static void main(String[] args) throws Exception{ 
		File f = new File("/Users/sanghyeon/Downloads/yjyj.rtf");
		// java.io.FileReader fr = new java.io.FileReader(f);
		BufferedReader fr = new BufferedReader(new InputStreamReader( new FileInputStream(f),"utf8"));
		
		

		int readCharNo;

		char[] cbuf = new char[2000];

		while((readCharNo=fr.read(cbuf))!= -1){
			String data = new String(cbuf,0,readCharNo);
			System.out.println(data);
		}
		fr.close();
	}
}
