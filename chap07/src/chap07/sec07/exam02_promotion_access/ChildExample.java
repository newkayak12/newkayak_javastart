package chap07.sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {

		Child chld = new Child();
		Parent prnt = chld;
		
		prnt.method1();
		
		prnt.method2();
		//overrode, it call child's method 2 not parent's method2
		
		
		//prnt.method3();
		//is undefined for the type Parent
	}

}
