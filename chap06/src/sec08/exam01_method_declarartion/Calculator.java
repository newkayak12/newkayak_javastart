package sec08.exam01_method_declarartion;

public class Calculator {
	
	void powerOn() {
System.out.println("전원을 켭니다.");
		} // 메소드를 사용하려면 생성자로 클래스를 초기화해야 가능
	
	int plus(int x, int y) {
		int result= x+y;
		
		return result;
	}
	
double divide(int x, int y) {
	double result = (double)x/ (double)y;
	return result;
}
	

double mutiple(int x, int y ) {
	double result = (double) x * (double) y;
	return result;
}
		
	}
	
	


