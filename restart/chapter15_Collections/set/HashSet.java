package set;

import java.util.Iterator;
import java.util.Set;

public class HashSet {
	public static void main(String[] args) {
		Set<String> set = new java.util.HashSet<>();

		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("JAVA");
		set.add("MyBatis");

		int size = set.size();
		System.out.println(size);

		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

		set.clear();
	}
}
