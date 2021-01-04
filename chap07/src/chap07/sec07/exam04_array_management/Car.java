package chap07.sec07.exam04_array_management;

public class Car {
	Tire [] tires = {
			new Tire("frontLeft",6),
			new Tire("frontRight", 2),
			new Tire("backLeft",3),
			new Tire("backRight",4)
	};
	
	 
	 int run () {
		 System.out.println("There is a car running");
		for ( int i = 0; i<tires.length; i++ )
		{
			if ( tires[i].roll()==false ) {
				stop();
				return i+1;
			}
		}
		return 0;
	 }
	 
	 void stop() {
		 System.out.println("The car stops");
	}

	

}
