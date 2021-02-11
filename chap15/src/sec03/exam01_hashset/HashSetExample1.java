package sec03.exam01_hashset;

import java.util.*;

public class HashSetExample1 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("jcbc");
		set.add("Servlet/jsp");
		set.add("java");
		
		set.add("ibatis");
		
		int size = set.size();
		System.out.println(size);
		Iterator<String> it = set.iterator();
			while(it.hasNext()) {
				String temp = it.next();
				System.out.println(temp);
			}
			
			
		set.remove("jdbc");
		set.remove("ibatis");
		
		int size2 = set.size();
		System.out.println(size2);
		
		
		for(String element : set) {
			System.out.println(element);
		}
		
		
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("clear");
		}
		
		
	}
}
