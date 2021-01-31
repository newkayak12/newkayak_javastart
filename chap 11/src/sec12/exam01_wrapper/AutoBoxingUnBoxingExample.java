package sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		
		Integer obj = 100;
//		new Integer();가 아니더라도 자동으로 박싱을 함
//		
		System.out.println(obj.intValue());
		
		
//		대입시 자동 unboxing
		
		int value = obj;
//		객체가 어떻게 기본 타입에 대입이 되는가?? -> integer객체라면 자동 언박싱해서 값을 넣는다. 
		System.out.println(value);
		
//		연산시 자동 언박싱이 되는 경우
		int result = obj + 100;
		System.out.println(result);
//		정확한 syntax라면 잘못된 것
		
		//프로그램을 작성할 때 문자열을 기본타입으로 변경해서 사용할 떄에도 이용함
//	String을 갖고 있는데 이를 byte로 바꿔서 쓰고 싶다 그러면 Byte.parseByte(); 을 이용해서 byte값을 얻을 수 있다. 
		
	}

}
