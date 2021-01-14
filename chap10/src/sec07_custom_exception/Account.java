package sec07_custom_exception;

public class Account {
//사용자 정의 예외 클래스 선언 경우	
// 자바 표준 api 에서 제공하지 않는 예외
// 애플리케이션 서비스와 관련된 예외
	
//	선언법은 class xxxxException으로 만들고 Exception 이나 RuntimeException을 상속
// 이건 일반 예외 클래스로 만들건지 실행 예외 클래스로 만들건지에 따라서 달라짐
	
//	그리고 기본 생성자 추가하고
//	 또, 생성자를 하나 더 만든다. 이는 예외가 왜 발생했는지 알려주기 위해서  String message 
//	그리고 그 안에 super(message)로 넘겨준다.
	
	
//	throw와 throws는 천지차이
	
//	throw는 예외 발생
	
//	throws는 떠넘기기
	
	
	
	
	private long balance;

	public Account() {
	}

	public long getBalance() {
	return balance;
	}
	
	public void deposit( int money ) {
		balance += money;
	}
	
	public void withdraw( int money ) throws BalanceInsufficientException {
//		잔고보다 더 많은 출금하려면 예외가 발생하지
		if (balance<money) {
			throw new BalanceInsufficientException();
//		
		}
		
		balance -= money;
	}
}
