package sec07_get_exception_reason;

public class BalanceInsufficientException extends Exception {
//	 1. 일반예외로 할 것인가 / 런타임으로 할 것인가?
//		2. 생성자 (기본 + 메시지  )
	
	public BalanceInsufficientException() {
	}
	
	BalanceInsufficientException(String message) {
		super(message);
	}
}
