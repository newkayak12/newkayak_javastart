package sec04.exam01_Arithmetic;

public class InputDataCheckNaNExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*double S1=Double.valueOf("3.5");
double S2=Double.valueOf("A");

System.out.println(S1);
System.out.println(S2);


    Exception in thread "main" java.lang.NumberFormatException: For input string: "A"
	at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
	at java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
	at java.base/java.lang.Double.parseDouble(Double.java:549)
	at java.base/java.lang.Double.valueOf(Double.java:512)
	at sec04.exam02_Accuracy.InputDataCheckNaNExample1.main(InputDataCheckNaNExample1.java:8)
	�䷱ ������ �߳� �����ϴ� jdk�� A�� �������� ���ܰ�, float�̶� double������ ������ �ְ� ���������� ���� �� �ڵ忡���� ������ �ε�
	��ɷ� �����ϴ� double ������ float�̶� ������ �ֳ��� ������ double�� ���ð� ���Ҵµ� float�� ���� �ߴ°ź���?*/

String userInput="NaN";
 
double val= Double.valueOf(userInput);

double currentBalance = 10000.0;

if(Double.isNaN(val)){
	System.out.println("ó���� �� ����");
 val=0.0;//NaN�̸� val ���� 0.0���� �����ϰ� currentBalance ���� ������ ������ ó��

currentBalance = currentBalance+val;	
System.out.println(currentBalance);
	}

}}
