package sec02_runtime_exception;

public class ArrayIndexOutOfBoundsExceptionSolutionExample {
	public static void main ( String [] args ) { 
		if(args.length == 2 ) {
			String data1 = args[0];
			String data2 = args[1];
		
		System.out.println("args[0]" + data1);
		System.out.println("args[1]" + data2);
		} else {
			System.out.println("[실행방법]");
			System.out.print("java.ArrayIndexOutOfBoundsExceptionSolutionExample");
			System.out.println(" 값1 값2");
		}
//		
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
//		at sec02_runtime_exception.ArrayIndexOutOfBoundsExceptionExample.main(ArrayIndexOutOfBoundsExceptionExample.java:6)
		

	}
}
