package set.tree;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();

		scores.add(new Integer(82));
		scores.add(new Integer(100));
		scores.add(new Integer(42));
		scores.add(new Integer(62));
		scores.add(new Integer(32));
		scores.add(new Integer(95));


		System.out.println("가장 낮은 점수 "+scores.first());
		System.out.println("가장 높은 점수 "+scores.last());
		System.out.println("95점 아래 점수 "+scores.lower(95));
		System.out.println("95점 위의 점수 "+scores.higher(95));
		System.out.println("95점 혹은 바로 아래 점수 "+scores.floor(95));
		System.out.println("95점 혹은 바로 위의 점수 "+scores.ceiling(95));

		while(!scores.isEmpty()){
			System.out.println("popFirt :"+scores.pollFirst());
			//polllast도 있음
			System.out.println("size :"+scores.size());
		}

	}
}
