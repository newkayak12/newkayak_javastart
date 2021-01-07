package chap08.sec05.exam02_field_array_polymorphism;

public class CarExample_arr {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		myCar.tires[0] = new KumhoTire_arr();
		myCar.tires[1] = new KumhoTire_arr();
		myCar.run();
//		it is not editing Car class but by interface changing, It works different.
		
	}

}
