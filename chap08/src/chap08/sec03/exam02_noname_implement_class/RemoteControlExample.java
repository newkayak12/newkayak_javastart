package chap08.sec03.exam02_noname_implement_class;

import chap08.sec03.exam01_name_implement_class.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rc = new RemoteControl() {

			private int volume; 
			@Override
			public void turnOn() {
				System.out.println( "turn on tv" );
				
			}

			@Override
			public void turnOff() {
				System.out.println( "turn off tv" );
			}

			@Override
			public void setVolume(int volume) {
				if( volume > RemoteControl.MAX_VOLUME ) {
					this.volume= RemoteControl.MAX_VOLUME;
				} else if ( volume< RemoteControl.MIN_VOLUME ) {
					this.volume= RemoteControl.MIN_VOLUME;
				} else {
					this.volume=volume;
				}
			System.out.println( "Now volume : " + volume );
			}
//			�ܹ������� ����Ѵٸ� �̷��� �͸� ���� ��ü���� ����� �� �ִ�.
			public void method2() {
				
			}
//			���ο��� ���Ӱ� ������ �޼ҵ�� �͸��� ��ü ������ �ȿ����� ��� �����ϴ�. 
//        �������̵� �� �޼ҵ�� rc.turnOn(); ������ ��� �����ϴ�. 
		};
		
		RemoteControl rc2 = new RemoteControl() {

			private int volume; 
			@Override
			public void turnOn() {
				System.out.println( "turn on tv" );
				
			}

			@Override
			public void turnOff() {
				System.out.println( "turn off tv" );
			}

			@Override
			public void setVolume(int volume) {
				if( volume > RemoteControl.MAX_VOLUME ) {
					this.volume= RemoteControl.MAX_VOLUME;
				} else if ( volume< RemoteControl.MIN_VOLUME ) {
					this.volume= RemoteControl.MIN_VOLUME;
				} else {
					this.volume=volume;
				}
			System.out.println( "Now volume : " + volume );
			}
//			�ܹ������� ����Ѵٸ� �̷��� �͸� ���� ��ü���� ����� �� �ִ�.
			public void method2() {
				
			}
//			���ο��� ���Ӱ� ������ �޼ҵ�� �͸��� ��ü ������ �ȿ����� ��� �����ϴ�. 
//        �������̵� �� �޼ҵ�� rc.turnOn(); ������ ��� �����ϴ�. 
		}; // you can show RemoteControlExample$2
	}

}
