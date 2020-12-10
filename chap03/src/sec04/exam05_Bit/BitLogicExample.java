package sec04.exam05_Bit;

public class BitLogicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*피연산이 boolean 이면 (일반 논리 연산)
피연산이 정수 타입이면 (비트논리 연산) _ bye, short, char타입을 int로 저장해서 연산함
true & false = false
6 % 3

> eg 
45_ 0 0 1 0 1 1 0 1 //    0 0 1 0 1 1 0 1
         &			//           |
25_ 0 0 0 1 1 0 0 1 //    0 0 0 1 1 0 0 1
09_ 0 0 0 0 1 0 0 1 //61_ 0 0 1 1 1 1 0 1 

이런식으로 비트끼리 논리 합, 곱을 수행

Q 이걸 해서 어디다가 쓰는지 궁금합니다.  ?? 암호화??하는데 쓰는걸까?
*/		
		System.out.println("45&25=" + (45&25));
		System.out.println("45|25=" + (45|25));
		System.out.println("45^25=" + (45^25));
		System.out.println("~45 = " + (~45));
		
		System.out.println(toBinaryString(45));
		System.out.println("&");
		System.out.println(toBinaryString(25));
		System.out.println("||");
		System.out.println(toBinaryString(45&25));
	}

	public static String toBinaryString(int value)	{
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str="0"+str;
		}
		return str;
	}
}
