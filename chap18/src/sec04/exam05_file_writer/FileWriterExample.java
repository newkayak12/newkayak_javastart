package sec04.exam05_file_writer;

import java.io.*;

public class FileWriterExample {

	public static void main(String[] args) throws Exception{
		File file = new File("/Users/sanghyeonkim/Downloads/dir/test.txt");
		FileWriter fw= new FileWriter(file);
		
		fw.write("filewriter는 한글로 된 "+"\r\n");
		fw.write("문자열을 출력할 수 있다. "+"\r\n");
		
		fw.flush();
		fw.close();
		
		System.out.println("saved ");
		
	}

}
