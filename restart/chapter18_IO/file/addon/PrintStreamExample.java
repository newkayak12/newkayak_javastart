package file.addon;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/test/file.txt");
		PrintStream ps = new PrintStream(fos);

		ps.println("print stream");
		ps.println("test");
		ps.flush();
		ps.close();
		fos.close();
	}
}
