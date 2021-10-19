package file.addon.Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableRead {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/test/serial.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassA classA = (ClassA) ois.readObject();
		System.out.println(classA);
	}
}
