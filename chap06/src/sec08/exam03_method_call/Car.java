package sec08.exam03_method_call;

public class Car {
 
	
	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	
	void keyTurnOn() {
		System.out.println("�õ��� �ɾ����ϴ�.");
	}
	
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed= i;
			System.out.println("���� ���Դϴ�. (�ü� : " +speed+ "km/h)" );
		}
	}
	
}
