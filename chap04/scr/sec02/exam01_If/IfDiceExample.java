package sec02.exam01_If;

public class IfDiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int num =5;

		int num = (int) (Math.random()*6) +1;  //Math��� Ŭ���� �Ʒ��� �ִ� random 0.0<= Math.random <1.0�� �Ǽ��� ����
		/*
		 * 0<= Math.random <6 ���⿡ int�� ���� Ÿ�Ժ�ȯ
 �׷��� ���� 0~5���� �ִ� Math.random�� �� �ű⿡ +1 �ؼ�
		 * 1~6 ������ ���� �������
		 */
		
if(num ==1) {
	System.out.println("1���� ���Խ��ϴ�.");
} else if(num==2) {
	System.out.println("2���� ���Խ��ϴ�.");
} else if(num==3) {
	System.out.println("3���� ���Խ��ϴ�.");
} else if(num==4) {
	System.out.println("4���� ���Խ��ϴ�.");
} else if(num==5) {
	System.out.println("5���� ���Խ��ϴ�.");
} else {
	System.out.println("6���� ���Խ��ϴ�.");
}

}
}