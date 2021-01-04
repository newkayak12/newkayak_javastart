package chap07.sec07.exam07_instanceof;

public class InstanceofExample {
	public static void method1( Parent parent ) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("casting");
			}	else { 
				System.out.println("not casting");
			}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("casting");
	}
	
	
	public static void main(String[] args) {
Parent parentA= new Child();
method1(parentA);
method2(parentA);

Parent parentB = new Parent();
method1(parentB);
method2(parentB);
//class cast exception > variable/  instanceof /type
	}

}
