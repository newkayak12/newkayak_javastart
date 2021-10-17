package map.treeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(87), "kim");
		scores.put(new Integer(98), "lee");
		scores.put(new Integer(75), "park");
		scores.put(new Integer(95), "jang");
		scores.put(new Integer(80), "na");
		System.out.println("desc");
		NavigableMap<Integer,String> desc = scores.descendingMap();
		Set<Map.Entry<Integer,String>> descSet = desc.entrySet();
		for(Map.Entry<Integer,String> entry : descSet){
				System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("\n asc");
		NavigableMap<Integer,String> asc = desc.descendingMap();
		Set<Map.Entry<Integer,String>> ascSet = asc.entrySet();
		for(Map.Entry<Integer,String> entry : ascSet){
				System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
