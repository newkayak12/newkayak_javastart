package list.linkedList;
import java.util.*;
public class LinkedList {
	/*
		ArrayList와 사용 방법은 같지만 내부 구조는 다르다. 
	*/

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new java.util.LinkedList<>();

		long startTime;
		long endTime;

		startTime = System.nanoTime();
		for(int i =0; i<100000; i++){
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArryList : " + (endTime-startTime)+"ms");

		startTime = System.nanoTime();
		for(int i =0; i<100000; i++){
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList : " + (endTime-startTime)+"ms");

		/*
			ArryList : 1832409788ms
			LinkedList : 51360199ms
		*/
	}

}
