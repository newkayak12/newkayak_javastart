package sec03.exam04_clone;

public class MemberExample {

	public static void main(String[] args) {
		
		Member origin = new Member("blue", "hong", "12345", 25, true);
			System.out.println("cloned object's field");
			System.out.println("id : " + origin.id);
			System.out.println("name: " + origin.name);
			System.out.println("password : " + origin.psswd);
			System.out.println("age: " + origin.age);
			System.out.println("adult: " + origin.adult);
			System.out.println();
			
		Member cloned = origin.getMember();
//		thinClone
//		다른 객체이지만 내부 데이터는 같은 것을 참조
		cloned.psswd = "67890";
//		원본과 다른 복제 객체를 생성 = 데이터 보존
			System.out.println("cloned object's field");
			System.out.println("id : " + cloned.id);
			System.out.println("name: " + cloned.name);
			System.out.println("password : " + cloned.psswd);
			System.out.println("age: " + cloned.age);
			System.out.println("adult: " + cloned.adult);
	}

}
