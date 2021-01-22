package sec05.exam02_garbage_collector;

public class GcExample {

	public static void main(String[] args) {
		Employee emp ;
		
		emp = new Employee(1);
		emp =null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.print("emp가 최종적으로 참조하는 사원 번호 : ");
		System.out.println(emp.eno);
		System.gc();
//	 	jvm이 종료가 되면 메모리가 해제되고 gc도 같이 종료되서... 뭐 결과적으로는 메모리반환을 하긴하는데...
//		결국 gc는 프로그램 중간 중간에 호출해가면서 쓰는 것이다. 
		
	}

}
