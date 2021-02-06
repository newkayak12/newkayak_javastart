package sec02.exam04_writer_write;

import java.io.*;

public class WriterExample3 {

	public static void main(String[] args) throws Exception {
		Writer  writer = new FileWriter("/Users/sanghyeonkim/Downloads/test1.txt");
		char[] wrt = "나는 어떡하죠 아직 서툰데 이 마음이 새어나가".toCharArray();
		writer.write(wrt,10,10);
		
		writer.flush();
		writer.close();
	}

}
