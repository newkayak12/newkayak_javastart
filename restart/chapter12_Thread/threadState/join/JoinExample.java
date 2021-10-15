package threadState.join;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();


		try {
			sumThread.join();
			//sumTrhead가 종료할 때까지 메인 쓰레드를 일시 정지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("1~100합 :"+ sumThread.getSum());
	}
}
