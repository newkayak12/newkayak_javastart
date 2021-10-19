package stream_review.sec16and3;

import java.util.Arrays;

public class Looping {
	
	
	public static void main(String[] args) {
		/*
			루핑은 요소 전체를 반복하는 것을 말한다. 루핑 메소드에는 peek, forEach가 있다. 
			peek은 중간 처리, foreach는 최종 처리이다. 
			peek은 중간 처리 단계에서 전체 요소를 루핑하면서 추가 작업을 하기 위해서 사용한다.
			foreach는 최종 처리 메소드이기 떄문에 파이프라인 마지막에 루핑하면서 요소를 하나씩 처리한다.
		*/
		int[] intArr = {1,2,3,4,5,6};

		System.out.println("peek를 마지막에 호출한 경우");
		Arrays.stream(intArr).filter(a->a%2==0).peek(System.out::println);

		System.out.println("peek에 다른 최종 메소드를 넣는 경우");
		Arrays.stream(intArr).filter(a->a%2==0).peek(System.out::println).sum();

		System.out.println("foreach를 호출");
		Arrays.stream(intArr).filter(a->a%2==0).forEach(System.out::println);

		/*
			최종 단계에서 요소들이 특정 조건에 만족하는지 조사할 수 있도록 세 가지 매칭 메소드를 제공하고 있다.
			allMatch, anyMatch, noneMatch

			Predicate로 조건을 만족하는지 조사한다. 
		*/

		System.out.println(Arrays.stream(intArr).allMatch(a->a%2==0));
		System.out.println(Arrays.stream(intArr).anyMatch(a->a%2==0));
		System.out.println(Arrays.stream(intArr).noneMatch(a->a%2==0));
	}
}
