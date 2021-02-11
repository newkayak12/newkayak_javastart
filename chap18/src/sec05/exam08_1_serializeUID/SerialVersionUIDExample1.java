package sec05.exam08_1_serializeUID;

import java.io.*;

public class SerialVersionUIDExample1 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos  = new FileOutputStream("serial.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassC classc = new ClassC();
		
		classc.field1 = 1;
		
		oos.writeObject(classc);
		oos.flush();
		oos.close();
		fos.close();
		
		
		
	}

}
