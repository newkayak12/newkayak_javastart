package sec03.exam04_BitReverseOperator;

public class BitReverseOperatorExample {
public static void main(String[] args) {
	//~연산자 tilt라고 부른다.
    // byte, short, int, long 타입만 피연산자가 됨 char, float, doulbe은 불가능
	// 최상위 비트인 부호 비트도 반전되므로 부호가 반대인 완전한 새로운 값이 산출됨
	// 결과값은 정수 기본 타입인 int로 산출 즉, byte v1 =10; , byte v2=~v1; 는 컴파일 에러
	//												   int v2=~v1; 는 정상 출력
	// 												 tilt 하고 +1하면 기존 값에서 부호만 바뀐 값으로 변경 됨. 굳이..? 그냥 부호만 +,-로 바꿔주면 되는거 아님?
	
	// 10진수를 2진수로 변환? (정수를 32비트 이진 문자열로 리턴) 'Integer.toBianryString()'
	
	int v1= 10;
	int v2= ~10;
	int v3 = ~v1+1;
	System.out.println(v2);
	System.out.println(v3);
		System.out.println(toBinaryString(v1) + "(십진수:" +v1 +")");
		System.out.println(toBinaryString(v2) + "(십진수:" +v2 +")");
		System.out.println(toBinaryString(v3) + "(십진수:" +v3 +")");
		
		
	int v4 = -10;
	int v5 = ~v4;
	int v6 = ~v4+1;
	System.out.println(v5);
	System.out.println(v6);
	System.out.println(toBinaryString(v5) + "(십진수:" +v5 +")");
	System.out.println(toBinaryString(v6) + "(십진수:" +v6 +")");
	//비트반전을 사용한다? 하드웨어 제어 목적이 거의 대부분 궁금한데 써보고 시푸다.
	
}
//메소드? : 어떤 실행을 해서 그 결과값을 리턴해주는 프로그램 요소?

	public static String toBinaryString(int value) {
		String str= Integer.toBinaryString(value);
		
		while(str.length()<32) {
			str = "0" +str;
			
		}
		
		return str;
	}
}
