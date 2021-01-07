package chap08.sec05.exam05_interface_instanceof;

public class Driver_ins {
	public void drive(Vehicle_ins vehicle ) {
		if( vehicle instanceof Bus_ins ) {
			Bus_ins bus = (Bus_ins) vehicle;
			bus.checkfare();
			
		}
		//(vehicle) = {vehicle} 
		vehicle.run();
	}
}
