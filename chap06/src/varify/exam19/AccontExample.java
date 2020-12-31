package varify.exam19;

public class AccontExample {

	public static void main(String[] args) {

		Account acnt= new Account ();
	 
			
			acnt.setBalance(10000);
			System.out.println("balance : " + acnt.getBalance());
			
			acnt.setBalance(-100);
			System.out.println("balance : " + acnt.getBalance());
			
			acnt.setBalance(2000000);
			System.out.println("balance : "+ acnt.getBalance());
			
			acnt.setBalance(300000);
			System.out.println("balance : "+ acnt.getBalance());
	}

}
