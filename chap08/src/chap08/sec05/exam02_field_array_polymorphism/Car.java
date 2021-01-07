package chap08.sec05.exam02_field_array_polymorphism;

public class Car {
	Tire_arr[] tires = {
			new HankookTire_arr(),
			new HankookTire_arr(),
			new HankookTire_arr(),
			new HankookTire_arr()
			
	};
	
	
public void run() {
		for( Tire_arr tire : tires ) {
			tire.roll();
		}
}
		
}
