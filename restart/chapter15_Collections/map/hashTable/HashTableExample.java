package map.hashTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<>();

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner scn = new Scanner(System.in);

		while(true){
			System.out.print("id : ");
			String id = scn.next();
			System.out.print("pw : ");
			String pw = scn.next();

			if(map.containsKey(id)&&map.get(id).equals(pw)){
				System.out.println("signin");
				break;
			} else {
				System.out.println("wrong!");
			}
		}
	}
}
