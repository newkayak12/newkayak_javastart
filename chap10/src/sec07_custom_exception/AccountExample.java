package sec07_custom_exception;

public class AccountExample {
	public static void main ( String [] args ) {
		
		Account account = new Account();
	
		
		account.deposit(10000);
		
		account.getBalance();
		
		try {
			account.withdraw(20000);
			System.out.println("예금액 " +account.getBalance());
		} catch (BalanceInsufficientException e) {
			System.out.println("예외발생");
		}
		
//		Unhandled exception type BalanceInsufficientException 에러 출력 됨
		
//		예외처리를 해야함 
	}
}
