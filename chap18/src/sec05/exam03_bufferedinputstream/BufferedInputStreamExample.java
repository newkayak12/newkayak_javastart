package sec05.exam03_bufferedinputstream;

import java.io.*;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		
		long start = 0;
		long fin = 0;
		
		FileInputStream fis1 = new FileInputStream("/Users/sanghyeonkim/Downloads/newkayak_javastart/chap18/src/sec04/exam03_file_output_stream/file.png");
		start = System.currentTimeMillis();
			while( fis1.read() != -1 ) {
				
			}
		fin = System.currentTimeMillis();
		
		System.out.println("didn't use buffer : " + (fin- start)+ "ms");
		fis1.close();
		
		
		
		
		

		FileInputStream fis2 = new FileInputStream("/Users/sanghyeonkim/Downloads/newkayak_javastart/chap18/src/sec04/exam03_file_output_stream/file.png");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
			while( bis.read() != -1 ) {
				
			}
		fin = System.currentTimeMillis();
		
		System.out.println("used buffer : " + (fin- start)+ "ms");
		fis2.close();
		bis.close();
		
	}

}
