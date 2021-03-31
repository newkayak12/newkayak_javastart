package sec05.exam03_supplier;

import java.util.function.*;

public class SupplierExample {

	public static void main(String[] args) {
		IntSupplier intSup = () -> {
			
			
			int num = (int) (Math.random()*6)+1;
			return num;
		
		};
			
		
		int num = intSup.getAsInt();
			System.out.println("눈의 수 " + num);
			
			
		
	}

}
