package set.tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");

		System.out.println("C~F사이 단어 검색");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true); // c<= ~~~ <=f

		for(String word : rangeSet){
			System.out.println(word);
		}
	}
}
