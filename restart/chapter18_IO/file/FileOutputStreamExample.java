package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception{
		String oriFile = "/Users/sanghyeon/Downloads/IMG_1986.jpeg";
		String target = "/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/copied.jpeg";

		FileInputStream fis = new FileInputStream(oriFile);
		FileOutputStream fos = new FileOutputStream(target);

		int readByteNo;
		byte[] readBytes = new byte[100];

		while((readByteNo = fis.read(readBytes)) != -1){
			fos.write(readBytes,0,readByteNo);
		}

		fos.flush();
		fos.close();
		fis.close();

		System.out.println("복사 완료");
	}
}
