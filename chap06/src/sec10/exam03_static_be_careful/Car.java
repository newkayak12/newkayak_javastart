package sec10.exam03_static_be_careful;


public class Car {
	int speed;
	
		 void run() {
			System.out.println( " drive with " + speed + "km/h");
		
		}
		
	public static void main(String[] args) {

//		speed =60;
//		run();
// upper one is syntax error
		
		Car cr= new Car();
		cr.speed=60;
		cr.run();
	}

}