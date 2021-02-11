package sec05.exam08_1_serializable;

import java.io.*;

public class SerializableExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("tst1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassA classa = new ClassA ();
		classa .field1 =1;
		classa.field2.field1 =2;
		classa.field3 = 3;
		classa.field4 =4;
		
		oos.writeObject(classa);
		
		oos.flush();
		oos.close();
		
		
		
		
		FileInputStream fis = new FileInputStream("tst1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassA v = (ClassA) ois.readObject();
		System.out.println(v.field1+" "+v.field2.field1+" "+v.field3+" "+v.field4);
		
		
	}

}
