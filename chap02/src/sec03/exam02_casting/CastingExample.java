package sec03.exam02_casting;

public class CastingExample {
public static void main(String[] args) {

	int intValue=44032;
	char charValue= (char) intValue;
	System.out.println(charValue); //44032�� �����ڵ�� ��ȯ�Ǵ� ��... 4byte�� 2byte�� ��ȯ��.
	
	long longValue=500;
	int intvalue2=(int)longValue; //��ҹ��� �����ϱ� �����ؾ߰ڴ�. 
	System.out.println(intvalue2);//500�� 4����Ʈ�ε� �׳� ǥ�� �����ϴϱ� �״�� ������
	
	double doubleValue=3.14;
	int intValue3=(int)doubleValue;
	System.out.println(intValue3);
	
	
	
	
	
}
	
}
