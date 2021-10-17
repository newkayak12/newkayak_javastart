package functionalInterfaceApi.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = t->System.out.println(t +"11");
		consumer.accept("java");


		BiConsumer<String,Integer> biConsumer = (str,in) -> System.out.println(str+" "+in);
		biConsumer.accept("java", 7);

		DoubleConsumer doubleConsumer = d->System.out.println("java "+d);
		doubleConsumer.accept(11.2);

		ObjIntConsumer<String> objIntConsumer = (o,i)->System.out.println(o+i);
		objIntConsumer.accept("java", 12);

	}
}
