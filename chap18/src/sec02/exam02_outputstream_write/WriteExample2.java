package sec02.exam02_outputstream_write;

import java.io.*;

public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("/Users/sanghyeonkim/Downloads/test1.txt");
		
		byte[] data = "ABCDE".getBytes();
			os.write(data);  //이전 예제에 비해서 write가 한 번만 돌았음 이전 예제는 여러 번 돌았는데 이게 더 효율적임
			os.flush();
			os.close();
	}
}
