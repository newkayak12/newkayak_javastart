package sec05.exam02_garbage_collector;

public class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno=eno;
		System.out.println("Employee("+ eno +")이 메모리에서 생성 됨.");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee("+ eno +")이 메모리에서 제거 됨.");
	}
	
	
	
}
