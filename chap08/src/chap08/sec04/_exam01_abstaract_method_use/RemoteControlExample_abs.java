package chap08.sec04._exam01_abstaract_method_use;

public class RemoteControlExample_abs {

	public static void main(String[] args) {
		RemoteControl_abs rc = null;//�������̽� ��ü�� �������� 
		;
		rc= new Television_abs();
		
		rc.turnOn();
		rc.turnOff();
		
	rc= new Audio_abs();
		rc.turnOn();
		rc.turnOff();
	}

}
