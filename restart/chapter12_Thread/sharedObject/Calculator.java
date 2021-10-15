public class Calculator {
	
	private int memory;


	public int getMemory() {
		return this.memory;
	}

	// public void setMemory(int memory) {
	// 	this.memory = memory;
	// 	try {
	// 		Thread.sleep(2000);
	// 	} catch (InterruptedException e) {
	// 		e.printStackTrace();
	// 	}

	// 	System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	// }
	

	// 메소드에 통으로 동기화를 걸면 오히려 성능에 방해가 될 수도 있다. 
	// public synchronized void setMemory(int memory) {
	// 	this.memory = memory;
	// 	try {
	// 		Thread.sleep(2000);
	// 	} catch (InterruptedException e) {
	// 		e.printStackTrace();
	// 	}

	// 	System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	// }



	public void setMemory(int memory) {
		//동기화 블록으로 (calculator를 잠그고 동기화 블록을 실행할 수도 있다.)
		synchronized(this){
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
