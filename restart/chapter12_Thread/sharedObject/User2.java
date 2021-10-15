public class User2 extends Thread{
	
	private Calculator calc;


	public Calculator getCalc() {
		return this.calc;
	}

	public void setCalc(Calculator calc) {
		this.setName("thread2");
		this.calc = calc;
	}

	public void run(){
		calc.setMemory(200);
	}

}
