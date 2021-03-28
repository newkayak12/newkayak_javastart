package sec05.exam02_consumer;

import java.util.function.*;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t+11);
		consumer.accept("java ");
//		소비...
	}

}
