package chap08.sec04.exam03_static_method_use;

public class Television_sta implements RemoteControl_sta {
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
		if( volume > RemoteControl_sta.MAX_VOLUME ) {
			this.volume= RemoteControl_sta.MAX_VOLUME;
		} else if ( volume< RemoteControl_sta.MIN_VOLUME ) {
			this.volume= RemoteControl_sta.MIN_VOLUME;
		} else {
			this.volume=volume;
		}
	System.out.println( "Now volume : " + volume );
	}
	
	
}
