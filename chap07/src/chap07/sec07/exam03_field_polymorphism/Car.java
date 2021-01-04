package chap07.sec07.exam03_field_polymorphism;

public class Car {
	 Tire fLT = new Tire("frontLeft",6);
	 Tire fRT = new Tire("frontRight", 2);
	 Tire bLT = new Tire("backLeft",3);
	 Tire bRT = new Tire("backRight",4);
	 
	 int run () {
		 System.out.println("There is a car running");
		 if( fLT.roll()==false) {
			 stop();
			 return 1;
		 }
		 if( fRT.roll()==false ) {
			 stop();
			 return 2;
		 }
		 if ( bLT.roll()==false ) {
			 stop();
			 return 3;
		 }
		 if( bRT.roll()==false ) { 
			 stop();
			 return 4;
		 }
		 return 0;
	 }
			 
	 void stop() {
		 System.out.println("The car stops");
	}

	

}
