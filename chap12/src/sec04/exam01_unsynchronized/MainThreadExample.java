package sec04.exam01_unsynchronized;

public class MainThreadExample {

	public static void main(String[] args) {
		
		
		Calculator calc = new Calculator();
		
		Usr1 usr1 = new Usr1();
			usr1.setCalculator(calc);
			usr1.start();
		
		Usr2 usr2 = new Usr2();
			usr2.setCalculator(calc);
			usr2.start();
			
			
			//공유객체에 데이터 저장 시 반드시 그 값이 유지된다는 보장이 없네...
			
	}

}
