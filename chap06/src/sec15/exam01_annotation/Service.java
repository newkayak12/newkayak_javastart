package sec15.exam01_annotation;

public class Service {

	@PrintAnnotation
	public void method1() {
		System.out.println("Runtime1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("Runtime2");
	}
	
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("Runtime3");
	}
}
