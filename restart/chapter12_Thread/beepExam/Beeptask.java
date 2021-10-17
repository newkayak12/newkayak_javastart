package beepExam;

import java.awt.Toolkit;

public class Beeptask implements Runnable{
	// 하위 클래스에서 Runnable을 구현해서 쓰레드에 들어갈 작업을 정의한다. 

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for(int i = 0; i<5; i++){
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
