package sec03.exam01_hashset;

import java.util.*;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		
		set.add(new Member("홍길동", 30 ));
		set.add(new Member("홍길동", 30 ));
		
//		원래는 주소 값이 달라서 둘 다 들어가야 했는데 equals랑 hashcode를 오버라이드 해서 아마 하나만 저장 될 것임
		System.out.println(set.size());
		
	}

}
