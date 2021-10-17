package functionalInterfaceApi.supplier;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier sup = ()->{
			int num = (int)(Math.random()*6)+1;
			return num;
		};

		int num = sup.getAsInt();
		System.out.println("눈의 수 :"+num);

	}
}
