package sec05.exam07_printstream;

import java.io.*;

public class PrintStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("/Users/sanghyeonkim/Downloads/test1.txt");
		PrintStream ps = new PrintStream (fos);
		
		ps.println("print sub stream");
		ps.print("as");
		
		
		ps.flush();
		ps.close();
		fos.close();
	}

}
