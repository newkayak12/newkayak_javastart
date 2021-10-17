package map.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(87), "kim");
		scores.put(new Integer(98), "lee");
		scores.put(new Integer(75), "park");
		scores.put(new Integer(95), "jang");
		scores.put(new Integer(80), "na");

		Map.Entry<Integer, String> entry = null;

		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 : " +entry.getKey()+"-"+entry.getValue());

		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : " +entry.getKey()+"-"+entry.getValue());

		entry = scores.lowerEntry(95);
		System.out.println("95점 아래 점수 : " +entry.getKey()+"-"+entry.getValue());

		entry = scores.higherEntry(95);
		System.out.println("95점 이상 점수 : " +entry.getKey()+"-"+entry.getValue());

		entry = scores.floorEntry(95);
		System.out.println("95점 이거나 바로 아래 점수 : " +entry.getKey()+"-"+entry.getValue());

		entry = scores.ceilingEntry(95);
		System.out.println("95이거나 바로 위의  점수 : " +entry.getKey()+"-"+entry.getValue());

		while(!scores.isEmpty()){
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey()+"-"+entry.getValue()+ "== 남은 객체 수 == "+scores.size());
		}

	}
}
