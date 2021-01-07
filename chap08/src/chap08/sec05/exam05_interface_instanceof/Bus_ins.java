package chap08.sec05.exam05_interface_instanceof;

public class Bus_ins implements Vehicle_ins{
			@Override
		public void run() {
				System.out.println( " bus is running");
}
		public void checkfare( ) {
			System.out.println("checking fare");
		}
}
