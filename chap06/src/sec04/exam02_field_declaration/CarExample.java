package sec04.exam02_field_declaration;

public class CarExample {
public static void main(String[] args) {
	Car myCar = new Car();
	System.out.println("제작 회사는 " + myCar.company);
	System.out.println("모델명 " + myCar.model);
	System.out.println("색깔 " +myCar.color);
    System.out.println("최고 속도 " +myCar.maxSpeed);
    System.out.println("현재 속도 " +myCar.speedNow);
	

	
	
	
	/* Stack | heap 
	 * myCar | 100 Car객체의 주소 _ company라는 필드의 값을 읽어*/
}
}
