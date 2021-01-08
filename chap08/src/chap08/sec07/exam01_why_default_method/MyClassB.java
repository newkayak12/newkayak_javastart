package chap08.sec07.exam01_why_default_method;

public class MyClassB implements  MyInterface {
	@Override
	public void method1() {
		
	}
	@Override
	public void method2() {
		System.out.println("MyClassB default method");
//		MyInterface.super.method2();
//		seems like a inherited overrided method
	}
}
