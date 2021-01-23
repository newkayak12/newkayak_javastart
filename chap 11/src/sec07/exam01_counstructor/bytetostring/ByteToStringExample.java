package sec07.exam01_counstructor.bytetostring;

public class ByteToStringExample {

	public static void main(String[] args) {
//		파일의 내용을 읽거나 네트웍을 통해 읽은 데이터는 모두 byte 타입
//		그래서 자주 씀
		 byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		 
		 String str1 = new String (bytes);
//		 이 전체 byte항목을 문자로 변환해서 문자열로 return을  String 생성자가 한다.
		 	System.out.println(str1);
		
		
	}

}
