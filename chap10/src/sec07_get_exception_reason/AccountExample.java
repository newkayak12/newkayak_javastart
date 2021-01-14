package sec07_get_exception_reason;

public class AccountExample {
	public static void main ( String [] args ) {
		
		Account account = new Account();
	
		
		account.deposit(10000);
		
		account.getBalance();
		
		try {
			account.withdraw(20000);
			System.out.println("예금액 " +account.getBalance());
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			System.out.println(e.toString());
			System.out.println();
			e.printStackTrace();
//			는 콘솔에 내역을 출력하는거라 완성단계에서는 뺴는게 맞음
//			printStack으로  (디버깅할 때 간단하게 확인하려고)
			
//			e.printStackTrace();
//			sec07_get_exception_reason.BalanceInsufficientException: 잔고 부족 10000모자람
//			at sec07_get_exception_reason.Account.withdraw(Account.java:41)
//			at sec07_get_exception_reason.AccountExample.main(AccountExample.java:14)
//			가 출력 되는거였구나
//			
			
			
//			e.toString(); 은 
//      sec07_get_exception_reason.BalanceInsufficientException: 잔고 부족 10000모자람
		}
		
//		Unhandled exception type BalanceInsufficientException 에러 출력 됨
		
//		예외처리를 해야함 
	}
}
