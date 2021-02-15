package sec04.exam02_synchronized;

public class Usr2 extends Thread{

		private Calculator calculator;

		public void setCalculator(Calculator calculator) {
			this.setName("usr 2");
			this.calculator = calculator;
			
		}
		
		@Override
		public void run() {
			calculator.setMemory(50);
			
		}
		
		
//	얘는 50이라는 값을 저장
}
