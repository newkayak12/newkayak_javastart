package sec08.exam03_method_call;

public class CarExample {

	public static void main(String[] args) {

	Car cr = new Car();  //��ü �ܺο��� �޼ҵ带 ȣ���Ϸ��� �����ڷ� ��ü�� ȣ���ϰ�, �޼ҵ带 ȣ���ؾ߸� ��
	
		cr.keyTurnOn();
		cr.run();
		
		int speed = cr.getSpeed();
		
			System.out.println("���� �ӵ� : " +speed+ "km/h");
	
			
	
	}

}
// �ڵ带 �ۼ��ϴ� ������ ���� ������ ���� ��� ������ �� �ѹ� ������ �����ϰ� 
// �޼ҵ�� ���� �ι�
//
// �� �̷���