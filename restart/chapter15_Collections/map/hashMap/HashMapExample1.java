package map.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("신용권", 85);
		map.put("홍길동", 25);
		map.put("신용권", 54);
		map.put("이자바", 65);

		System.out.println(map.size());

		//..중략

		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()){
			String key = keyIterator.next();
			System.out.println(key + " : " + map.get(key));
		}


		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();

		while(entryIterator.hasNext()){
			Map.Entry<String,Integer> entry = entryIterator.next();
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}


		//키는 겹칠 수 없는데 객체로 이를 정의하려면 Eqals, Hashcode 오버라이드로 각 객체의 동등성, 동일성을 구분할 수 있게 해야한다. 

		Map<Student, Integer> map2 = new HashMap<>();

		map2.put(new map.hashMap.Student(111, "name"), 3);
		map2.put(new map.hashMap.Student(111, "name"), 5);

		System.out.println(map2.size());
	}
}
