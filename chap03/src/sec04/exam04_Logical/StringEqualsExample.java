package sec04.exam04_Logical;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 숫자야구 같은거 쓸때 이걸로 쓰는건가? 아니면 각 값을 나눠서 int로 저장하고 비교해야하는건가? string 참조 타입 string
		 * a="java"; string b="java";라고 하면 a,b 둘다 같은 java객체를 참조하고 같은 번지를 참조 문자열 비교는
		 * equals()를 사용 a.equals(b); 이런식으로 사용
		 * ==나 !=는 참조 번지값이 같냐를 볼 때 사용
		 */
		String strVar1 = "이시하라 사토미";
		String strVar2 = "이시하라 사토미";
		String strVar3 = new String("이시하라 사토미");
		
		System.out.println(strVar1 == strVar2);//번지가 같냐?
		System.out.println(strVar1 == strVar3);//번지가 다르다. (new로 선언했으니 다른 객체)
		System.out.println('\t'); //결과적으로  문자리터럴은 ''로 프린터 아웃
		System.out.println();    //둘은 같음
		System.out.println(strVar1.equals(strVar2));//객체의 '문자열을 비교'
		System.out.println(strVar1.equals(strVar3)); // 문자열을 비교해서 18째줄과는 다른 결과를 낸다.
		
	}

}
