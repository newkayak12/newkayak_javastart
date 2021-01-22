package sec03.exam03_tostring;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("Apple", "iOS");
		String strObj = sp.toString();
			
			System.out.println(strObj);
//					위 아래는 똑같다.
			System.out.println(sp.toString());
			
//			toString을 무조건 재정의 할 필요는 없고, 
//		필요할 떄  사용한다. ...
	}

}
