package varify.exam19;

public class Account {

	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	int getBalance( ) { 
		return balance;
	}
	
	int setBalance(int num) { 
		if(num < MIN_BALANCE ||  num > MAX_BALANCE) {
			//Account.MIN_BALANCE, Account.MAX_BALANCE??
			return balance;
			
		} else {
			balance += num;
			return balance;
		}
	}
}
