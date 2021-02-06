package sec04.exam03_file_output_stream;

import java.io.*;

public class FileOutputStreamExample {

	public static void main(String[] args)  throws Exception{
		String originalFileName =  "/Users/sanghyeonkim/Downloads/newkayak_javastart/chap18/src/sec04/exam03_fileoutputstream/file.png";
		String targetFileName =  "/Users/sanghyeonkim/Downloads/dir/copy.png";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readData;
		byte[] readBytes =new byte[100];
		
			while( (readData=fis.read(readBytes) )!=-1) {
				fos.write(readBytes,0,readData);
				
			}
			fos.flush();
			fos.close();

			fis.close();
			
			//파일(음악,사진, 영상등 이렇게)
		
	}

}
