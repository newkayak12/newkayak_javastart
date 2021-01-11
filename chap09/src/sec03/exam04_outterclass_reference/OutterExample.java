package sec03.exam04_outterclass_reference;

public class OutterExample {

	public static void main(String[] args) {

			Outter_ref outter = new Outter_ref();
			
			Outter_ref.Nested net =  outter.new Nested();
//		바깥 객체를 만든 것으로 내부 객체에 접근
//			외부클래스명.	내부 클래스 명 (변수) = 외부 객체.new 내부 클래스 명();
			net.print();
			
	}

}
