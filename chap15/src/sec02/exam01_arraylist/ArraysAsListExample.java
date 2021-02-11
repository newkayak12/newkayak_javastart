package sec02.exam01_arraylist;

import java.util.*;

public class ArraysAsListExample {
	public static void main(String[] args) {
		
		
		List<String>	list = Arrays.asList("홍길동", "신용권", "감자바");
		
		
		
//		list.add("안녕히");
		//고정된 객체들로 구성해서 추가가 안 됨
			for(String str  : list) {
				System.out.println(str);
			}
			
			
			List<Integer> list2 = Arrays.asList(1,2,3);
				for(int value : list2) {
					System.out.println(value);
					
				}
				
				
				
				
			
			
			
	}
}
