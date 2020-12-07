package sec04.exam01_Arithmetic;

public class OverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x= 1000000;
int y= 1000000;
int z= x*y; //int로 저장될거 같지 않으면?
System.out.println(z);
//c1
long C = (long)x*y;

//c2
long A = x;
long B = y;
long D = A*B; //저 위에 int를 long으로 바꾸거나

//c3
long E = (long) z;

System.out.println(C);
System.out.println(D);
System.out.println(E);//z에 더미 값이 이미 저장된 상태라 별 효과가 없네
	}

}
 