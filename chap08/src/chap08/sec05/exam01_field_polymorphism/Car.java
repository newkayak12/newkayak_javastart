package chap08.sec05.exam01_field_polymorphism;

public class Car {
	Tire frontLeft = new HankookTire();
	Tire frontRight = new HankookTire();
	Tire backLeft = new HankookTire();
	Tire backRight = new HankookTire();

	void run() {
		frontLeft.roll();
		frontRight.roll();
		backLeft.roll();
		backRight.roll();
	}
}


