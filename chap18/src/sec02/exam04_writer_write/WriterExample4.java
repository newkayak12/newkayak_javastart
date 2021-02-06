package sec02.exam04_writer_write;

import java.io.*;

public class WriterExample4 {

	public static void main(String[] args) throws Exception {
		Writer  writer = new FileWriter("/Users/sanghyeonkim/Downloads/test1.txt");
		String song = "그렇게 노래방을 나오고 그녀를 집에 데려다준 뒤 ";
//		writer.write(song);
		writer.write(song,5,15);
		writer.flush();
		writer.close();
	}

}
