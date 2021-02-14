
package sec03.exam01_Sign;

public class SingOperatorExample {
public static void main(String[] args) {
	int x= -100;
	int result1 = +x;
	System.out.println(result1);
	
	int result2 = -x;
	System.out.println(result2);
	
	short s =100;
	//	short result3 = -s; ������ ����, ��ȣ �����ڰ� ������ ���Ⱚ�� int�� ������ ������
	int result3 =-s;
	System.out.println(result3);
	
 int result4 = ++s;
 System.out.println(result4);
 
 int x1 = -x;
 int sign1 = ++x1 +20; //(x1+1) +20
 int sign2 = x1++ +20; //(x1+20)+1
 System.out.println(sign1);
 System.out.println(sign2);
 
}
	
}
