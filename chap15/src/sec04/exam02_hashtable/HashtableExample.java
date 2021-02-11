package sec04.exam02_hashtable;

import java.util.*;
import java.util.Map.*;

public class HashtableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		Scanner scn = new Scanner(System.in);
		
		
			System.out.println(	map.size());
			
			while(true) {
					System.out.println("enter id /password");
					System.out.print(">");
					System.out.println("id");
				String id = scn.next();
					System.out.println("password");
				String psswd = scn.next();
				
				if(map.containsKey(id)) {
						if(map.get(id).equals(psswd)) {
								System.out.println("login success");
								return;
						}
					
						System.out.println("wrong password");
				} else {
						System.out.println("invalid id and password");
				}
				
			}
	}
}
