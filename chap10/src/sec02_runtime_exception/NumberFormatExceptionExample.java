package sec02_runtime_exception;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {

//		문자열을 숫자로 변환하는 경우가 많은데 그때
//		Integer.parseInt(String s);
//		Double.parseDouble(String s); 
//		등을 사용해서 문자열을 숫자로 변환
		
		String data1 = "100";
		String data2 = "100a";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
//		
//		Exception in thread "main" java.lang.NumberFormatException: For input string: "100a"
//			at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
//			at java.base/java.lang.Integer.parseInt(Integer.java:652)
//			at java.base/java.lang.Integer.parseInt(Integer.java:770)
//			at sec02_runtime_exception.NumberFormatExceptionExample.main(NumberFormatExceptionExample.java:16)
		
		
		
		
//		data2  100a가 숫자로 변환할 수 없어서 나오는 '숫자 포맷 예외'이다.
	}

}
