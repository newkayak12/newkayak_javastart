package chap08.sec04.exam02_default_method_use;

public class RemoteControlExample_defau {

	public static void main(String[] args) {
		RemoteControl_defau rc = null;//�������̽� ��ü�� �������� 
		;
		rc= new Television_defau();
		
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
	
		//RemoteControl.setMute(true); (X)
		rc = new Audio_defau();
		rc.setMute(true);
	}

}
