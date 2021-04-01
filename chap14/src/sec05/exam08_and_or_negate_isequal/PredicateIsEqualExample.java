/**
 * 
 */
package sec05.exam08_and_or_negate_isequal;

import java.util.function.*;

/**
 * @author sanghyeonkim
 * 
 * 
 *
 */
public class PredicateIsEqualExample {

	/**
	 * @param args
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> predicate;
		
		predicate = Predicate.isEqual(null);
				System.out.println("null,null : " + predicate.test(null));
				
		predicate = Predicate.isEqual("java11");
				System.out.println("java11, nul : l" + predicate.test(null));
		
		predicate = Predicate.isEqual(null);
				System.out.println("null, java11 : " + predicate.test("java11"));
				
		predicate = Predicate.isEqual("java11");
				System.out.println("java11, java11 : " + predicate.test("java11"));
				
				
//				나중에 컬렉션에서 어떤 값을 찾거나 필터링 할 때, 문자열이 포함되거나 같은 것을 찾을 때 이 요소에 넣어서 true가 나오는 것을 걸러내는 용도로 사용할 것
				
				
				
	}

}
