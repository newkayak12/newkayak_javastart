package sec02.exam03_reader_read;

import java.io.*;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("/Users/sanghyeonkim/Downloads/test1.txt");
		
		int readCharNo;
		
		char[] cbuf = new char[2];
		String data ="";
			while( (readCharNo=reader.read(cbuf)) != -1)	{
				
				data += new String(cbuf, 0, readCharNo);
			}
		
			System.out.println(data);
		
			reader.close();
	}
}
