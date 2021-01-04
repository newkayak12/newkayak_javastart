package chap07.sec07.exam05_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		//bus, taxi is inherited vehicle.  so they can be the parameter of drive method
	}

}
