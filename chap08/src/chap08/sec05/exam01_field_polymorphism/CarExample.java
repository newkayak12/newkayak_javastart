package chap08.sec05.exam01_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		myCar.frontLeft = new KumhoTire();
		myCar.frontRight = new KumhoTire();
		myCar.run();
		
//		it is not editing Car class but by interface changing, It works different.
		
	}

}
