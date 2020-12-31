package varify.exam20;

import java.util.*;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
		private static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
		boolean run =true;
			while( run ) {
				System.out.println("---------------------------------------------------------------");
				System.out.println("1.create | 2.list | 3.deposit | 4. withdraw | 5.exit");
				System.out.println("---------------------------------------------------------------");
				System.out.println("select >");
				
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
					System.out.println("Process logged out");
			}
			
			//1 create account
			
			private static void createAccount( ) {
				String nm = scanner.nextLine();
				String an = scanner.nextLine();
				int bal = scanner.nextInt(0);
				Account ac = new Account();
				ac.setOwner(nm);
				ac.setAno(nm);
				ac.setBalance(bal);
			}
			
			//2 account list
			
			private static void accountList() {
				
			}
			
			//3 deposit
			
			private static void deposit() {
				
			}
			
			//4 withdraw
			
			private static void withdraw() {
				
			}
				
	
			
	}

}

