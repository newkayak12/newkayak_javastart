package sec03.exam04.Operation;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1=10;
		byte byteValue2=20;
		
		int bytevalueSum = byteValue1 + byteValue2;//byte�� �����ϰ� �� ���ϸ� ���� // �ڹ��� ���� ������ �⺻���� intŸ��
 System.out.println(bytevalueSum);
 
 char charValue1='A';
 char charValue2=1; //unicode 1 //���� 1�� '1', ���� 1�� �׳� 1  
 //// char charValue2='1'; �̷��� ���ϱ� ������ 114�� ������ ���� 1�����ڵ�� 49�ΰ���
 
 int charsum= charValue1 + charValue2; //int ���� ������ ������� int�� �����
 System.out.println("�����ڵ�=" + charsum);
 System.out.println("��¹���=" + (char) charsum);
 
 
 int intValue3 =10;
 int intValue4 = intValue3/4;
 System.out.println(intValue4);
 System.out.println((float)intValue4); //���� ������ ����Ǽ� ����� ����,
 
 /*float intValue5= (float)intValue3/4.0; //�ȵǳ�
 System.out.println(intValue5);*/
 double doubleValue= intValue3/4.0;
 System.out.println(doubleValue);
 

		
	}
}
