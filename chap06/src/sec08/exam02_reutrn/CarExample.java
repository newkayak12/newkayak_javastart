package sec08.exam02_reutrn;

public class CarExample {

	public static void main(String[] args) {

		Car cr = new Car();
		
		cr.setGas(5);
		boolean gasStation = cr.isLeftGas();
		if(gasStation) {
			System.out.println("출발합니다.");
			cr.run();
		}
		
		if(cr.isLeftGas()) {
			System.out.println("연료를 주입할 필요가 없습니다.");
		} else {
			System.out.println("연료를 주입하세요!!!");
		}
		
	}

}

