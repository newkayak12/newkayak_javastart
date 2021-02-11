package sec05.exam05_bufferedoutputstream;

import java.io.*;

public class BufferdOutputStreamExample {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream("/Users/sanghyeonkim/Downloads/newkayak_javastart/chap18/src/sec04/exam03_file_output_stream/file.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("/Users/sanghyeonkim/Downloads/dir/file.png");
		start = System.currentTimeMillis();
		
			while( (data =bis.read()) != -1) {
				fos.write(data);
			}
			
		fos.flush();
		end = System.currentTimeMillis();
		
		fis.close();
		fos.close();
		bis.close();
		System.out.println("no buffer : " + (end -start));
		
		
		fis = new FileInputStream("/Users/sanghyeonkim/Downloads/newkayak_javastart/chap18/src/sec04/exam03_file_output_stream/file.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("/Users/sanghyeonkim/Downloads/dir/file.png");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		
			while( (data =bis.read()) != -1) {
				bos.write(data);
			}
			
		fos.flush();
		end = System.currentTimeMillis();
		
		fis.close();
		fos.close();
		bis.close();
//		bos.close();
		System.out.println("buffer : " + (end -start));
		
		
		
		
		

	}

}
