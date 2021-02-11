package sec04.exam01_hashmap;

import java.util.*;

public class HashMapExample1 {
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		
		System.out.println(map.size());
//		얘도 중복이 안되지..당연히 키가 같으니까
		System.out.println(map.get("홍길동"));
//		마지막에 넣은게 이전에 넣을 걸 밀어버림
		
		
		
		Set<String> keySet = map.keySet();
		Iterator <String> keys = keySet.iterator();
			while(keys.hasNext()) {
					System.out.println(keys.next());
				Integer value =map.get(keys);
					System.out.println(value);
			}
			
			System.out.println();
			
			
			map.remove("신용권");
			
			Set<Map.Entry< String, Integer >> entrySet = map.entrySet();
			
			Iterator <Map.Entry<String, Integer>> iter = entrySet.iterator();
				while(iter.hasNext()) {
					Map.Entry<String, Integer> entry = iter.next();
					String key = entry.getKey();
					Integer value = entry.getValue();
					
						System.out.println(key +" : "+ value);
							
				}
				System.out.println();
				map.clear();
				System.out.println(map.size());
			
	}
}
