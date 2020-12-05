package sec03.exam02_casting;

public class CastingExample {
public static void main(String[] args) {

	int intValue=44032;
	char charValue= (char) intValue;
	System.out.println(charValue); //44032가 유니코드로 변환되는 식... 4byte가 2byte로 변환됨.
	
	long longValue=500;
	int intvalue2=(int)longValue; //대소문자 가리니까 조심해야겠다. 
	System.out.println(intvalue2);//500은 4바이트로도 그냥 표현 가능하니까 그대로 나오네
	
	double doubleValue=3.14;
	int intValue3=(int)doubleValue;
	System.out.println(intValue3);
	
	
	
	
	
}
	
}
