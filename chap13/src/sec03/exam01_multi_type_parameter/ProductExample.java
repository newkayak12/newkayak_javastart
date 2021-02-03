package sec03.exam01_multi_type_parameter;

public class ProductExample {

	public static void main(String[] args) {
		
		
		Product<Tv,String> product = new Product<>(); //new Product<Tv,String>(); //자바6까지.. 자바 7부터는 가능
		product.setKind(new Tv());
		product.setModel("smart tv");
		
		Tv tv = product.getKind();
		String str = product.getModel()	;
		
		Product<Car,String> product2 = new Product<Car, String>()	;
		product2.setKind(new Car());
		product2.setModel("R8");
		
		Car car = product2.getKind();
		String str2 = product2.getModel();
		
		
	}

}
