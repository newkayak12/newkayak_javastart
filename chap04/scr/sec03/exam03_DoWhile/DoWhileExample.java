package sec03.exam03_DoWhile;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// do 아래를 일단 한 번 실행하고, while 조건따라서 do를 다시하냐 = Do-While문
		//While은 처음부터 조건이 맞냐 안맞냐로 실행을 하냐 안 하냐가 갈림
			// 실행문을 적어도 한번 실행하냐 안하냐로 do-while, while이 갈림
		/*
		 * System.out.println("메시지를 입력하세요");
		 * System.out.println("프로그램을 종료하라면 "+'\"'+"Q"+'\"'+ "를 입력하세요.");
		 * System.out.println();
		 * 
		 * int i =0;
		 * 
		 * do { System.out.println(i); i++;} while(i<=10); //do while에서 ';'를 뺴놓는 경우 많음
		 * 
		 * System.out.println(); System.out.println("프로그램을 종료합니다.");
		 */	
		
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하라면 "+'\"'+"Q"+'\"'+ "를 입력하세요.");
		
		
	java.util.Scanner scanner = new Scanner(System.in);  //system.in  키보드로부터 읽겠다. 라는 // scanner라는 객체를 만든다...
	//Scanner는 bye, char, short, int long, float, double같은 기본 타입이 아님
	//ctrl shift O(영어)를 눌러서  import com.sun.java_cup.internal.runtime.Scanner; 생성
	String inputString;
	
	do {
		System.out.print(">>");
		inputString=scanner.nextLine();
		System.out.println(inputString);
		
	} while(!inputString.equals("exit"));
	
	
	/* 이걸로 cmd같은거나 terminal 같은 거 만들수 있긴한건가?? 어렵겠네.. */
	
	
	//System.out.println(inputString); // I/O 입출력에서 나옴
	
	
	System.out.println(); System.out.println("프로그램을 종료합니다.");
	
	
	
	
	
	
	}
	}


