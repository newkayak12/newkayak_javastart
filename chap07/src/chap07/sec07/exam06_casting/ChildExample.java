package chap07.sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// parent.field2 = "data2";
		// parent.method3();
		// it can't be used. because parent's type is Parent
		
		Child child = (Child) parent;
		child.field2="data2";
		child.method3();
		
		//Not All  Parents type can be casting to Child type.
		
		
		
			
		
	}

}
