package verifyExam;

public class _04_WhileDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*While���� Math.radom() �޼ҵ带 �̿��ؼ� �� ���� �ֻ����� ������ �� ������ ���� (x,y)���·� ����ϰ� ���� ���� 5�� �ƴϸ� ��� �ֻ����� ������
 ���� ���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ��غ�����*/
		
		// Math.random �� 0<= random <1
		// break �� do-while, while, for���� ��� ����
		int diceX=0; 
		int diceY=0; 
		
		while((int)diceX + (int)diceY != 5) {
			diceX = (int) (Math.random()*6)+1;
			diceY = (int) (Math.random()*6)+1;
			
			if((int)diceX + (int)diceY == 5) {
				System.out.println("�ֻ����� ���� ���� 5�� �Ǵ� ��� " +"(" +  diceX + "." +diceY +")");
				break;
			} else {
			System.out.println("�ֻ����� ���� ���� 5�� �ȵǴ� ��� " +"(" +  diceX + "." +diceY +")");}
		}
		System.out.println("(" + diceX + "." + diceY + ")");
	}

}
