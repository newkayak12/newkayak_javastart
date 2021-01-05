package chap07.sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {

		// Phone phone = new Phone(); (X)
		SmartPhone smartphone = new SmartPhone("sherlock");
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
	}

}
