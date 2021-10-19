package file.addon.Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialVersionUIDExmple2 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("/Users/sanghyeon/Downloads/dev/newkayak_javastart/restart/chapter18_IO/file/test/serialUID.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		 ClassC classC = (ClassC) ois.readObject();
		 System.out.println(classC.field1);
		 /*
			Exception in thread "main" java.io.InvalidClassException: file.addon.Serializable.ClassC; local class incompatible: stream classdesc serialVersionUID = 1297366178083229424, local class serialVersionUID = -8670840941699631612
			at java.base/java.io.ObjectStreamClass.initNonProxy(ObjectStreamClass.java:689)
			at java.base/java.io.ObjectInputStream.readNonProxyDesc(ObjectInputStream.java:2134)
			at java.base/java.io.ObjectInputStream.readClassDesc(ObjectInputStream.java:1984)
			at java.base/java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:2291)
			at java.base/java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1801)
			at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:577)
			at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:487)
			at file.addon.Serializable.SerialVersionUIDExmple2.main(SerialVersionUIDExmple2.java:10)
		 */
	}
}
