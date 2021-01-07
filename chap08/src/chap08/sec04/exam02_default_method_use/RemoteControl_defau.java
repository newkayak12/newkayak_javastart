package chap08.sec04.exam02_default_method_use;

public interface RemoteControl_defau {
	 int MAX_VOLUME=10; //this is public static final
	 int MIN_VOLUME=0;
	 
	 void turnOn(); //public abstract is omitted
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
