package sec06.exam01_Array_bylist;

public class ArrayCreateByValueListExample2 {
public static void main(String[] args) {
int[] scores;
scores = new int[] {83,90,87}; //������ = new ����Ÿ�� [] {����}
int sum1=0;
for (int i=0; i<=2; i++) {
	sum1 += scores[i];
}
System.out.println("�� ���� " + sum1);
int sum2 = add(new int[] {83,90,87});
//���ο� ����Ÿ�� ���� �̸� = add(new ������ + int[] {scores �Ű�����})�̷� ������� �޼ҵ带 ����� �����
System.out.println("�� ���� " + sum2);
}


//�޼ҵ� ����

public static int add(int[] scores) {
	int sum1=0;
	for (int i=0; i<=2; i++) {
		sum1 += scores[i];
	}
	return sum1; //�޼ҵ��� ���� �����ϴµ� return�� ���±���
}
}
