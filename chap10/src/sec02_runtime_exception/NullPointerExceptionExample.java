package sec02_runtime_exception;

public class NullPointerExceptionExample {
	public static void main ( String [] args ) { 
	
		String data = null;
		System.out.println(data.toString());
//		일반 예외가 발생하지 않아서 compile은 발생하지 않음
//		그러나 runtime 예외가 발생!!! = 컴파일러가 체크해주지 않음
		
		
//		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because "data" is null
//		at sec02_runtime_exception.NullPointerExceptionExample.main(NullPointerExceptionExample.java:7)
//		invoke : 호출하다

	}
}
