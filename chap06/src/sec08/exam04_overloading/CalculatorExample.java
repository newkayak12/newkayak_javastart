package sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator clc = new Calculator();
		
			double rectangle1= clc.areaRectangle(10);
				System.out.println(rectangle1);
			
			double rectangle2= clc.areaRectangle(10,20);
				System.out.println(rectangle2);
// int parameter is promoted to double parameter automatically 			
				
				
	}

}
