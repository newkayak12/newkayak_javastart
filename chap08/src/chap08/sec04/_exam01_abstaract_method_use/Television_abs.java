package chap08.sec04._exam01_abstaract_method_use;

public class Television_abs implements RemoteControl_abs {
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
		if( volume > RemoteControl_abs.MAX_VOLUME ) {
			this.volume= RemoteControl_abs.MAX_VOLUME;
		} else if ( volume< RemoteControl_abs.MIN_VOLUME ) {
			this.volume= RemoteControl_abs.MIN_VOLUME;
		} else {
			this.volume=volume;
		}
	System.out.println( "Now volume : " + volume );
	}
	
	
}
