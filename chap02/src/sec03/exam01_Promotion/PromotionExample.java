package sec03.exam01_Promotion;


public class PromotionExample {
	
	 	public static void main(String[] args) {
	int intV1=200;
	double doublev= intV1;
	
	char charval = 'A';
	int intVal2=charval;

	//����
	byte bytev=65;
	// char charv=bytev; //�ȵ�
	char charv2=(char) bytev;
	
	System.out.println(bytev);
	System.out.println(intVal2); //The method Println(int) is undefined for the type PrintStream ������ ����? �ٵ� ctrl+space�� int����Ʈ�� �����ϴϱ� �߱��ϳ�?
	System.out.println(charv2); //"
	
	int inttest= 65;
	char chartest= (char)inttest;
	System.out.println("int�� char��" + '\t'+"=" + chartest);
	
	//���ǳ���
	
	byte byteValue =10;
	int intValue=byteValue; //1����Ʈ�� 4����Ʈ�� ��ȯ
	System.out.println(intValue);
	
	char charValue='��';
	int intValue2= charValue; //�����ڵ� �� ���� _ �̰ɷ� ���� �����ڵ� �̾Ƴ��°� ����� �� ���� ��������?
	System.out.println(intValue2);
	
	int intValue3=500;
	long longValue=intValue3; // 4 to 8

	System.out.println(longValue); 
	
	int intValue4 = 200;
	double doubleValue = intValue4;
	System.out.println(doubleValue); //4 to 8(�Ǽ�)
	
	long longvalue2 =100000000000L;
	float floatValue=longvalue2;
	System.out.println(floatValue); //long(8) to 4(float) �ε��Ҽ��� ������� ǥ��, ������ ������ ����Ǳ� ������ �� ȿ�������� ���� ���� ǥ�� �� �� ����
	

	 		int intv123=128;
	 		byte bytev123= (byte) intv123; 
	 		System.out.println(bytev123); //129 byte ���� -128~127�� �Ѿ��(0�� ����� ���ԵǼ� 128�� �ƴϴ�.) -128�� ǥ���� > ������ ��ȯ�ϸ� ���� �޶��� �� ������ ���� �����ϸ鼭 �����ؾ��Ѵ�. �׷� ����.. �ٲ��ʿ�����?
	 									// ���� ������ �ٲ���ϴµ� �̷� �������� �ٲ� �� �ִ� �ٸ� ����� ����? ���� �� ������?
	 									// ���� ���ӿ��� ��� ���� �̻����� ���̳� ���׷��̵尡 �Ѿ�� ���ڱ� ���̳ʽ��� 0���� �Ǵ� ������ �� ����. 
	 		
	 		
	 		/* 4����Ʈ�� |����������������|����������������|����������������|����������������| �̷����ε� �̰� 1����Ʈ�� ������ ���� ������ �� �� |����������������|�� ��� 1����Ʈ �������� ���� */
	 		
	 		double doubletye=3.14;
	 		int intel =(int) doubletye;
	 		System.out.println(intel);
	 		
	 		
	 		/*  ���� ����ڰ� int i= '?'; '?'�� �ش��ϴ� ���� �־���ϰ�
	 		 * byte b =(byte) i;��� ���� ������ �޶��� �� ����
	 		 * �׷��� �� ���̿� �˻��ϴ� �ܰ踦 ����ִ´ٰ� �� */
	 		
	       /*if((i<Byte.MIN_VALUE) || (i>Byte.MAX.VALUE) {
	        * System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
	        * System.out.println("���� �ٽ� Ȯ�����ּ���.");
	        * } else{
	        * byte b = (byte)i;
	        * System.out.println(b);
	        * 
	        * �̷��� �� �� ���� if ������ ����Ʈ �ּ�&�ִ밪 ����� ����ؼ� �˻��ϰ� �� ���̸� else�� ����
	        
	        *���� ���ͳ� Ȩ�������� ���ڸ� ����ϴ� ���� �Ǽ��� �ٸ� ���� ���� ���̵Ǵ��� �̰ɷ� ������ �� ������ ����?
	        */
	 		 
	 		
	 		
	 	}


}