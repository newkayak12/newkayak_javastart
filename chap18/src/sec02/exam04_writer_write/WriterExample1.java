package sec02.exam04_writer_write;

import java.io.*;

public class WriterExample1 {

	public static void main(String[] args) throws Exception {
		Writer  writer = new FileWriter("/Users/sanghyeonkim/Downloads/test1.txt");
		
		char[] data = "첫사랑".toCharArray();
			for(int i =0; i<data.length; i++) {
				writer.write(data[i]);
			}
		writer.flush();
		writer.close();
	}

}
