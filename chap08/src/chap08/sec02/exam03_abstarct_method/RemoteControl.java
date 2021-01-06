package chap08.sec02.exam03_abstarct_method;

public interface RemoteControl {
	 int MAX_VOLUME=10; //this is public static final
	 int MIN_VOLUME=0;
	 
	 void turnOn(); //public abstarct is omitted
	 void turnOff();
	 void setVolume(int volume);
}
