package chap08.sec03.exam03_multi_implement_class;

import chap08.sec03.exam01_name_implement_class.RemoteControl;

public class SmartTelevision implements Searchable, chap08.sec03.exam03_multi_implement_class.RemoteControl{
	private int volume;
	@Override
	public void search(String url) {
		System.out.println( "searching" + url);
	}

	@Override
	public void turnOn() {
		System.out.println("turn on tv");
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
	}


