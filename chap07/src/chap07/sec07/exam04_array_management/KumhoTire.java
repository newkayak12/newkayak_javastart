package chap07.sec07.exam04_array_management;

public class KumhoTire extends Tire {
	public KumhoTire ( String location, int maxRotation ) {
		super(location, maxRotation);
	}
@Override
public boolean roll() {
	++accumulatedRotaion;
		if( accumulatedRotaion < maxRotation	) {
			System.out.println(location + "Kumho tire's last life cycle : " + (maxRotation-accumulatedRotaion));
			return true;
		} else {
			System.out.println("***" + location + " Kumho tire is blew out");
			return false;
		}
}
}
