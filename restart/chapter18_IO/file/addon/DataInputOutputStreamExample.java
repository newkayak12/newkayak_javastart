package file.addon;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/test/primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos);

		dos.writeInt(95);
		dos.writeUTF("홍길동");
		dos.writeDouble(2.3);

		dos.flush();
		dos.close();
		fos.close();

		FileInputStream fis = new FileInputStream("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/test/primitive.dat");
		DataInputStream dis = new DataInputStream(fis);

		for(int i = 0; i<2; i++){
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name+":"+score+":"+order);
		}

		dis.close(); fis.close();
	}
}
