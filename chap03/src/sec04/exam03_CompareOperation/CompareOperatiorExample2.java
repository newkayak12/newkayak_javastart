package sec04.exam03_CompareOperation;

public class CompareOperatiorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int v2= 1;
double v3 =1.0;
System.out.println(v3 == v2);
double v4 =0.1;
float v5 =0.1f;
System.out.println(v4 == v5);//��������δ� ���ƾ���... �ٵ� �ٸ��� �ε��Ҽ���� ������ �� ������(float�� double�� ���е� ���� ������ ���ٰ� �����ʴ´�. 
System.out.println((float)v4 == v5);//8����Ʈ�� 4����Ʈ�� ����Ÿ�� ��ȯ�ϸ� ���ٰ� ������ 
/*�ٵ� �ֱ׷��� ��¥ �𸣰ھ� ��� ���� �ٸ���*/
System.out.println((int)(v4*10) == (int)(v5*10));
//test//
System.out.println((int)v4*10 == (int)v5*10); //����?
/* �ٵ�, ==�� !=�� ǥ���� �� �ִµ� ���� !=�� �� ���������? */
	}

}
