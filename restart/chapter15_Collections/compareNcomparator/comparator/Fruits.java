package compareNcomparator.comparator;

public class Fruits {
	private String name;
	public int price;

	public Fruits(String name, int price) {
		this.name = name;
		this.price = price;
	}

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


	@Override
	public String toString() {
		return "{" +
			" name='" + getName() + "'" +
			", price='" + getPrice() + "'" +
			"}";
	}

}
