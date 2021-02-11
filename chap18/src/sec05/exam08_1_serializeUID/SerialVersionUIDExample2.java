package sec05.exam08_1_serializeUID;

import java.io.*;

public class SerialVersionUIDExample2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis  = new FileInputStream("serial.txt");
		
		ObjectInputStream oos = new ObjectInputStream(fis);
		
		ClassC classc = (ClassC) oos.readObject();
		System.out.println(classc.field1);
		
		fis.close();
		oos.close();
		
		
		
//		Exception in thread "main" java.io.InvalidClassException: sec05.exam08_1_serializeUID.ClassC; local class incompatible: stream classdesc serialVersionUID = -6681458247153525756, local class serialVersionUID = -3557175049965438421
//				at java.base/java.io.ObjectStreamClass.initNonProxy(ObjectStreamClass.java:689)
//				at java.base/java.io.ObjectInputStream.readNonProxyDesc(ObjectInputStream.java:2134)
//				at java.base/java.io.ObjectInputStream.readClassDesc(ObjectInputStream.java:1984)
//				at java.base/java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:2291)
//				at java.base/java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1801)
//				at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:577)
//				at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:487)
//				at sec05.exam08_1_serializeUID.SerialVersionUIDExample2.main(SerialVersionUIDExample2.java:12)

		
	}

}
