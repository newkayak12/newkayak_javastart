package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {
		
			Car cr= new Car();
			
				System.out.println(cr.getSpeed());			
				System.out.println(cr.isStop());
	
				cr.setSpeed(20);
				cr.setStop(true);
				
				System.out.println("-------------");
				System.out.println(cr.getSpeed());			
				System.out.println(cr.isStop());
				
				System.out.println("-------------");
				cr.setSpeed(-20);
				System.out.println(cr.getSpeed());			
	}

}
