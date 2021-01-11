package sec03.exam01_member_class.access;

public class A {
	class B{}
	static class C {}
	
//		!!field of A
	B field1 = new B();
	C field2 = new C();
	
//	 	!!instance method
	
	void method1() {
//		local variable
		B var1 = new B();
		C var2 = new C();
//		no probelm. 
		
	}
//  in instance anything, static, instance are work properly
	
//	static B filed3 =  newB();
	static C field4 = new C();
//	 without object of A, it can't be used. but static one can be used	
		
//	 	!!static method
	static void method2() {
//	B var1 = new B();
//	in static method, B can't be objectifiy
//	인스턴스 멤버 클래스는 상위 클래스에 종속성을 갖는다. 
//	static은 클래스 수준에서 구현되므로 큰 문제가 안된다. (상위 객체가 필요한 경우)
	
	C var2 = new C();
	
	}
}
