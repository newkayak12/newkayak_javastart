package sec05.exam01_inputstreamreader;

import java.io.*;

public class InputStreamReeader {
	public static void main(String[] args) throws Exception{
		InputStream is =System.in;
		Reader reader = new InputStreamReader(is);
		
		int readCharNo;
		char[]	cbuf = new char [100];
		
			while( (readCharNo = reader.read(cbuf)) != -1) {
//				console에서 ctrl + g를 누르면 -1을 리턴 
				String data = new String(cbuf, 0, readCharNo);
					System.out.println(data);
			}
			
			is.close();
			reader.close();
	}
}
