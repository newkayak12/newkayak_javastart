package sec02.exam01_inputstream_read;

import java.io.*;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("/Users/sanghyeonkim/Downloads/test1.txt");
		
		int readByteNo;
		byte[] readBytes = new byte[8];
			
		readByteNo = is.read(readBytes,2,3);
		
			for( int i =0; i<readBytes.length; i++ ) {
				System.out.println(readBytes[i]	);
			}
			
			is.close();
			
	}
}
