package methodReference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConsturctorReferencesExample {
	public static void main(String[] args) {
		Function<String,Member> func = Member::new;
		Member m1 = func.apply("angel");

		BiFunction<String,String,Member> func2 = Member::new;
		Member m2 = func2.apply("angel","천사");

	}
}
