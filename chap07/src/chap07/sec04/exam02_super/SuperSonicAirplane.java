package chap07.sec04.exam02_super;

public class SuperSonicAirplane extends Airplane {
	
	public static final int NORMAL = 1;
	public static final int SUPER_SONIC=2;
	public int flyMode = NORMAL;
	@Override
	public void fly() {
		if( flyMode == SUPER_SONIC ) {
			System.out.println("Super Sonic mode on, flying...");
		} else { 
			super.fly();
		}
	} 

}
