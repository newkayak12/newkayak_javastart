	package chap08.sec07.exam01_why_default_method;

public interface MyInterface {
	 public void method1();
//	 public void method2();
//	 if you add abstract method2, MyClassA show error. because of method2
	 
	 public default void method2() {
		 System.out.println("MyInterface-method2 run");
//		 This will not cause MyClassA error
	 }
}
