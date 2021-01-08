package chap08.sec07.exam02_default_method_extends;

public interface ChildInterface3 extends ParentInterface {
//	 In this interface we will make Parent's default method to abstract method
	
	@Override
	public void method2();
//	remove {}
	
	public void method3();
	
}
// inheritance and make default method to abstract method _3