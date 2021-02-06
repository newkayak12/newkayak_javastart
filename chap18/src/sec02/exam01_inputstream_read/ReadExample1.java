package sec02.exam01_inputstream_read;

import java.io.*;
import java.nio.channels.*;


public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("/Users/sanghyeonkim/Downloads/test1.txt");

//			방법 1
			int readByte;
				while( (readByte=is.read() )!= -1 )	{
						
//					System.out.println(readByte); //ASCII코드 반환
					System.out.println( (char) readByte );
				}
				
				
//				방법 2
				while(true) {
				 readByte = is.read();
				 	if(readByte ==-1) break;
				 	System.out.println( (char)readByte );
				}
		
		is.close();
		
	}
}
