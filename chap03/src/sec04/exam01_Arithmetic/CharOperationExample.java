package sec04.exam01_Arithmetic;

public class CharOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//문자
/* char c1='A'+1;
 * char c2='A';
 * char c3=c2+1; >2바이트 변수 +1? 4바이트 int로 바뀌고 값은 66(int type) > char(2바이트)에 66(4바이트)를 대입하면 문제가 생기겠지?
 * char c3=(char) (c2+1); 이러면 2바이트로 대입해서 B가 나옴*/
		
		
		char c1='A'+1;
		char c2='A';
		//char c3=c2+1; //변수(2바이트->4바이트로 변환) +1(4바이트) 결과 값은 4바이트, 근데 char로 대입하니까 코드에러
		int result = c2+1;//이러면 
		System.out.println(result);
			char c3=(char) result;
		System.out.println(c3); //c3를 유니코드로 변환해서 출력, B가 산출
		System.out.println(c1); //리터럴을 연산해서 char로 넣는것은 문제가 없으나, 변수를 연산하면 4바이트로 바뀜
		
		
 

		
		
	}

}
