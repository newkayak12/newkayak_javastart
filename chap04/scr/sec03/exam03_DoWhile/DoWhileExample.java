package sec03.exam03_DoWhile;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// do �Ʒ��� �ϴ� �� �� �����ϰ�, while ���ǵ��� do�� �ٽ��ϳ� = Do-While��
		//While�� ó������ ������ �³� �ȸ³ķ� ������ �ϳ� �� �ϳİ� ����
			// ���๮�� ��� �ѹ� �����ϳ� ���ϳķ� do-while, while�� ����
		/*
		 * System.out.println("�޽����� �Է��ϼ���");
		 * System.out.println("���α׷��� �����϶�� "+'\"'+"Q"+'\"'+ "�� �Է��ϼ���.");
		 * System.out.println();
		 * 
		 * int i =0;
		 * 
		 * do { System.out.println(i); i++;} while(i<=10); //do while���� ';'�� ������ ��� ����
		 * 
		 * System.out.println(); System.out.println("���α׷��� �����մϴ�.");
		 */	
		
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����϶�� "+'\"'+"Q"+'\"'+ "�� �Է��ϼ���.");
		
		
	java.util.Scanner scanner = new Scanner(System.in);  //system.in  Ű����κ��� �аڴ�. ��� // scanner��� ��ü�� �����...
	//Scanner�� bye, char, short, int long, float, double���� �⺻ Ÿ���� �ƴ�
	//ctrl shift O(����)�� ������  import com.sun.java_cup.internal.runtime.Scanner; ����
	String inputString;
	
	do {
		System.out.print(">>");
		inputString=scanner.nextLine();
		System.out.println(inputString);
		
	} while(!inputString.equals("exit"));
	
	
	/* �̰ɷ� cmd�����ų� terminal ���� �� ����� �ֱ��Ѱǰ�?? ��ưڳ�.. */
	
	
	//System.out.println(inputString); // I/O ����¿��� ����
	
	
	System.out.println(); System.out.println("���α׷��� �����մϴ�.");
	
	
	
	
	
	
	}
	}


