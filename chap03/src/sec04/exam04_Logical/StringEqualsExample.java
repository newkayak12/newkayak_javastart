package sec04.exam04_Logical;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���ھ߱� ������ ���� �̰ɷ� ���°ǰ�? �ƴϸ� �� ���� ������ int�� �����ϰ� ���ؾ��ϴ°ǰ�? string ���� Ÿ�� string
		 * a="java"; string b="java";��� �ϸ� a,b �Ѵ� ���� java��ü�� �����ϰ� ���� ������ ���� ���ڿ� �񱳴�
		 * equals()�� ��� a.equals(b); �̷������� ���
		 * ==�� !=�� ���� �������� ���ĸ� �� �� ���
		 */
		String strVar1 = "�̽��϶� �����";
		String strVar2 = "�̽��϶� �����";
		String strVar3 = new String("�̽��϶� �����");
		
		System.out.println(strVar1 == strVar2);//������ ����?
		System.out.println(strVar1 == strVar3);//������ �ٸ���. (new�� ���������� �ٸ� ��ü)
		System.out.println('\t'); //���������  ���ڸ��ͷ��� ''�� ������ �ƿ�
		System.out.println();    //���� ����
		System.out.println(strVar1.equals(strVar2));//��ü�� '���ڿ��� ��'
		System.out.println(strVar1.equals(strVar3)); // ���ڿ��� ���ؼ� 18°�ٰ��� �ٸ� ����� ����.
		
	}

}
