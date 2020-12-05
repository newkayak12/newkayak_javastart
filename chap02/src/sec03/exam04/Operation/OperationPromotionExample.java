package sec03.exam04.Operation;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1=10;
		byte byteValue2=20;
		
		int bytevalueSum = byteValue1 + byteValue2;//byte로 선언하고 둘 합하면 에러 // 자바의 정수 연산은 기본으로 int타입
 System.out.println(bytevalueSum);
 
 char charValue1='A';
 char charValue2=1; //unicode 1 //문자 1은 '1', 숫자 1은 그냥 1  
 //// char charValue2='1'; 이렇게 쓰니까 산출이 114가 나오지 숫자 1유니코드는 49인가봄
 
 int charsum= charValue1 + charValue2; //int 이하 정수는 결과값이 int로 연산됨
 System.out.println("유니코드=" + charsum);
 System.out.println("출력문자=" + (char) charsum);
 
 
 int intValue3 =10;
 int intValue4 = intValue3/4;
 System.out.println(intValue4);
 System.out.println((float)intValue4); //값이 정수로 저장되서 상관이 없네,
 
 /*float intValue5= (float)intValue3/4.0; //안되네
 System.out.println(intValue5);*/
 double doubleValue= intValue3/4.0;
 System.out.println(doubleValue);
 

		
	}
}
