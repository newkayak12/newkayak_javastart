package sec05.exam08_2_inherit_serial;

import java.io.*;

public class NonSerializableParentExample {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("tick.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Child child = new Child();
		child.field1 = "hong";
		child.field2 = "jang";
		oos.writeObject(child);
		oos.flush();
		fos.close();
		oos.close();
		
		
		
		FileInputStream fis = new FileInputStream("tick.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Child v = (Child) ois.readObject();
		System.out.println(v.field1 + v.field2);
		
		fis.close();
		ois.close();
	}

}
