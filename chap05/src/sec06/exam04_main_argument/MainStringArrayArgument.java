package sec06.exam04_main_argument;

public class MainStringArrayArgument { //���� java mai~~~~~ {abc def �ָ� abc�� �迭 �ϳ� def�� �迭 �ΰ�° �ε����� 0,1 �̰� args�� ���Ե�

	public static void main(String[] args) { //JVM�� main�� ȣ���ϰ� �׷��� String �迭 �Ű����� ������ �ԷµǴ���?
		// TODO Auto-generated method stub
		/* System.out.println("�迭�� ����: " + args.length); */
		if(args.length != 2) {
			System.out.println("���α׷� ����");
			System.out.println("java sec06.exam04_main_argument.MainStringArrayExample num1 num2");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1); //���ڷ� ��ȯ ������ ���ڿ��� ���ڷ� ��ȯ
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1+num2;
		System.out.println(num1 + "+" + num2+ "=" +result);

	}

}
 