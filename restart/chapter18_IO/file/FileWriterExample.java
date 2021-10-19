package file;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		File file = new File("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/test/test.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write("테스트 \n 를 합니다.");
		fw.flush();
		fw.close();
		System.out.println("파일 생성");
	}
}
