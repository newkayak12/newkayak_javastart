package compareNcomparator.comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();

		treeSet.add(new Person("kim", 45));
		treeSet.add(new Person("lee", 25));
		treeSet.add(new Person("park", 33));
		treeSet.add(new Person("jang", 28));

		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()){
			Person person = iterator.next();
			System.out.println(person);
		}
	}
}
