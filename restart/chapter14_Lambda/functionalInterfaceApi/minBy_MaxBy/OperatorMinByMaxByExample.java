package functionalInterfaceApi.minBy_MaxBy;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;

		binaryOperator = BinaryOperator.minBy((f1,f2)->Integer.compare(f1.getPrice(), f2.getPrice()));
		fruit = binaryOperator.apply(new Fruit("딸기", 600), new Fruit("수박", 800));
		System.out.println("낮은 가격 : "+fruit.getName());

		binaryOperator = BinaryOperator.maxBy((f1,f2)->Integer.compare(f1.getPrice(), f2.getPrice()));
		fruit = binaryOperator.apply(new Fruit("딸기", 600), new Fruit("수박", 800));
		System.out.println("높은 가격 : "+fruit.getName());
	}
}
