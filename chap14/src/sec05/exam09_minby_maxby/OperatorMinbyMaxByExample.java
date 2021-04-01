package sec05.exam09_minby_maxby;

import java.util.function.*;

public class OperatorMinbyMaxByExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BinaryOperator<Fruit> binaryOperator;
			Fruit fruit;
			
			
					
			binaryOperator = BinaryOperator.minBy( (f1,f2 ) -> Integer.compare(f1.price, f2.price));
																	// comparator의 익명구현 객체
			
			fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 15000));
			
					System.out.println("minBy : " +fruit);

			binaryOperator = BinaryOperator.maxBy( (f1, f2) -> Integer.compare(f1.price, f2.price));

			fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 15000));
			
					System.out.println("maxBy : " + fruit);
			
	}
}
