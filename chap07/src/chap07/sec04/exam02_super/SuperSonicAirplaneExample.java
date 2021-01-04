package chap07.sec04.exam02_super;

public class SuperSonicAirplaneExample {

	public static void main(String[] args) {
		SuperSonicAirplane ssa = new SuperSonicAirplane();
		ssa.takeOff();
		ssa.fly();
		ssa.flyMode = SuperSonicAirplane.SUPER_SONIC;
		ssa.fly();
		ssa.flyMode = SuperSonicAirplane.NORMAL;
		ssa.fly();
		ssa.land();
	}

}
