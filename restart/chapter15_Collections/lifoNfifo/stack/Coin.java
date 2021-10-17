package lifoNfifo.stack;

public class Coin {
	private int value;


	public Coin(int value) {
		this.value = value;
	}


	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "{" +
			" value='" + getValue() + "'" +
			"}";
	}

}
