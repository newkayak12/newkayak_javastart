package sec04.exam01_Arithmetic;

public class OverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x= 1000000;
int y= 1000000;
int z= x*y; //int�� ����ɰ� ���� ������?
System.out.println(z);
//c1
long C = (long)x*y;

//c2
long A = x;
long B = y;
long D = A*B; //�� ���� int�� long���� �ٲٰų�

//c3
long E = (long) z;

System.out.println(C);
System.out.println(D);
System.out.println(E);//z�� ���� ���� �̹� ����� ���¶� �� ȿ���� ����
	}

}
 