package sec02.exam03_reader_read;

import java.io.*;

public class ReadExample3 {
	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("/Users/sanghyeonkim/Downloads/test1.txt");
		
		int readCharNo;
		
		char[] cbuf = new char[4];
		cbuf[0] = '그';
			while( (readCharNo=reader.read(cbuf,1,3)) != -1)	{
					for(int i =0; i<cbuf.length; i++) {
						System.out.print(cbuf[i]);
					}
			}
		
		
			reader.close();
	}
}
