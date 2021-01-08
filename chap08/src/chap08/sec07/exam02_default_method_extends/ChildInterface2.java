package chap08.sec07.exam02_default_method_extends;

public interface ChildInterface2 extends ParentInterface {
	@Override
	default void method1() {
		System.out.println("in ChildInterface2, method1 overrided");
	}
	public void method3();
	
}
// inheritance and override _2