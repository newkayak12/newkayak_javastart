package sec05.exam02_consumer;

import java.util.function.*;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t+11);
		consumer.accept("java ");
//		소비...
		
		
		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t+u);
		biConsumer.accept("java ","Script");
		
		
		DoubleConsumer dCon = d -> System.out.println("java "+ d);
		dCon.accept(15.2);
		
		ObjIntConsumer<String> objIntCon = (t,i) -> System.out.println(t + i);
		
		objIntCon.accept("Java ", 16);
		
		
	}

}
