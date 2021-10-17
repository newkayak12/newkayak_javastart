package sharedObject;
public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		User1 user1 = new User1();
		user1.setCalc(calc);
		user1.start();

		User2 user2 = new User2();
		user2.setCalc(calc);
		user2.start();

// 		thread2 : 200
// 		thread1 : 200
//		쓰레드에 의해서 공유 객체 손상  (synchronized 안 붙였을 때 )

		
		// thread1 : 100
		// thread2 : 200
		// synchronized를 붙이면 공유 객체 문제가 없다. 
	}
}
