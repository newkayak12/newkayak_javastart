package threadState.yield;

public class YieldExample {
	public static void main(String[] args) {
		YieldA threadA = new YieldA();
		YieldB threadB = new YieldB();

		threadA.start();
		threadB.start();

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("B만 실행");
		threadA.work=false;
		//B만 실행

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("A,B 실행");
		threadA.work = true;

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("둘 다 종료");
		threadB.stop = true;
		threadA.stop = true;
	}
}
