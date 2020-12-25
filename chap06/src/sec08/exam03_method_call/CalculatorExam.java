package sec08.exam03_method_call;

public class CalculatorExam {

	public static void main(String[] args) {
Calculator clc= new Calculator();  // 생성자 호출해서 객체(인스턴스) 생성

clc.execute(); //참조변수.메소드 참조변수에 Calculator 메소드의 주소값이 저장됨

//만약 리턴 타입이 없다면              참조변수.메소드(매개값);
//반대로 리턴 타입이 있다면 | 타입 변수 = 참조변수.메소드(매개값);

	}

}
