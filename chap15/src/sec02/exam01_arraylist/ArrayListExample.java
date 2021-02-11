package sec02.exam01_arraylist;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
//		capacitiy = 10;
		
		
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"DataBase");
		list.add("iBATIS");
		
		
		//   java / DataBase / JDBC / Servlet/JSP
		System.out.println("\n\n size");
		int size = list.size();
			System.out.println(size);
		
		String skill = list.get(2);
			System.out.println(skill);
			System.out.println("\n\n show all");
			for(int i =0; i<list.size(); i++) {
				String str = list.get(i);
				
					System.out.println(str);
			}
				
			System.out.println("\n\n remove");
		list.remove(2);
		
			System.out.println(list.get(2));
		
		
		
	
	}
}
