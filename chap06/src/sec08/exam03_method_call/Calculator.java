package sec08.exam03_method_call;

public class Calculator {

	int plus(int x, int y) {
	int result =x+y;
	return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum /2;
		return result;
	}

	
	void execute() {
		double result = avg(7, 10);
		System.out.println("실행결과: " + result);
	}

}


//클래스 내부에서는 이름만으로 메소드를 호출이 가능하다.