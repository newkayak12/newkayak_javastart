package chap07.sec02.exam01_inheritance;

public class DmbCellphone extends Cellphone{
	int channel;
	
	DmbCellphone (String model, String color, int channel) {
		this.model = model;
		this.color=color;
		this.channel=channel;
		// model, color are inherited from Cellphone class
	}

			void  turnOnDmb() {
				System.out.println( "channel" + channel + "is broadcating");
			}
			void changChannelDmb(int channel) {
				this.channel =channel;
				System.out.println("changing channel" + channel);
			}
			void turnOffDmb() { 
				System.out.println("turn off dmb");
			}
}
