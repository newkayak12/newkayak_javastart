package sec03.exam01_for;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*for(float x=0.1f; x<=1.0f; x+=0.1f) {
	System.out.println(x);
}*/
		//float�� 0.1 ó���� ����� ���ϱ� ����, �ε��Ҽ���꿡���� ����

/*for(int y =1; y<=10; y++) {
	System.out.println((float)y*0.1);
}*/
   // �̰͵� ������ �����? 0.30000000004������ϴ� ������

for(int z=1; z<=10; z++) {
	System.out.println((float)z/10);
}
	//0.1�� ���ϴ°Ŷ� 10���� �����°Ŷ� �ٸ��� �޾Ƶ��̴±���... /10�� ��������̴ϱ�... �ϱ� *0.1�� 0.1���� �ε��Ҽ� ó���Ǵϱ� �׷��� ����
	}

}
