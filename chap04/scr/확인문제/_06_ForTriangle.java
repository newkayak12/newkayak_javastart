package Ȯ�ι���;

public class _06_ForTriangle {
public static void main(String[] args) {
	// ���ڸ� ++�� ���� ��ų �� �ִ� �� ������ ������
	// ���� �ϵ��ڵ�
	int i;
	
	for(i=1; i<=5; i++) {
		switch(i) {
		case 1: System.out.println("*");
		break;
		case 2: System.out.println("**");
		break;
		case 3: System.out.println("***");
		break;
		case 4: System.out.println("****");
		break;
		default : System.out.println("*****");
		break;
			
		// if�� i�� 1�̸� String starArray = "*"
		// else if�� i�� 2�� ...
		// �̰� ���� �ڵ带 �� ���̰� ȿ�������� ���� �� ����?
		
		}
			
	}
	System.out.println("");
	
	for (int q =1; q<=5; q++) {
		for(int j=1; j<=q; j++) {
			System.out.print("*");
		if(j==q) {
			System.out.println();}
		//print�� �׳� ���� ��⸸ �ϴ°Ű� �� �����°Ŵ� ln���� ���ȳ�
		// ���� �ø� ������ �ƴ϶� �� �ϳ��� ��µ� �װ� �ø��� �����ٴ� ������ �߾�� �Ƴ�...
		}
	}
}
}
