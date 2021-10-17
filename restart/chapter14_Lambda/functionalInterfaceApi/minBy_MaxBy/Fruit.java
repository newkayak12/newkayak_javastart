package functionalInterfaceApi.minBy_MaxBy;

public class Fruit {
	private String name;
	private int price;


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

}
