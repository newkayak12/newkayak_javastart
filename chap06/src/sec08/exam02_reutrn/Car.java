package sec08.exam02_reutrn;

public class Car {
 int gas;
 
 void setGas(int gas) {
	 this.gas=gas; //this.gas�� �ʵ忡 �ִ� gas
	 
 }
 
 boolean isLeftGas() {
	 
	 if(gas == 0) {
		 System.out.println("���ᰡ �����ϴ�.");
	 return false;
	 } 
	 System.out.println("���ᰡ �ֽ��ϴ�.");
	 return true; //if ���� �ȿ� ������ false�� �� ���� �������� ������ �ۿ� �ִ� true��
 }
 
 
 void run() {
	 while(true) {//if you want finish this 'whileSyntax',  break or return must be exist
		if(gas>0) {
			System.out.println("���� �� �Դϴ�.(�ܷ� :" + gas + ")");
			gas--;
		} else {
			System.out.println("���� �մϴ�.(�ܷ� :" + gas + ")");
			break; // or return
		}
	 }
 }
}
