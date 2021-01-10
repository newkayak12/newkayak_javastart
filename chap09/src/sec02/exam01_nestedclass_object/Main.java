package sec02.exam01_nestedclass_object;

public class Main {
	public static void main( String [] args ) {
	 A a = new A();
//	A.B  b = A.new B();
//	 new연산자 앞에 클래스 A를 붙이는게 아니라 위에서 만든 A클래스의 객체 a를 붙여야한다 아래와 같이 
	A.B b = a.new B();
	
	b.field1 = 3;
	b.method1();
//	메인 메소드 선언을 안하면 b.field1이 작동을 아예 안하고 컴파일 에러를 뿜네.. 대체 저 메인 메소드는 어떻게 만들어진거지?
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	A.C c = new A.C();
//	인스턴스 클래스는 outter 클래스의 객체가 있어야 내부 클래스를 생성 할 수 있었다면 static은 상관없음
	c.field1=3;
	c.field2 =4;
	c.method1();
	c.method2();
	
A.C.field2= 4;
//이렇게 아예 객체를 안 만들고도 호출이 가능하다. static인 경우에

	a.method();
	}
}
