package sec04.exam01_Arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=5;
double y=0.0;

double z= 5/y;
//double te=5/0; //이런 연산 자체가 안되기 때문에 이런 연산이 있으면 출력 자체가 안됨
	System.out.println(z); //infinity라고 뜸
	//System.out.println(te); //Exception in thread "main" java.lang.ArithmeticException: / by zero 라고 에러 뿜어냄 궁금해서 쳐봤는데 그냥 안되는거임
	System.out.println(Double.isInfinite(z));
	
	
	double zx=5%y;
	System.out.println(zx);
	System.out.println(Double.isNaN(zx));
	System.out.println(zx+2); //infinity나 NaN 값에 연산 해봐야 의미 없음
	/*이런거 방지하려면 0.0 같은 값이 입력이 안되게하거나 입력 되더라도 이런 값을 걸러내야함*/
	
	
	if(Double.isInfinite(z) || Double.isNaN(z)) {
		System.out.println("계산 불가");
	}else { System.out.println(z+2);
	
	}
	
//한꺼번에 주석처리 control+shift+/ 라고함.. 물론 핫키 목록 보면 되지만...
	int a=5;
	int b=0;
	
	try {
	int c=a/b; //해봤던거지 개인적으로?
	System.out.println("z=" + a);}
	catch(ArithmeticException e) {
		System.out.println("0으로 나누면 안됨");
	}
	
	
	}
}
