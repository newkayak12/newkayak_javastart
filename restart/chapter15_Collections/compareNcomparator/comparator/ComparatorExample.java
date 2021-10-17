package compareNcomparator.comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		// TreeSet<Fruits> set = new TreeSet<>();
		// set.add(new Fruits("포드", 3000));
		// set.add(new Fruits("사과", 13000));
		// set.add(new Fruits("딸기", 5000));

		//comparable을 구현하지 않아서 예외 발생
		/*
			Exception in thread "main" java.lang.ClassCastException: compareNcomparator.comparator.Fruits incompatible with java.lang.Comparable
			at java.base/java.lang.ClassCastException.<init>(ClassCastException.java:71)
			at java.base/java.util.TreeMap.compare(TreeMap.java:1291)
			at java.base/java.util.TreeMap.put(TreeMap.java:536)
			at java.base/java.util.TreeSet.add(TreeSet.java:255)
			at compareNcomparator.comparator.ComparatorExample.main(ComparatorExample.java:9)
		*/


		TreeSet<Fruits> setwithComp = new TreeSet<>(new DescFruits());
		setwithComp.add(new Fruits("포드", 3000));
		setwithComp.add(new Fruits("사과", 13000));
		setwithComp.add(new Fruits("딸기", 5000));

		Iterator<Fruits> iter = setwithComp.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}

	}

	
}
