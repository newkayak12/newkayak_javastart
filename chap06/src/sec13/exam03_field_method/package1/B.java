package sec13.exam03_field_method.package1;

public class B {

	public B() {
		A a= new A();
		
		a.field1 =1;
		a.field2 =1;
	//	a.field3 =1;
		
		a.method1();
		a.method2();
	//	a.method3();
	}
	
	// field3, method3 is not work because these are private
	// Unless class a,b is in same package, it not work
}
