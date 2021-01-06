package chap08.sec03.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc; // interface can't create object
		rc= new Audio();
		rc.turnOn();
		rc.turnOff();
		System.out.println( "-------" );
		rc= new Television();
		
		rc.turnOn();
		rc.turnOff();
	}

}
