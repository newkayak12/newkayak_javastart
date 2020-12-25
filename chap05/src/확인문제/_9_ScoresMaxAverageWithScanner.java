package 확인문제;

import java.util.Scanner;

public class _9_ScoresMaxAverageWithScanner  {
public static void main(String args[]) {
	

	boolean run = true;
	int stuNum = 0;
	int[] scores=null;
	Scanner scanner = new Scanner(System.in);
	


	 while(run) {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                               학 생 성 적 관 리 체 계");
		System.out.println();
		System.out.println();
		System.out.println("  1. 학생 수 입력 |   2. 학생 점수 입력 |  3. 점수 리스트 |  4. 점수 분석 |  5. 종료");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
		System.out.print(">");
	
		int selectNo= scanner.nextInt();
          //////////////////////////////////////////////////////////////////////////////////////////////
		if(selectNo ==1 ) {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                               학 생 관 리 서 비 스");	
		System.out.println();
		System.out.println("                              학생의 수를 입력해주세요");
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.print(">");
		int keyinput;
		keyinput = scanner.nextInt();
		stuNum += keyinput;
				System.out.println("현재 학생의 수는 " + stuNum + "명 입니다.");
				scores = new int[stuNum];
		////////////////////////////////////////////////////////////////////////////////////////////////
		} else if(selectNo ==2) {
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("                               학 생 관 리 서 비 스");	
			System.out.println();
			System.out.println("                             학생의 점수를 입력해주세요");
			
			System.out.println("-------------------------------------------------------------------------");
			System.out.print("> ");
		int keyinput;
		for(int i=0; i<scores.length; i++) {
			System.out.print(" 학생 "+(i+1)+"의 성적 입력 :");
			keyinput =scanner.nextInt();
			scores[i] = keyinput;
		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		} else if(selectNo ==3) {
			
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("                               학 생 관 리 서 비 스");	
			
			System.out.println("                              학생들의 점수를 열람합니다. ");
			
			System.out.println("-------------------------------------------------------------------------");
			System.out.print("> ");
			for(int i=0; i<scores.length; i++) {
				System.out.println(i+1 +"번째 학생의 점수 " + scores[i]);	
			}
   /////////////////////////////////////////////////////////////////////////////////////////////////////		
		} else if(selectNo ==4) {
			
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("                               학 생 관 리 서 비 스");	
			System.out.println();
			System.out.println("                         학생들의 점수의 총합과 평균을 열람합니다. ");
			
			System.out.println("-------------------------------------------------------------------------");
			System.out.print("> ");
			int sum=0;
			double avg = 0.0;
			int max=0;
			for(int score : scores) {
				
				sum += score;
				avg = (double)sum / scores.length;
				if(max<score) {
					max = score;
				}
			}
			System.out.println("학생들 중 최고 점수는 " + max +"점입니다.");
			System.out.println("학생들의 점수의 총점은 " + sum+ "점입니다." );
			System.out.println("학생들의 점수의 평균은 " +  avg + "점입니다.");
			/////////////////////////////////////////////////////////////////////
		} else if(selectNo ==5) {
			run = false;
			
		}
	}

	System.out.println("프로그램을 종료합니다.");
}
}