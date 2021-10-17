package sharedObject;
public class User1 extends Thread{
	
	private Calculator calc;


	public Calculator getCalc() {
		return this.calc;
	}

	public void setCalc(Calculator calc) {
		this.setName("thread1");
		this.calc = calc;
	}

	public void run(){
		calc.setMemory(100);
	}

}
