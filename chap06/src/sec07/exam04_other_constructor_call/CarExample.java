package sec07.exam04_other_constructor_call;

public class CarExample {

	public static void main(String[] args) {
		
		
		Car car1 = new Car();
		System.out.println("car1.company: " + car1.company);
		System.out.println("car1.model: " + car1.model);
		System.out.println("car1.color: " + car1.color);
		System.out.println("car1.maxSpeed: " +car1.maxSpeed);
		System.out.println();
		Car car2 = new Car("E300");
		System.out.println();
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println("car2.color: " + car2.color);
		System.out.println("car2.maxSpeed: " +car2.maxSpeed);
		System.out.println();
		Car car3 = new Car("E300", "White");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println("car3.maxSpeed: " +car3.maxSpeed);
		System.out.println();
		Car car4 = new Car("E300", "white", 300);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " +car4.maxSpeed);
		
	//생성자 따라서 필드값이 초기화만 된 경우가 나올 수 있음 
		// 겁나 중복된걸 많이 쳐야되서 진짜 for로 돌리고 싶었음  
//		중복코드는 최대한 작성하지 않도록 하는게 원칙, this()로 생성자  중노동을 막을 수 있음
		
	
	}

}
