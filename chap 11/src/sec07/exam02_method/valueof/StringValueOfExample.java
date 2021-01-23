package sec07.exam02_method.valueof;

public class StringValueOfExample {

	public static void main(String[] args) {
//		기본 타입의 값을 문자열로 변환
		
		String str1 = String.valueOf(10);
			System.out.println(str1);
		String str2 = String.valueOf(10.5);
			System.out.println(str2);
		String str3 = String.valueOf(true);
			System.out.println(str3);
//		얘네들은 문자 열이다. ...
	}

}
