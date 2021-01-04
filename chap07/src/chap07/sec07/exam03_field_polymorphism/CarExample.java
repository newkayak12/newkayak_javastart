package chap07.sec07.exam03_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for( int i =1; i<=9; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1 :
				System.out.println();
				System.out.println("Change FrontLeft Tire to Hankook Tire");
				car.fLT = new HankookTire("frontLeft", 15);
				break;
			case 2 :
				System.out.println();
				System.out.println("Change FrontRight Tire to Kumho Tire");
				car.fRT = new KumhoTire("frontLeft", 13);
				break;
			case 3 :
				System.out.println();
				System.out.println("Change BackLeft Tire to Hankook Tire");
				car.bLT = new HankookTire("frontLeft", 14);
				break;
			case 4 :
				System.out.println();
				System.out.println("Change BackRight Tire to Kumho Tire");
				car.bRT = new KumhoTire("frontLeft", 16);
				break;
			}
			System.out.println("-------------------------------------------------------------");
		}
	}

}
