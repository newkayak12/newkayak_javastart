package beepExam;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for(int i = 0; i<5; i++){
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		for(int i = 0; i<5; i++){
			System.out.println("beep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/*
		작업이 따로 논다. > 메인 쓰레드만 돌려서 순차적으로 진행되기 떄문에 
	*/


	
}
