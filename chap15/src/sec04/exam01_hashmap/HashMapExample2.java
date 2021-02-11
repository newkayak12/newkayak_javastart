package sec04.exam01_hashmap;

import java.util.*;

public class HashMapExample2 {
	public static void main(String[] args) {
		
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(1,"홍길동"), 95);
		map.put(new Student(1,"홍길동"), 90);
		
		System.out.println(map.size());
//		똑디 작동하네
		
		System.out.println(map.get(new Student(1, "홍길동")));
		
	}
		
}
