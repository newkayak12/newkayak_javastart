package sec03.exam01_equals;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
			
			if(obj1.equals(obj2)) {
					
					System.out.println("obj1 is same as obj2");
				
			} else {
					System.out.println("not same");
			}
//			obj1 == obj2랑 같은 말인데 equals가...?
			
			
			System.out.println();
			if(obj1.equals(obj3)) {
				
				System.out.println("obj1 is same as obj3");
			
		} else {
				System.out.println("not same");
		}
			
//		false
			
			
			String nel = "love";
			String nle = new String("love");
			System.out.println(nel.equals(nle));
			
//			그럼 두 개 주소 값이 같다는 소리네  equal.....??? 헷깔리네...
			
			
			
//			equals 를 override 해서 id 가 같으면 같게 나오게 할 것
			
			
	}

}
