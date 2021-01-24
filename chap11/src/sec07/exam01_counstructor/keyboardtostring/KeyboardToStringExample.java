package sec07.exam01_counstructor.keyboardtostring;

public class KeyboardToStringExample {

	public static void main(String[] args) throws Exception {
//		jvm이 떠넘김 당해서 에러 발생시 출력함
		byte[] bytes = new byte[100];
			System.out.print("Enter any character: ");
		
			int readByteNo = System.in.read(bytes);
			
			String str = new String(bytes, 0, readByteNo-2);
				System.out.println(str);
		
	}

}
