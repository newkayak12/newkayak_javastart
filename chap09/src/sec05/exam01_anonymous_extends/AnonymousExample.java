package sec05.exam01_anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous();
		
		anony.field.wake();
//		Call overrided one

//		anony.field.work();
//		this one can't be used
		
		
		
		
//		in method
		System.out.println("---------------------");
		anony.method1();
		
		
		
		
//		parameter
//		anonymous object was called at arguments of method2
		System.out.println("-------------------");
		anony.method2(new Person() {
			void sleep() {
				 System.out.println("sleeping");
			 }
			 
			 // new field and method  it can't be used  out of Person() {};
			  @Override
			 void wake() {
				   System.out.println("wake up at 8 A.M.");
				   sleep();
			  }
		});
	}
	
//	필드 메소드 파라미터에서 모두 익명 구현 객체를 사용할 수 있다. 참고로 여기는 상속을 받아서 익명구현 객체를 구현한다.
//	생각해보니까 Parents par = new Parents() { ... }; 가 인터페이스로 익명 구현객체 만드는 거랑 유사하네!
//	Interface => Interface inter = new Interface () { ... };

}
