package sec01.exam02_threadname;

public class ThreadNameExample {
	public static void main(String[] args) {
		
		//main의 thread 이름?
		
		Thread thread = Thread.currentThread();
//		static method currentThread();
		
		String name = thread.getName();
			System.out.println("this Thread  : " + name);  // main
			
			Thread threadA = new ThreadA();
//				System.out.println("ThreadA를 생성한 스레드 : " + Thread.currentThread().getName());
				System.out.println("작업 스레드 이름 :  "+  threadA.getName());
			threadA.start(); //메인이 실행을 시키면 여기서 thread a의 녀석이 하나 새로 생김
			
			/*	this Thread  : main
				Thread-2가 출력한 내용
				Thread-2가 출력한 내용 */

			
			Thread threadB = new ThreadB();
//				System.out.println("ThreadB를 생성한 스레드 : " + Thread.currentThread().getName());
			System.out.println("작업 스레드 이름 :  "+  threadB.getName());
			threadB.start();  // run 에 있는 코드를 실행한다는 거...
			
			
//			flow가 a다음 b 가 실행되게 되서 동시에 가지는 않겠네... 아마 a에서 쓰레드를 또 부르면 달라지지 않ㅇ르까??
			
//			쓰레드를 생성하고 나서 start를 호출하고 새로운 쓰레드가 run를 실행하고 나면 다시 Start를 할 수 없음... 딱 한 번만 사용이 가능하다.
//			결국 같은 내용을 또 쓰려면 쓰레드를 다시 한 번 생성을 해야한다.
			
//			즉, 위의 Start는 한 flow내에 두 번 이상 출력할 수 없다. 
			
			
			
	}
}
