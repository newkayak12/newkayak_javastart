package file.addon;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;


		int data = -1;
		long start = 0; 
		long end = 0;

		fis = new FileInputStream("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/copied.jpeg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/test/copied.jpeg");

		start = System.nanoTime();
		while((data = bis.read()) != -1){
			fos.write(data);
		}
		fos.flush();
		end = System.nanoTime();
		fos.close(); bis.close(); fis.close();
		System.out.println("NONE BUFFER "+ (end-start)+"ms");

		fis = new FileInputStream("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/copied.jpeg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/test/copied.jpeg");
		bos = new BufferedOutputStream(fos);

		data = -1;
		start = System.nanoTime();
		while((data = bis.read()) != -1){
			bos.write(data);
		}
		bos.flush();
		end = System.nanoTime();

		bos.close(); fos.close(); bis.close(); fis.close();
		System.out.println("BUFFERED " + (end-start)+"ms");


	}
}
