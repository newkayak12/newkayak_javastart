package sec08.exam02_reutrn;

public class CarExample {

	public static void main(String[] args) {

		Car cr = new Car();
		
		cr.setGas(5);
		boolean gasStation = cr.isLeftGas();
		if(gasStation) {
			System.out.println("����մϴ�.");
			cr.run();
		}
		
		if(cr.isLeftGas()) {
			System.out.println("���Ḧ ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("���Ḧ �����ϼ���!!!");
		}
		
	}

}

