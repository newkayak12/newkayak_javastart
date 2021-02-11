package sec05.exam06_datainputstream_dataoutputstream;

import java.io.*;

public class DataInputOutputStream {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos  = new FileOutputStream("/Users/sanghyeonkim/Downloads/test1.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("hello! world");
		dos.writeInt(2);
		dos.writeDouble(2.1);
		
		
		dos.writeUTF(" world");
		dos.writeInt(23);
		dos.writeDouble(2.112);
		
		dos.flush();
		dos.close();
		
		
		FileInputStream fis = new FileInputStream("/Users/sanghyeonkim/Downloads/test1.txt");
		DataInputStream dis = new DataInputStream(fis);
			for(int i =0; i<2; i++) {	
				String name = dis.readUTF();
				int value = dis.readInt()	;
				double valueDouble = dis.readDouble();
				System.out.println(name +"  "+ value + " "+ valueDouble);
			}	
		
		dis.close();
	}

}
