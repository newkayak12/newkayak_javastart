package sec07.exam02_method.getbyte;

import java.io.*;

public class StringGetByteExample {

	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] bytes1 =str.getBytes();
			System.out.println("byte's length " + bytes1.length);
		String str1 = new String(bytes1);
			System.out.println("byte to String " + str1);
		
			System.out.println();
			try {
			byte[] bytes3 = str.getBytes("EUC-KR");
				System.out.println("EUC-KR " +bytes3.length);
			String str3 = new String (bytes3,"EUC-KR"); //디코드 할 방법 정함 > 안꺠짐
//			String str3 = new String (bytes3); // 디코드 방법 안정함 UTF-8로 디코드 > 깨짐
				System.out.println("bytes to String " + str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
			System.out.println();
			try {
				byte[] bytes4 = str.getBytes("UTF-8");
					System.out.println("UTF-8 " +bytes4.length);
				String str3 = new String (bytes4);
					System.out.println("bytes to String " + str3);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			
			
			System.out.println();
		String str2 = "hello";
		
		byte[] bytes2 =str.getBytes();
			System.out.println("byte's length " + bytes2.length);

	}

}
