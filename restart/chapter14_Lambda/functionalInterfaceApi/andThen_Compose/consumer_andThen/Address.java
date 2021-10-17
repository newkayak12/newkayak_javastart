package functionalInterfaceApi.andThen_Compose.consumer_andThen;

public class Address {
	private String country;
	private String city;


	public Address(String country, String city) {
		this.country = country;
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
}
