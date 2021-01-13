package sec02_runtime_exception;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main ( String [] args ) { 
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]" + data1);
		System.out.println("args[1]" + data2);
		
//		
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
//		at sec02_runtime_exception.ArrayIndexOutOfBoundsExceptionExample.main(ArrayIndexOutOfBoundsExceptionExample.java:6)
		

	}
}
