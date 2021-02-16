package sec06.exam03_join;

public class JoinExample {
// thread B 가 계산 작업을 하고 Thread A 가 그걸 받아서 쓰는 겨웅 join으로 block을 하는 경우가 있음
	public static void main(String[] args) {
		SumThread st = new SumThread();
		st.start();
		
		try {
			st.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		join이 없으면 그냥 초기화 되서 0이 나올 때도 있고 5050이 나올 때도 있고 마음대로임 
//		main 쓰레드가 언제 도는지에 따라 달라지는 상황이 발생함
		System.out.println("1~10까지의 합 : " + st.getSum());
		
		
	}	
}
