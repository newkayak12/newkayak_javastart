package sec01.exam01_variable; //<line 73���� �� _ �޼ҵ带 �����Ѵٴ� �ǹ�>

public class B_LiteralExample {
 public static void main(String [] args) {
	 int var1=10;
	 	System.out.println(var1); // 10���� ���ͷ�
	 	
	 	int var2=010;
	 	System.out.println(var2); // 8���� ���ͷ�
	 	
	 	int var3 =0x1A;
	 	System.out.println(var3); //16���� ���ͷ�
	 	
	 	double var4=234E5;
	 	System.out.println(var4); // 10���� ������ ����
	 	
	 	double var6=2E5;
	 	System.out.println(var6); // 10���� ������ ���� 2
	 	 	
	 	double var5=0.823;
	 	System.out.println(var5); // �Ҽ�
	 	
	 	String lit1="��"; 
	 	
	 	/* public void print(String s) {
	    write(String.valueOf(s));
	}*/ //�̰� Declaration�� �ִ��� �̰� String�� Ŭ������� �ߴ� �ǹ��ΰ�?
	 	
	 	System.out.print(lit1); // char���� "��"�� ��� �ȵǼ� String ���� �ٲ㺽
	 	
	 	char lit3='\n'; // �ٹٲ� <carridge return?)
	 	System.out.println(lit3); //�� �����ð� �׳� '\' ������ �Ǵ°ſ��� |�� �ƴ϶� (��A�� ��µǼ� �־ ���ڴ� ���޾� ������ �ٴ� ������ �ֳ��� �и� �ڵ� ������ ���� �ٲ�µ�
	 	
	 	char lit2='A';
	 	System.out.print(lit2); // char�� ""�� �ƴ϶� ''��� ���� �߰���
	 	
	 	char lit4='\t';
	 	System.out.println(lit4); // �� ��ŭ �����
	 	System.out.println(lit4); // �������� ����? �Ϻη� �غôµ� �ȵǴ°ǰ�? �������̶� ���� ���̶� ���� �����ΰž�..?
	 	
	 	char lit6='\r'; //line feed?
	 	System.out.println(lit6);
	 	
	 	/* ĳ���� ���� + �����ǵ� = ����*/
	 	
	 	char lit5='��';
	 	System.out.println(lit5);	 	
	 	System.out.println(lit5); System.out.print(lit2); System.out.println(lit1);
	 	
		 	
	 	//���� ���ͷ� ������ ���� �����ϱ� ���� _ ���ͷ��� �ƿ� ����� �ų� �׳�... �׷� �����ε�?
	 	
	 	System.out.println('\t' + "�鿩����");
	 	System.out.println('\n' + "�� �ٲ�");
	 	System.out.println('\r' + "����"); //�ٹٲٱ⳪ �����̳� �� �Ȱ��� ������?
	 	System.out.println('\"' + "ū ����ǥ�� ���� ����ǥ" + '\''); //���׵��� ����Ʈ�ƿ����� ����� �� �ְ�
	 	
	 	char lit7 = '\uff1f';
	 	System.out.println(lit7);  // ���� ���� ������ �� 16���� �����ڵ带 ������ �� �ֳ�
	 	
	 	
	 	//string�� Ŭ���� Ÿ���̶�� �ϴµ�, ������ ios ������ ��  ���� ���� </string> 3.1.4 <string>�ΰ��� ���ִ��� �̰Ŷ� ������ �ֳ�?
	 	
	 	System.out.print("����" + "�α�");
	 	
	 	String lit8 ="�ڹ�";
	 	
	 	boolean var10 = true;
	 	boolean var11 = false;
	 	System.out.println('\n');
	 	System.out.println(var10);
	 	System.out.println(var11);
	 	
	 	  
	 	
	 	
 }
}
  