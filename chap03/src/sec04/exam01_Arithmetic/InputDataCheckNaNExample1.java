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
	요런 에러가 뜨네 보아하니 jdk에 A가 숫자포맷 예외고, float이랑 double에서도 오류가 있고 마지막으로 내가 쓴 코드에서도 오류다 인데
	요걸로 보아하니 double 연산이 float이랑 연관이 있나봄 에러가 double만 나올거 같았는데 float도 같이 뜨는거보니?*/

String userInput="NaN";
 
double val= Double.valueOf(userInput);

double currentBalance = 10000.0;

if(Double.isNaN(val)){
	System.out.println("처리할 수 없음");
 val=0.0;//NaN이면 val 값을 0.0으로 수정하고 currentBalance 값에 지장이 없도록 처리

currentBalance = currentBalance+val;	
System.out.println(currentBalance);
	}

}}
