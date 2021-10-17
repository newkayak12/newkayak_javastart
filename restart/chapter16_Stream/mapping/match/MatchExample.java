package mapping.match;

import java.util.Arrays;

public class MatchExample {
	public static void main(String[] args) {
		int[] arr = {2,4,6,8};

		boolean result = Arrays.stream(arr).allMatch(a->a%2==0);
		System.out.println("모두 2의 배수 "+ result);

		result = Arrays.stream(arr).anyMatch(a->a%3==0);
		System.out.println("하나라도 3의 배수? "+result);

		 result = Arrays.stream(arr).noneMatch(a->a%3==0);
		System.out.println("3의 배수는 없는가? "+result);
	}
}
