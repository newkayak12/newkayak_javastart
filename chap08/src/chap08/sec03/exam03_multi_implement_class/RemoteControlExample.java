
package chap08.sec03.exam03_multi_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		SmartTelevision smt = new SmartTelevision();
		
			RemoteControl rc = smt;
			rc.turnOn();
			rc.setVolume(5);
			rc.turnOff();
			Searchable searchable = smt;
			searchable.search("google.com");
	}

}
