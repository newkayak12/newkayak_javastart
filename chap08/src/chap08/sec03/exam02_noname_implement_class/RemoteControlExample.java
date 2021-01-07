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
//			단발적으로 사용한다면 이렇게 익명 구현 객체에서 사용할 수 있다.
			public void method2() {
				
			}
//			내부에서 새롭게 지정된 메소드는 익명구현 객체 생성자 안에서만 사용 가능하다. 
//        오버라이드 된 메소드는 rc.turnOn(); 등으로 사용 가능하다. 
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
//			단발적으로 사용한다면 이렇게 익명 구현 객체에서 사용할 수 있다.
			public void method2() {
				
			}
//			내부에서 새롭게 지정된 메소드는 익명구현 객체 생성자 안에서만 사용 가능하다. 
//        오버라이드 된 메소드는 rc.turnOn(); 등으로 사용 가능하다. 
		}; // you can show RemoteControlExample$2
	}

}
