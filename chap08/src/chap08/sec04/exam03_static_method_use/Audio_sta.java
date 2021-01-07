package chap08.sec04.exam03_static_method_use;

public class Audio_sta implements RemoteControl_sta {
	private int volume; 
	private boolean mute;
	@Override
	public void turnOn() {
		System.out.println( "turn on Audio" );
		
	}

	@Override
	public void turnOff() {
		System.out.println( "turn off Audio" );
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
	
	@Override
	public void setMute(boolean mute) { // in override, you should do not add ' default'
			this.mute=mute;
			if( mute ) {
				System.out.println( "audio mute" );
				
			} else {
				System.out.println( "audio unmute" );
			}
	
	}
	
	
}
