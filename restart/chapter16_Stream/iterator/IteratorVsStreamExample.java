package iterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class IteratorVsStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hong","kim","lee");
		System.out.println("ITERATOR");
		Iterator<String> itor = list.iterator();
		while(itor.hasNext()){
			System.out.println(itor.next());
		}

		System.out.println();

		System.out.println("STREAM");
		Stream<String> str= list.stream();
		str.forEach(name -> System.out.println(name));
	}
}
