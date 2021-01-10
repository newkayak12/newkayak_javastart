package sec02.exam01_nestedclass_object;

public class A {

		A() {
			System.out.println("Object A is created");
			B b = new B();
			b.field1 = 3;
			b.method1();
//	  생성자 안에서 사용해야한다 이렇게 사용하려면  왜냐면 A라는 객체를 만들어야 B라는 객체를 만들 수 있으니
		}
		
		
		
		
		
 class B {
		int  field1;
//		static int field2;
//		in instance class, you can't make static filed, method
		B() {
			System.out.println("Object B is created");
		}
//		static void method1() {
//			
//		}
		
//		 can't make static method in instance class
		
		void method1() {
			
		}
 }
 
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 
 static class C{
	 int field1;
	 static int field2;
//	 static class에서는 instance, static 다 가능
	 C(){
		 System.out.println("object C is created");
	 }
	 
	 void method1()	{
	 }
	 
	 static void method2() {
	 }
 }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	 
	 
	public void method() {
		class D{
			int field1;
//			static int field2;
//			in local class you can declare static field
			D(){
				System.out.println("object D is created");
			}	
				
//				static void method 2();
//				same as field
				void  method1() {}
		}
		D d = new D();
		d.field1=4;
		d.method1();
		
		//local class can be used in this method only
	}
 

	
}
