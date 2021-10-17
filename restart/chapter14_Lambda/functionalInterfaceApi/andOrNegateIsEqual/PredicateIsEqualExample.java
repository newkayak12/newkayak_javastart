package functionalInterfaceApi.andOrNegateIsEqual;

import java.util.function.Predicate;

public class PredicateIsEqualExample {
	public static void main(String[] args) {
		Predicate<String> predicate;

		predicate = Predicate.isEqual(null);
		System.out.println("null, Null :" + predicate.test(null));

		predicate = Predicate.isEqual("JAVA8");
		System.out.println("null, java8 :" + predicate.test(null));

		predicate = Predicate.isEqual(null);
		System.out.println("java8, Null :" + predicate.test("java8"));

		predicate = Predicate.isEqual("java8");
		System.out.println("java8, java8 :" + predicate.test("java8"));

		predicate = Predicate.isEqual("java7");
		System.out.println("java7, java8 :" + predicate.test("java8"));
	}
}
