package chap08.sec05.exam05_interface_instanceof;

public class DriveExample_ins {

	public static void main(String[] args) {

			Driver_ins driver = new Driver_ins();
			
			Bus_ins bus = new Bus_ins();
			Taxi_ins taxi = new Taxi_ins();
			
			driver.drive(bus);
			driver.drive(taxi);
				
//			instaceof로 구현객체를 조사해서 강제 타입변환하고 메소드도 추가하는 등 급나누기?
				
	}

}
