package sec03.exam04_outterclass_reference;

public class Outter_ref {

	String field = "Outter-field";
		void method() {
			System.out.println("Outter-method");
		}

	class Nested{
		String field = "Nested-field";
		void method() {
		System.out.println("Nested-method");
	
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter_ref.this.field);
			Outter_ref.this.method();
//			바깥 객체의 참조는 바깥 클래스명. this. 메소드나 필드
//			내부 객체는 this.메소드나 필드 
			
		}
	}	
		
}
	
