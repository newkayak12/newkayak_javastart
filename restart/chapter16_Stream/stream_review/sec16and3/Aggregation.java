package stream_review.sec16and3;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Aggregation {
	/*
		최종 처리  기능으로 요소들을 처리해서 카운트, 합계, 평균값, 최대값, 최소값 등을 하나의 값으로 산출하는 것
		count		총 개수
		findFirst	첫 번째 요소
		max		최대 요소
		min		최소 요소
		average		요소 평균
		sum		요소 총합
	*/

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5,6};

		System.out.println(Arrays.stream(intArr).filter(n->n%2==0).count());
		System.out.println(Arrays.stream(intArr).filter(n->n%2==0).sum());
		System.out.println(Arrays.stream(intArr).filter(n->n%2==0).average().getAsDouble());
		System.out.println(Arrays.stream(intArr).filter(n->n%2==0).max().getAsInt());
		System.out.println(Arrays.stream(intArr).filter(n->n%2==0).min().getAsInt());
		System.out.println(Arrays.stream(intArr).filter(n->n%2==0).findFirst().getAsInt());

		/*
			Optional 클래스는 집계 값이 존재하지 않을 경우 디폴트 값을 설정할 수 있다. 
			Optional에는 isPresent, orElse, ifPresent가 있다.

			isPresent : 값이 저장되어 있는지 여부
			orElse : 값이 저장되어 있지 않을 경우 Default 값 지정
			ifPresent : 값이 저장되어 있을 경우 Consumer에서 처리


		*/
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println(avg);
		//값이 없으면 java.util.NoSuchElementException

		OptionalDouble avgOption = list.stream().mapToInt(Integer::intValue).average();

		if(avgOption.isPresent()){
			System.out.println("값 있음");
		}  else{
			System.out.println("없음");
		}

		double avgOption2 = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(avgOption2);

		avgOption.ifPresent(n->System.out.println("존재"));

	}
}
