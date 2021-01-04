package chap07.sec04.exam01_override;

public class Computer  extends Calculator {
	@Override
	double areaCircle(double r) { 
		System.out.println("object Computer's areaCircle run");
		return Math.PI*r*r;
		
	}
}
