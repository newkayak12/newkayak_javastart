package sec03.exam04_BitReverseOperator;

public class BitReverseOperatorExample {
public static void main(String[] args) {
	//~������ tilt��� �θ���.
    // byte, short, int, long Ÿ�Ը� �ǿ����ڰ� �� char, float, doulbe�� �Ұ���
	// �ֻ��� ��Ʈ�� ��ȣ ��Ʈ�� �����ǹǷ� ��ȣ�� �ݴ��� ������ ���ο� ���� �����
	// ������� ���� �⺻ Ÿ���� int�� ���� ��, byte v1 =10; , byte v2=~v1; �� ������ ����
	//												   int v2=~v1; �� ���� ���
	// 												 tilt �ϰ� +1�ϸ� ���� ������ ��ȣ�� �ٲ� ������ ���� ��. ����..? �׳� ��ȣ�� +,-�� �ٲ��ָ� �Ǵ°� �ƴ�?
	
	// 10������ 2������ ��ȯ? (������ 32��Ʈ ���� ���ڿ��� ����) 'Integer.toBianryString()'
	
	int v1= 10;
	int v2= ~10;
	int v3 = ~v1+1;
	System.out.println(v2);
	System.out.println(v3);
		System.out.println(toBinaryString(v1) + "(������:" +v1 +")");
		System.out.println(toBinaryString(v2) + "(������:" +v2 +")");
		System.out.println(toBinaryString(v3) + "(������:" +v3 +")");
		
		
	int v4 = -10;
	int v5 = ~v4;
	int v6 = ~v4+1;
	System.out.println(v5);
	System.out.println(v6);
	System.out.println(toBinaryString(v5) + "(������:" +v5 +")");
	System.out.println(toBinaryString(v6) + "(������:" +v6 +")");
	//��Ʈ������ ����Ѵ�? �ϵ���� ���� ������ ���� ��κ� �ñ��ѵ� �Ẹ�� ��Ǫ��.
	
}
//�޼ҵ�? : � ������ �ؼ� �� ������� �������ִ� ���α׷� ���?

	public static String toBinaryString(int value) {
		String str= Integer.toBinaryString(value);
		
		while(str.length()<32) {
			str = "0" +str;
			
		}
		
		return str;
	}
}
