package parallel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedListExample {
	public static void work(int value){

	}

	public static long testParallel(List<Integer> list){
		long start = System.nanoTime();
		list.stream().parallel().forEach(a->work(a));
		long end = System.nanoTime();
		
		return end-start;
	}

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		for(int i = 0; i<1000000; i++){
			arrayList.add(i);
			linkedList.add(i);
		}

		long array = testParallel(arrayList);
		long linked = testParallel(linkedList);

		array = testParallel(arrayList);
		linked = testParallel(linkedList);

		if(array > linked){
			System.out.println(" linked가 더 빠름");
		}else{
			System.out.println(" arrayList가 더 빠름");
		}
	}
}
