package 확인문제;

import java.util.Scanner;


public class _07_WhileScanner {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
boolean run = true;
int balance=20000;
Scanner scanner = new Scanner(System.in);
String inputString;
int keyinput = 0;

rturn: do {
main: do {
	System.out.println("-------------------------------------------------");
	System.out.println("                     ATM 서비스            		 ");
	System.out.println("-------------------------------------------------");
	System.out.println("                  1.   입금                     　 ");
	System.out.println("                  2.   출금                     　 ");
	System.out.println("                  3. 통장 조회    			　 　　 ");
	System.out.println("                  4. 서비스 종료                 ");
	System.out.println("-------------------------------------------------");
	System.out.print(">");
	inputString = scanner.nextLine();
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	if(inputString.equals("1")) {
deposit: do {	
	System.out.println("-------------------------------------------------");		
	System.out.println();
	System.out.println();
	System.out.println("             입급 서비스를 실행합니다.");
	System.out.println("             얼마를 입금하시겠습니까?");
	System.out.println();
	System.out.println();
	System.out.println("                                     q: 메인 메뉴으로");
	System.out.println("-------------------------------------------------");
	System.out.print(">");
	inputString = scanner.nextLine();
	if(inputString.equals ("q")) { break main;
	} else {
	//입금	
	keyinput = Integer.parseInt(inputString);
		balance += (long) keyinput;
		System.out.println("-------------------------------------------------");	
		System.out.println("         "+keyinput + "원을 입금했습니다.");
		System.out.println("      현재 은행 잔고는 " + balance + "원 입니다.");
		System.out.println();
		System.out.println();
		System.out.println("           추가로 입금하시겠습니까? Y/N");
		System.out.println("-------------------------------------------------");	
		System.out.println(">");
		inputString = scanner.nextLine();
		if(inputString.equals("Y")||inputString.equals("y")) {
			continue deposit;
		}else if(inputString.equals("N")||inputString.equals("n")){ continue rturn;
   }
		}
	}  while(!inputString.equals("q"));
	continue main;
	//////////////////////////////////////////////////////////////////////
	} else if(inputString.equals("2")) {
withdraw :do {
	System.out.println("-------------------------------------------------");		
	System.out.println();
	System.out.println("             출금 서비스를 실행합니다.");
	System.out.println("              얼마를 출금하시겠습니까?");
	System.out.println();
	System.out.println("                                     q: 메인 메뉴으로");
	System.out.println("-------------------------------------------------");
	System.out.println(">");
	inputString = scanner.nextLine();
if(inputString.equals ("q")) { break main;
	} else {
	//출금	
		keyinput = Integer.parseInt(inputString);
		if((long)balance>=(long)keyinput) {
///////////////////////////////////////////////////////// 마이너스 통장뜸	
		balance -= (long) keyinput;
		System.out.println("-------------------------------------------------");	
		System.out.println("         "+keyinput + "원을 출금했습니다.");
		System.out.println("      현재 은행 잔고는 " + balance + "원 입니다.");
		System.out.println();
		System.out.println();
		
		System.out.println("           추가로 출금하시겠습니까? Y/N");
		System.out.println("-------------------------------------------------");	
		System.out.println(">");
		inputString = scanner.nextLine();
	
		if(inputString.equals("Y")||inputString.equals("y")) {
			continue withdraw;
		}else if(inputString.equals("N")||inputString.equals("n")){ continue rturn;
		  
		}
   }else {System.out.println("잔고가 부족합니다.");
   System.out.println("금액을 다시 입력해 주십시오");
	continue withdraw;
	}
		}
} while(!inputString.equals("q"));
	continue main;
	} else if(inputString.equals("3")) {
check: do {		
		System.out.println("-------------------------------------------------");		
		System.out.println();
		System.out.println("             잔고 조회 서비스를 실행합니다.");
		System.out.println("             현재 총 금액은  " + balance + "원 입니다.");
		System.out.println();
		System.out.println("                                     q: 메인 메뉴으로");
		System.out.println("-------------------------------------------------");
		inputString = scanner.nextLine();
} while(!inputString.equals("q"));
	continue main;
	}
}while (!inputString.equals("4"));
System.out.println("서비스를 종료합니다.");

} while (!inputString.equals("4"));
System.out.println("이용해주셔서 감사합니다.");
}
}
	//// 확인문제보고 삘받아서 만들었는데 I/O 입력 장치 쪽 모르니까 헷깔리네
// 조건, 반목문 다시 한 번 복습하고 딴거 또 만들어봐야겠다.