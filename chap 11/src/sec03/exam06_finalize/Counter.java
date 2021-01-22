package sec03.exam06_finalize;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no=no;
		
	}
	
//	object에 있는 finalize는 아무 의미가 없다.
//	그래서 오버라이드
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 finalize()가 실행 됨");
		
	}
}
