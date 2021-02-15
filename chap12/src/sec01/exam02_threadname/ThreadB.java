package sec01.exam02_threadname;

public class ThreadB extends Thread {
	public ThreadB() {
		setName("Thread_B");
	
	}
	
	@Override
	public void run() {

			for (int i =0; i<2; i++) {
				
					System.out.println(getName() + "가 출력한 내용");
					//현재 객체의 인스턴스 메소드 > 이름
			}
	
}
}
