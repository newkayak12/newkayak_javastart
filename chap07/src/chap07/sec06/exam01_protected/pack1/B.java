package chap07.sec06.exam01_protected.pack1;

public class B {
	public void method() {
		A a =new A();
		// in same pack, you can construct protect one
		a.field = "value";
		a.method();
	}
}
