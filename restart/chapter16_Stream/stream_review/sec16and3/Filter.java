package stream_review.sec16and3;

import java.util.Arrays;
import java.util.List;

public class Filter {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "신민철");

		names.stream().distinct().forEach(System.out::println);

		names.stream().filter(n->n.startsWith("신")).forEach(System.out::println);

		names.stream().distinct().filter(n->n.startsWith("신")).forEach(System.out::println);

		//distinct의 DB의 distinct와 같다.
		//filter는 다양한 조건을 가지고 필터링을 할 수 있다. 
	}
}
