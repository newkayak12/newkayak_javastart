package examClass;

public class Car {
	
	private String name;
	private String simpleName;
	

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSimpleName() {
		return this.simpleName;
	}

	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}


	public Car(String name, String simpleName) {
		this.name = name;
		this.simpleName = simpleName;
	}

	public Car() {
	}

}
