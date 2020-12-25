package sec08.exam03_method_call;

public class CarExample {

	public static void main(String[] args) {

	Car cr = new Car();  //객체 외부에서 메소드를 호출하려면 생성자로 객체를 호출하고, 메소드를 호출해야만 함
	
		cr.keyTurnOn();
		cr.run();
		
		int speed = cr.getSpeed();
		
			System.out.println("현재 속도 : " +speed+ "km/h");
	
			
	
	}

}
// 코드를 작성하는 나만의 룰을 만들자 예를 들어 선언은 탭 한번 눌러서 일정하게 
// 메소드는 탭을 두번
//
// 뭐 이렇게