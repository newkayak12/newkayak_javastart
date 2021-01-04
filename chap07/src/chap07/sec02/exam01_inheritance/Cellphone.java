package chap07.sec02.exam01_inheritance;

public class Cellphone {
	String model, color;
	
		void powerOn() { System.out.println("Turn on"); }
		void powerOff() { System.out.println("Turn off"); }
		void bell() { System.out.println( "bell ringing" ); }
		void sendVoice( String message ) { System.out.println("I" + message); }
		void receiveVoice ( String message ) { System.out.println("the other party" + message ); }
		void hangUp() { System.out.println("finishing call"); }


}

