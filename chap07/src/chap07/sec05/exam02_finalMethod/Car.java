package chap07.sec05.exam02_finalMethod;

public class Car {
	public int speed;
	
		public void speedUp() { 
			speed +=1;
		}
		
		public final void stop() { 
			System.out.println("car has been stopped");
			speed = 0;
		}
}
