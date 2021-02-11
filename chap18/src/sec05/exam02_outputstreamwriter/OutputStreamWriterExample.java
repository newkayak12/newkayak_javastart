package sec05.exam02_outputstreamwriter;

import java.io.*;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos  = new FileOutputStream("/Users/sanghyeonkim/Downloads/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "byte to char stream";
		writer.write(data);
		
		writer.flush();
		writer.close();
		fos.close();
		
			System.out.println("saved");
		
		
		
	}

}
