package chap08.sec02.exam05_static_method;

public interface RemoteControl {
	 int MAX_VOLUME=10; //this is public static final
	 int MIN_VOLUME=0;
	 
	 void turnOn(); //public abstarct is omitted
	 void turnOff();
	 void setVolume(int volume);
	 
	 default void setMute( boolean mute ) { //you must write default . if you use default method. 'public' is automatically added by compiler
		 if( mute ) { 
			 System.out.println("MUTE");
		 } else {
			 System.out.println("UNMUTE");
		 }
	 }
	 
	 static void changeBattery() {
		 System.out.println("change battery");
	 }
}
