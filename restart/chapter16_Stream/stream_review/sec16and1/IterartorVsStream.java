package stream_review.sec16and1;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class IterartorVsStream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A","B","C");
		Iterator<String> iterator = list.iterator();

		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}


		System.out.println();

		Stream<String> stream = list.stream();
		stream.forEach(n->System.out.println(n));
	
		
	}
}
/*
	Stream과 Iterator는 비슷한 역할을 하지만 람다식으로 요소 처리 코드를 제공하는 점과 내부 반복자를 사용하여 병렬처리가 쉽다는 점, 중간처리와 최종 처리 작업을 수행 수 있다는 점에서 차이가 있다.


	1. 람다식 요소 처리 코드를 제공  > 함수적 인터페이스를 가지는 매개변수를 가지기 때문에
	2. 외부 반복자는 개발자가 코드로 직접 컬렉션 요소를 반복해서 가져오는 것(for, while)인데, 내부 반복자는 컬렉션 내부에서 요소들을 반복시키고 개발자는 요소당 처리해야할 코드만 제공하는 코드 패턴을 말한다.
		추가적으로 병렬처리를 하게 되면 작업을 서브로 나누고 서브를 스레드에서 병렬 처리 후 합쳐서 결과물을 생성한다. 
	3. 스트림은 중간처리와 최종 처리를 할 수 있다.  컬렉션 요소에 중간 처리, 최종 처리를 수행할 수 있는데, 중간처리에는 매핑, 필터링, 정렬을 수행하고 최종 처리에는 반복, 카운팅, 평균, 총합 등의 집계처리를 할 수 있다. 
*/