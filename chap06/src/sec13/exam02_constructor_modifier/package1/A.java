package sec13.exam02_constructor_modifier.package1;

public class A {
	A a1 =new A(true);
	//public one, it can be used in this class and anywhere.
	
	A a2 = new A();
	// default one, it can be used in this class and involved package's class
	
	A a3 = new A("hello");
	// private one, i can be used only in the class
	
	
	public A(boolean b) {}
	//public constructor		   
		
	A (){ }
	//default constructor
	
	private A(String s) {}
	//Private constructor
			   
}
