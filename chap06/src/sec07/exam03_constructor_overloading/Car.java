package sec07.exam03_constructor_overloading;

public class Car {
String company = "Benz";
String model, color;
int maxSpeed;

public Car() {}

public Car( String model) {
	this.model = model;
}

public Car(String model, String color) {
	this.model = model;
	this.color=color;
}
public Car(String model, String color, int maxSpeed) {
	this.model = model;
	this.color=color;
	this.maxSpeed=maxSpeed;
}

//만약에 이러면 오버로딩일까?
public Car(String model, int maxSpeed, String color) {
	this.model = model;
	this.color=color;
	this.maxSpeed=maxSpeed;
	
	//타입이 달라져서 오버로드임 
	
	//위의 중노동을 막는 방법은 this()로 받으면 됨
	
	
	
	
}
}
