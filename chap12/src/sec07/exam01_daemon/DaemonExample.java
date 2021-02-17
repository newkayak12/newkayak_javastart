package sec07.exam01_daemon;

public class DaemonExample {

	public static void main(String[] args) {
		
			AutoSaveThread ast = new AutoSaveThread();
			
			ast.setDaemon(true);
			ast.start();
			
			
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				System.out.println("메인 스레드 종료");
				
	}

}
