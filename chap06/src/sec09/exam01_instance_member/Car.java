package sec09.exam01_instance_member;

public class Car {
	 	String model;
	 	int speed;
	
	 Car(String model){
		 this.model = model;
	 }

	 void setSpeed(int speed) {
		 this.speed=speed;
	 }
	 
	 void run() {
		 for(int  i= 10 ; i<=50; i+=10) {
			this. setSpeed(i);
	// if you want to clarify the setSpeed is in the Car class,
	// add the 'this.' in front of setSpeed
			System.out.println(this.model + " is running ( speed : " +speed+ "km/h)" );
			
			
	// 'this.' can be added just in not static method	
		 }
	 }
}
