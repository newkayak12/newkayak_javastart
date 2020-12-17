package sec06.exam04_main_argument;

public class MainStringArrayArgument { //만약 java mai~~~~~ {abc def 주면 abc가 배열 하나 def가 배열 두개째 인덱스는 0,1 이게 args로 대입됨

	public static void main(String[] args) { //JVM이 main을 호출하고 그러면 String 배열 매개값에 무엇이 입력되느냐?
		// TODO Auto-generated method stub
		/* System.out.println("배열의 길이: " + args.length); */
		if(args.length != 2) {
			System.out.println("프로그램 사용법");
			System.out.println("java sec06.exam04_main_argument.MainStringArrayExample num1 num2");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1); //숫자로 변환 가능한 문자열을 숫자로 변환
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1+num2;
		System.out.println(num1 + "+" + num2+ "=" +result);

	}

}
 