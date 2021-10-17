package getStream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayExample {
	public static void main(String[] args) {
		String[] strArr = {"A","B","C","D"};
		Stream<String> str =Arrays.stream(strArr);
		str.forEach(a->System.out.println(a));
	}
}
