package sec08.exam01_method_declarartion;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
	
	/*
	 * Stack | Heap myCalc
	 *       | Calculator ��ü ����
	 *       |   �� powerOn() �޼ҵ� ȣ��
	 * 
	 */
	
		int result1 = myCalc.plus(10, 20);
		
		byte x =20, y=3;
			
		double result2 = myCalc.divide(x, y);
		
		double result3 = myCalc.mutiple(x,y);
		
		
		System.out.println("result1�� ���� : " + result1);
		System.out.println("result2�� ���� : " + result2);
		System.out.println("result3�� ���� : " + result3);
	}
}


