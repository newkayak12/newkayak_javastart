package beepExam;
import java.awt.Toolkit;

public class BeepThread extends Thread{
	// Thread 객체를 상속 받아서 쓰레드와 작업을 함께 정의한다. (Thread의 하위 클래스로 작업 스레드를 정의 )
	
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
