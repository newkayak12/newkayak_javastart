package chap07.sec04.exam01_override;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		Calculator calc = new Calculator();
		System.out.println("area : " +calc.areaCircle(r));
		System.out.println();
		Computer cmptr = new Computer();
		System.out.println("area2 :" + cmptr.areaCircle(r));
	}

}
