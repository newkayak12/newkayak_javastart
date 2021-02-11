package sec05.exam08_0_objectinput_outputstream;

import java.io.*;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("test1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos)	;
		
		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] {1,2,3,});
		oos.writeObject(new String("hone"));
		
		oos.flush();
		oos.close();
		fos.close();
		
		
		
		FileInputStream fis = new FileInputStream("test1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();
		
		ois.close();
		fis.close();
		
		
		System.out.println(obj1 +" "+obj2 +" "+ obj4);
		System.out.println(obj3[0]+" "+obj3[1]+" "+obj3[2]);
		
	}
}
