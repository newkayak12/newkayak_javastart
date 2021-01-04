package chap07.sec07.exam05_polymorphism;

public class Driver {
	public void drive( Vehicle vehicle ) { 
		//if any objects that inherited Vehicle is inserted drive's parameter, it can be work
			vehicle.run();
	}
}
