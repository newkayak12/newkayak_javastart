package beepExam;
import java.awt.Toolkit;
public class BeepPrintExample2 {
	
	public static void main(String[] args) { // 메인쓰레드 
		
		
// 01.  그냥 기본적으로 하면?

		// Runnable beep = new Beeptask();
		// Thread thread = new Thread(beep);
// 쓰레드 객체 따로 생성 파라미터로는 Runnable이 들어간다. 




////////////////////////////////////////////////////////////////////////////////
//02. Runnable 익명 구현 객체를 이용하면?

		// Thread thread = new Thread(new Runnable(){

		// 	@Override
		// 	public void run() {
		// 		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// 		for(int i = 0; i<5; i++){
		// 			toolkit.beep();
		// 			try {
		// 				Thread.sleep(500);
		// 			} catch (InterruptedException e) {
		// 				e.printStackTrace();
		// 			}
		// 		}
				
		// 	}
			
		// });

////////////////////////////////////////////////////////////////////////////////
//03. Runnable을 람다식으로 생성 

		Thread thread = new Thread(()->{
			Toolkit toolkit = Toolkit.getDefaultToolkit();

				for(int i = 0; i<5; i++){
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		});
		

		thread.start();  // 여기서 따로 쓰레드가 생성되면서 beep가 울린다. 


		// 동시에 비프라는 문자가 같이 찍힌다. 
		for(int i = 0; i<5; i++){
			System.out.println("beep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
