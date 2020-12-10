package sec04.exam05_Bit;

public class BitLogicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*�ǿ����� boolean �̸� (�Ϲ� �� ����)
�ǿ����� ���� Ÿ���̸� (��Ʈ�� ����) _ bye, short, charŸ���� int�� �����ؼ� ������
true & false = false
6 % 3

> eg 
45_ 0 0 1 0 1 1 0 1 //    0 0 1 0 1 1 0 1
         &			//           |
25_ 0 0 0 1 1 0 0 1 //    0 0 0 1 1 0 0 1
09_ 0 0 0 0 1 0 0 1 //61_ 0 0 1 1 1 1 0 1 

�̷������� ��Ʈ���� �� ��, ���� ����

Q �̰� �ؼ� ���ٰ� ������ �ñ��մϴ�.  ?? ��ȣȭ??�ϴµ� ���°ɱ�?
*/		
		System.out.println("45&25=" + (45&25));
		System.out.println("45|25=" + (45|25));
		System.out.println("45^25=" + (45^25));
		System.out.println("~45 = " + (~45));
		
		System.out.println(toBinaryString(45));
		System.out.println("&");
		System.out.println(toBinaryString(25));
		System.out.println("||");
		System.out.println(toBinaryString(45&25));
	}

	public static String toBinaryString(int value)	{
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str="0"+str;
		}
		return str;
	}
}
