package chap08.sec05.exam03_method_polymorphism;

public class DriveExample {

	public static void main(String[] args) {

			Driver driver = new Driver();
			
			Bus bus = new Bus();
			Taxi taxi = new Taxi();
			
			driver.drive(bus);
			driver.drive(taxi);
				
				
	}

}
