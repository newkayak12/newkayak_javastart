package file.addon;

import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception{
		long start = 0, end =0;

		FileInputStream fis1 = new FileInputStream("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/test/test.txt");
		start = System.nanoTime();
		while(fis1.read()!=-1){}
		end = System.nanoTime();
		System.out.println("none buffered "+(end-start)+"ms");
		fis1.close();

		FileInputStream fis2 = new FileInputStream("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/test/test.txt");
		BufferedInputStream bfs = new BufferedInputStream(fis2);
		start = System.nanoTime();
		while(bfs.read()!=-1){}
		end = System.nanoTime();
		System.out.println("used buffered "+(end-start)+"ms");
		bfs.close();
		fis2.close();
	}
}
