package daemonThread;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		// run // start 차이?
		/*
			run은 단순히 생성된 쓰레드를 실행하는 것이 아니라 클래스에 선언된 메소드를 호출하는 것일 뿐
			start는 새로운 쓰레드를 생성하고 쓰레드가 작업하는데 사용될 호출 스택을 생성한다. 
		*/


		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		System.out.println("메인 쓰레드 종료");
	}
}
