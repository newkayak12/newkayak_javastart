package sec04.exam01_Arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=5;
double y=0.0;

double z= 5/y;
//double te=5/0; //�̷� ���� ��ü�� �ȵǱ� ������ �̷� ������ ������ ��� ��ü�� �ȵ�
	System.out.println(z); //infinity��� ��
	//System.out.println(te); //Exception in thread "main" java.lang.ArithmeticException: / by zero ��� ���� �վ �ñ��ؼ� �ĺôµ� �׳� �ȵǴ°���
	System.out.println(Double.isInfinite(z));
	
	
	double zx=5%y;
	System.out.println(zx);
	System.out.println(Double.isNaN(zx));
	System.out.println(zx+2); //infinity�� NaN ���� ���� �غ��� �ǹ� ����
	/*�̷��� �����Ϸ��� 0.0 ���� ���� �Է��� �ȵǰ��ϰų� �Է� �Ǵ��� �̷� ���� �ɷ�������*/
	
	
	if(Double.isInfinite(z) || Double.isNaN(z)) {
		System.out.println("��� �Ұ�");
	}else { System.out.println(z+2);
	
	}
	
//�Ѳ����� �ּ�ó�� control+shift+/ �����.. ���� ��Ű ��� ���� ������...
	int a=5;
	int b=0;
	
	try {
	int c=a/b; //�غô����� ����������?
	System.out.println("z=" + a);}
	catch(ArithmeticException e) {
		System.out.println("0���� ������ �ȵ�");
	}
	
	
	}
}
