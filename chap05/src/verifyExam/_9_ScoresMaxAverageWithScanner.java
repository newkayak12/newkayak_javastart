package verifyExam;

import java.util.Scanner;

public class _9_ScoresMaxAverageWithScanner  {
public static void main(String args[]) {
	

	boolean run = true;
	int stuNum = 0;
	int[] scores=null;
	Scanner scanner = new Scanner(System.in);
	


	 while(run) {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                               �� �� �� �� �� �� ü ��");
		System.out.println();
		System.out.println();
		System.out.println("  1. �л� �� �Է� |   2. �л� ���� �Է� |  3. ���� ����Ʈ |  4. ���� �м� |  5. ����");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
		System.out.print(">");
	
		int selectNo= scanner.nextInt();
          //////////////////////////////////////////////////////////////////////////////////////////////
		if(selectNo ==1 ) {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                               �� �� �� �� �� �� ��");	
		System.out.println();
		System.out.println("                              �л��� ���� �Է����ּ���");
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.print(">");
		int keyinput;
		keyinput = scanner.nextInt();
		stuNum += keyinput;
				System.out.println("���� �л��� ���� " + stuNum + "�� �Դϴ�.");
				scores = new int[stuNum];
		////////////////////////////////////////////////////////////////////////////////////////////////
		} else if(selectNo ==2) {
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("                               �� �� �� �� �� �� ��");	
			System.out.println();
			System.out.println("                             �л��� ������ �Է����ּ���");
			
			System.out.println("-------------------------------------------------------------------------");
			System.out.print("> ");
		int keyinput;
		for(int i=0; i<scores.length; i++) {
			System.out.print(" �л� "+(i+1)+"�� ���� �Է� :");
			keyinput =scanner.nextInt();
			scores[i] = keyinput;
		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		} else if(selectNo ==3) {
			
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("                               �� �� �� �� �� �� ��");	
			System.out.println();
			System.out.println("                              �л����� ������ �����մϴ�. ");
			
			System.out.println("-------------------------------------------------------------------------");
			System.out.print("> ");
			for(int i=0; i<scores.length; i++) {
				System.out.println(i+1 +"��° �л��� ���� " + scores[i]);	
			}
   /////////////////////////////////////////////////////////////////////////////////////////////////////		
		} else if(selectNo ==4) {
			
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("                               �� �� �� �� �� �� ��");	
			System.out.println();
			System.out.println("                         �л����� ������ ���հ� ����� �����մϴ�. ");
			
			System.out.println("-------------------------------------------------------------------------");
			System.out.print("> ");
			int sum=0;
			double avg = 0.0;
			for(int score : scores) {
				
				sum += score;
				
				
				avg = (double)sum / scores.length;
				
				
			}System.out.println("�л����� ������ ������ " + sum+ "���Դϴ�." );
			System.out.println("�л����� ������ ����� " +  avg + "���Դϴ�.");
		} else if(selectNo ==5) {
			run = false;
			
		}
	}

	System.out.println("���α׷��� �����մϴ�.");
}
}