package sec09.exam01_instance_member;

public class CarExample {

	public static void main(String[] args) {

		Car myCr =  new Car("RangeLover");
		Car yourCr = new Car("Mclaren");
// Two objects has been made from Car class		
		myCr.run();
		yourCr.run();
		
// Instance member is located in each objects
	}

}
