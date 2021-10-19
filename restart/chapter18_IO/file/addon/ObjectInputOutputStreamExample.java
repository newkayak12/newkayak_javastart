package file.addon;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/test/obj.data");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(12.1));
		oos.writeObject(new String("hong"));

		oos.flush(); oos.close(); fos.close();

		FileInputStream fis = new FileInputStream("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/test/obj.data");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		String obj3 = (String) ois.readObject();

		ois.close(); fis.close();

		System.out.println(obj1+":"+obj2+":"+obj3);

	}
}
