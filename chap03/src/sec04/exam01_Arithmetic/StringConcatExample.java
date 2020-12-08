package sec04.exam01_Arithmetic;

public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="JDK" + 14.0;
		String str2 = str1 +" 특징";
		System.out.println(str2);

		
		//문자열 연결 연산자 +는 왼쪽에서부터 더해짐 문자+숫자+숫자면 문자 숫자 숫자 순으로 나오고 숫자+숫자+문자면 숫자끼리 산술 계산+문자열
		String str3="jdk" + 3 +3.0; 
		System.out.println(str3); //jdk33.0
		String str4= 3+ 3.0 +"jdk";
		System.out.println(str4); //6.0jdk 참... 헷깔리게도 만들어놨네
		
	}

}
