package set.tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
			
		TreeSet<Integer> scores = new TreeSet<>();

		scores.add(new Integer(82));
		scores.add(new Integer(100));
		scores.add(new Integer(42));
		scores.add(new Integer(62));
		scores.add(new Integer(32));
		scores.add(new Integer(95));
		System.out.println("DESC");

		NavigableSet<Integer> descendingSet =scores.descendingSet();
			for(Integer score:descendingSet){
				System.out.println(score);
			}

		System.out.println("\nASC");
		NavigableSet<Integer> ascendingSet =descendingSet.descendingSet();
			for(Integer score:ascendingSet){
				System.out.println(score);
			}

			
	}
}
