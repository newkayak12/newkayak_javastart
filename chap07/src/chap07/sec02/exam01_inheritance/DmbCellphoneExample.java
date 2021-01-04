package chap07.sec02.exam01_inheritance;

public class DmbCellphoneExample {

	public static void main(String[] args) {
DmbCellphone dmbCellPhone = new DmbCellphone("Samsung v-900", "white", 10);
		
		System.out.println("model " + dmbCellPhone.model);
		System.out.println("color "+ dmbCellPhone.color);
		System.out.println("channel" + dmbCellPhone.channel);
		System.out.println();
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("hello");
		dmbCellPhone.receiveVoice("hello");
		dmbCellPhone.sendVoice("nice to meet you");
		dmbCellPhone.hangUp();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
	}


