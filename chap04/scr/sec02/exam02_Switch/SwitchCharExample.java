package sec02.exam02_Switch;

public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char grade ='b';
		

	switch(grade) {
		case 'A':
		case 'a':
				System.out.println("���ȸ���Դϴ�."); //char�� �����ϰ� case �� ���� �ٿ����� ��� ����
				break;
				
		case 'B':
		case 'b':
				System.out.println("�Ϲ�ȸ���Դϴ�.");
				break;
				
		default :	
				System.out.println("��ȸ���Դϴ�.");
				break;
	}	}
	}

