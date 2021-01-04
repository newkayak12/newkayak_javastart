package chap07.sec07.exam03_field_polymorphism;

public class HankookTire extends Tire {
	public HankookTire ( String location, int maxRotation ) {
		super(location, maxRotation);
	}
@Override
public boolean roll() {
	++accumulatedRotaion;
		if( accumulatedRotaion < maxRotation	) {
			System.out.println(location + "Hankook tire's last life cycle : " + (maxRotation-accumulatedRotaion));
			return true;
		} else {
			System.out.println("***" + location + " Hankook tire is blew out");
			return false;
		}
}
}
