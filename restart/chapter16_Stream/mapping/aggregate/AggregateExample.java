package mapping.aggregate;

import java.util.Arrays;

public class AggregateExample {
	public static void main(String[] args) {
		long count = Arrays.stream(new int[]{1,2,3,4,5,6}).filter(n->n%2==0).count();
		System.out.println("2의 배수 개수 "+count);

		long sum = Arrays.stream(new int[] {1,2,3,4,5,6}).filter(n->n%2==0).sum();
		System.out.println("2의 배수 합 "+sum);

		double avg = Arrays.stream(new int[] {1,2,3,4,5,6}).filter(n->n%2==0).average().getAsDouble();
		System.out.println("2의 배수 평균 "+avg);

		long max = Arrays.stream(new int[] {1,2,3,4,5,6}).filter(n->n%2==0).max().getAsInt();
		System.out.println("2의 배수 중 최고 "+max);

		long min = Arrays.stream(new int[] {1,2,3,4,5,6}).filter(n->n%2==0).min().getAsInt();
		System.out.println("2의 배수 중 최소 "+min);

		long first = Arrays.stream(new int[] {1,2,3,4,5,6}).filter(n->n%2==0).findFirst().getAsInt();
		System.out.println("2의 배수 중 첫 번째 수 "+first);

	}
}
