package mapping.looping;

import java.util.Arrays;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5,6};
		System.out.println("peek()를 마지막에 호출");
		Arrays.stream(intArr).filter(a->a%2==0).peek(n->System.out.println(n));
		//동작 X

		System.out.println("최종 처리 메소드를 마지막에 호출한 경우");
		int total = Arrays.stream(intArr).filter(a->a%2==0).peek(n->System.out.println(n)).sum();
		System.out.println("total : "+total);

		System.out.println("forEach()를 마지막에 호출");
		Arrays.stream(intArr).filter(a->a%2==0).forEach(n->System.out.println(n));
		
	}
}
