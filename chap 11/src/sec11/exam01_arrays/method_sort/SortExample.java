package sec11.exam01_arrays.method_sort;

import java.util.*;

public class SortExample {
	public static void main (String [] args) {
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		
		String [] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		
//		사용자 정의 클래스
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		
		
		Member[] members = {m1,m2,m3};
		
		Arrays.sort(members);
		
		for(int i=0; i<members.length; i++) {
			System.out.println(members[i].name);
		}
		
		
//		Exception in thread "main" java.lang.ClassCastException: class sec11.exam01_arrays.method_sort.Member cannot be cast to class java.lang.Comparable (sec11.exam01_arrays.method_sort.Member is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//		at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
//		at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
//		at java.base/java.util.Arrays.sort(Arrays.java:1040)
//		at sec11.exam01_arrays.method_sort.SortExample.main(SortExample.java:25)
		
		
		//저 배열이 무조건 comparable이라는 인터페이스를 구현해야만 함

		
	}
}
