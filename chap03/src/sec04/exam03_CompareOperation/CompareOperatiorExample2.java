package sec04.exam03_CompareOperation;

public class CompareOperatiorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int v2= 1;
double v3 =1.0;
System.out.println(v3 == v2);
double v4 =0.1;
float v5 =0.1f;
System.out.println(v4 == v5);//상식적으로는 같아야함... 근데 다르대 부동소수계산 때문인 것 같은데(float과 double의 정밀도 차이 때문에 같다고 보지않는다. 
System.out.println((float)v4 == v5);//8바이트를 4바이트로 강제타입 변환하면 같다고 나오네 
/*근데 왜그런지 진짜 모르겠어 어떻게 수가 다른지*/
System.out.println((int)(v4*10) == (int)(v5*10));
//test//
System.out.println((int)v4*10 == (int)v5*10); //같네?
/* 근데, ==로 !=도 표현할 수 있는데 굳이 !=를 왜 만들었을까? */
	}

}
