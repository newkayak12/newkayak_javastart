package sec03.exam02_While;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		boolean run =true;
		int Speed=0;
		int keyCode=0;
		
		while(run) {
			
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("---------------------------------------");
				System.out.println("1. �ӵ� ����  |  2. �ӵ� ����  |  3. ����");
				System.out.println("---------------------------------------");
				System.out.print("����:"); //system.out.print (ln�� ���� ����)
				
			} 
			keyCode=System.in.read();
			//System.out.println(keyCode);
if(keyCode ==49) {
	Speed++;
	System.out.println("�ӵ��� �����մϴ�. ���� �ӵ���" + Speed +"�Դϴ�.");
} else if(keyCode ==50) {
	System.out.println("�ӵ��� �����մϴ�. ���� �ӵ���"+ Speed +"�Դϴ�.");
} else if (keyCode == 51){
	run =false;
	
	
}
		}
		System.out.println("�۵��� �����մϴ�.");
		} }
