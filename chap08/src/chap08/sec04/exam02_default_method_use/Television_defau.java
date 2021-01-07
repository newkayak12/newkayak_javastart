package chap08.sec04.exam02_default_method_use;

public class Television_defau implements RemoteControl_defau {
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
		if( volume > RemoteControl_defau.MAX_VOLUME ) {
			this.volume= RemoteControl_defau.MAX_VOLUME;
		} else if ( volume< RemoteControl_defau.MIN_VOLUME ) {
			this.volume= RemoteControl_defau.MIN_VOLUME;
		} else {
			this.volume=volume;
		}
	System.out.println( "Now volume : " + volume );
	}
	
	
}
