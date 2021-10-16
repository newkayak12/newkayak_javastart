package daemonThread;

public class AutoSaveThread extends Thread{
	//주 쓰레드의 작업을 돕는 보조적인 역할을 한다.

	public void save(){
		System.out.println("작업 내용을 저장했습니다.");
	}
	
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				break;
			}

			save();
		}
	}
}
