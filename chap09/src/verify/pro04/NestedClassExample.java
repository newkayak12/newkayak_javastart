package verify.pro04;

public class NestedClassExample {

	public static void main(String[] args) {
		Car mcar = new Car();
		
		Car.Tire tire = mcar.new Tire();
		
		Car.Engine engine = new Car.Engine();
	}

}
