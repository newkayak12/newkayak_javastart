package chap08.sec05.exam05_interface_instanceof;

public class DriveExample_ins {

	public static void main(String[] args) {

			Driver_ins driver = new Driver_ins();
			
			Bus_ins bus = new Bus_ins();
			Taxi_ins taxi = new Taxi_ins();
			
			driver.drive(bus);
			driver.drive(taxi);
				
//			instaceof�� ������ü�� �����ؼ� ���� Ÿ�Ժ�ȯ�ϰ� �޼ҵ嵵 �߰��ϴ� �� �޳�����?
				
	}

}
