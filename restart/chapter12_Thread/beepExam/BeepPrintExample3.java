package beepExam;
public class BeepPrintExample3 {
	

	public static void main(String[] args) {
		
		Thread thread = new BeepThread();

		thread.start();

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
