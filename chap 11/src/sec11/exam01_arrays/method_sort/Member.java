package sec11.exam01_arrays.method_sort;

public class Member implements Comparable<Member>{
	String name;
	
	public Member	(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
//		현재 멤버가 매개 값보다 작으면 -1
//		같으면 0
//		현재 멤버가 매개 값보다 크면 +1
		
	
//		String이 제공한다. 
//		문자 코드 값의 차이로 비교한다.
		return 	name.compareTo(o.name);
	}
}
