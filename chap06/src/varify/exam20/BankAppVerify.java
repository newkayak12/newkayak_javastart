package varify.exam20;
	import java.util.*;
public class BankAppVerify {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		boolean run =true;
			while( run ) {
				System.out.println("---------------------------------------------------------------");
				System.out.println();
				System.out.println("                    Bank Service");
				System.out.println();
				System.out.println("---------------------------------------------------------------");
				System.out.println("1.create | 2.list | 3.deposit | 4. withdraw | 5.exit");
				System.out.println("---------------------------------------------------------------");
				System.out.print("select >");
				
			int selectNo = scanner.nextInt();
				
				if( selectNo ==1 ) {
					createAccount();
				} else if ( selectNo ==2)  {
					accountList();
				} else if ( selectNo ==3 ) {
					deposit();
				} else if ( selectNo ==4 ) {
					withdraw();
				} else if( selectNo ==5 ) {
					run = false;
				}
					
			}
			System.out.println("Process logged out");}


	private static void withdraw() {
		System.out.print("account number : ");		
		String ano = scanner.next();
		System.out.print("amount : ");
		int money = scanner.nextInt();

		Account account = findAccount(ano);
		if( account == null ) {
			System.out.println("Wrong Account Number");
			return;
		} else {
			account.setBalance(account.getBalance() - money);
			System.out.println( "deposit success");
		}
	}


	private static void deposit() {
System.out.print("account number : ");		
String ano = scanner.next();
System.out.print("amount : ");
int money = scanner.nextInt();

Account account = findAccount(ano);
if( account == null ) {
	System.out.println("Wrong Account Number");
	return;
} else {
	account.setBalance(account.getBalance() + money);
	System.out.println( "deposit success");
}

	}
	
	


	private static Account findAccount(String ano) {
Account account= null;
	for( int i=0; i<accountArray.length; i++ ) { 
		if( accountArray[i] != null ) {
			String dbAno=accountArray[i].getAno();
				if( dbAno.equals(ano)) { 
					account = accountArray[i];
					break;
				}
		}
	}
	return account;
	}


	private static void accountList() {
		System.out.println("==============");
		System.out.println("account list");
		System.out.println("==============");
		for( int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
				if(account != null) {
					System.out.println(account.getAno());
					System.out.println(account.getOwner());
					System.out.println(account.getBalance());
					System.out.println();
					
				}
		}
	}


	private static void createAccount() {
		System.out.println("==============");
		System.out.println("create account");
		System.out.println("==============");
		
		System.out.print("account num : ");
		String ano = scanner.next();
		System.out.print("account owner : ");
		String ownr = scanner.next();
		System.out.print("first deposit : ");
		int balance= scanner.nextInt();
		
		Account newAccount = new Account(ano,ownr,balance);
		//배열의 빈 곳을 찾아서 저장 
		
			for( int i=0; i<accountArray.length; i++) {
				if( accountArray[i] == null ) {
					accountArray[i] = newAccount;
					System.out.println("result : account creation has been done");
					break;
				}
	}

	}

}
