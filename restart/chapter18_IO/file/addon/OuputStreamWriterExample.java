package file.addon;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OuputStreamWriterExample {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/test/tt.txt");
		Writer writer = new OutputStreamWriter(fos);

		String data = "바이트 출력 스트림을 문자로 변환";
		writer.write(data);
		writer.flush();
		writer.close();
		System.out.println("fin");
	}
}
