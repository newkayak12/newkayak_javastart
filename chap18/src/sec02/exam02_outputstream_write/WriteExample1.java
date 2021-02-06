package sec02.exam02_outputstream_write;

import java.io.*;

public class WriteExample1 {
	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream( "/Users/sanghyeonkim/Downloads/test1.txt" );
		
		byte[] data = "ABC".getBytes();
			for( byte datas : data ) {
				os.write(datas);
			}
			os.flush();
			os.close();
	}
}
