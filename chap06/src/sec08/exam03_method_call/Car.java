package sec08.exam03_method_call;

public class Car {
 
	
	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	
	void keyTurnOn() {
		System.out.println("시동을 걸었습니다.");
	}
	
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed= i;
			System.out.println("주행 중입니다. (시속 : " +speed+ "km/h)" );
		}
	}
	
}
