package sec07.exam04_other_constructor_call;

public class Car {
String company = "Benz";
String model;
String color;
int maxSpeed;

	
	public Car() {
	
	}
	
	public Car(String model)	{
//		this.model =model;
//		this.color=null;
//		this.maxSpeed=0;
		this(model, null, 0);
		
		//System.out.println("Car(String model) 실행 "); // 이렇게 되있으면 맨 밑으로 가서 다 생성자를 실행하고 다시 돌아와서 이 구문을 실행
		//이 구문이 생성자 구문  this(model,null,0);위에 있으면 안됨 
	}
	
	public Car(String model, String color) {
//		this.model =model;
//		this.color=color;
//		this.maxSpeed=0;
		this(model, color, 0);
		
	}
	
	public Car(String model, String color, int maxSpeed) {
	this.model =model;
	this.color=color;
	this.maxSpeed=maxSpeed;
	
	//위의 것들이  this()로 받아서 맨 마지막에 다 있는 부분으로 넘겨준다는 내용
		
	}
	
	
	

}
