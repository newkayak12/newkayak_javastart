package sec03.exam02_hashcode;

import java.util.*;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key_Over, String> hashMap = new HashMap<Key_Over,String>();
//		키로 어떤 객체를 저장하는 컬렉션
		hashMap.put(new Key_Over(1), "홍길동");
		
			String value = hashMap.get(new Key_Over(1));
				System.out.println(value); //null?????
				
				
//				hashCode()
//				hashCode()
//				equals()
//				순으로 나오는데 둘의 해시코드를 뽑고 equals로 
				
				System.out.println("================");
				
				HashMap<Key, String> hashMap2= new HashMap<Key,String>();
//				키로 어떤 객체를 저장하는 컬렉션
				hashMap2.put(new Key(2), "홍길동");
				
					String value2 = hashMap.get(new Key(2));
						System.out.println(value2); //null?????
	}

}
