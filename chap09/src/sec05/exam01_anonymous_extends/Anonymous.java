package sec05.exam01_anonymous_extends;

public class Anonymous {
 Person field = new Person() {
	 String studentNo;
	 void work() {
		 System.out.println("Commute");
	 }
	 
	 // new field and method  it can't be used  out of Person() {};
	  @Override
	 void wake() {
		   System.out.println("wake up at 6 A.M.");
		   work();
	  };
 };
//  그냥 ()로 끝나는거랑  {};로 끝나는 거랑은 차원이 다름
// person이라는 클래스를 상속을 해서 자식 클래스를 만들고 그걸 객체 생성해서 대입하라는 의미로 바뀜 
 
 void method1() {
	 Person localVar = new Person() { 
		 String studentNo;
		 void work() {
			 System.out.println("Jogging");
		 }
		 
		 // new field and method  it can't be used  out of Person() {};
		  @Override
		 void wake() {
			   System.out.println("wake up at 7 A.M.");
			   work();
		  };
	 };
	 localVar.wake();
	 
 }
 
 void method2(Person person) {
	 person.wake();
 }
}
