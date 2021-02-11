package sec05.exam04_bufferedreader;

import java.io.*;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		
			System.out.print("입력 : ");
		String lineString = br.readLine();
			System.out.print("출력 : ");
			System.out.println(lineString);
		
		
		
		is.close();
		reader.close();
		br.close();
	}

}
