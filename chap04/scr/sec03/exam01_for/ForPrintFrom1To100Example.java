package sec03.exam01_for;

public class ForPrintFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum =0;
int i=1;

for(i =1; i<=100; i++) {
	sum +=i;
	System.out.println(i);
}
System.out.println("1~100������ ��" + sum);
System.out.println("1~" +(i-1)+ "������ ��" + sum);//for �ۿ��� ������ �����ϸ� for ��, �ۿ��� ��� ��� ����
	}

}
