package sec04.exam02_synchronized;

public class Usr1 extends Thread{

		private Calculator calculator;

		public void setCalculator(Calculator calculator) {
			this.setName("usr 1");
			this.calculator = calculator;
			
		}
		
		@Override
		public void run() {
			calculator.setMemory(100);
			
		}
		
//	얘는 100을 저장
	
}
