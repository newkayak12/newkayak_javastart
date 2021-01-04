package chap07.sec07.exam04_array_management;

public class Tire {
	 public int maxRotation;
	 //life cycle
	 public int accumulatedRotaion;
	 //cumulative number of rotations
	 public String location;
	 //location of tire
	 
	 public Tire ( String location, int maxRotation ) {
		 this.location = location;
		 this.maxRotation = maxRotation;
	 }
	 
	 	public boolean roll() { 
	 		++accumulatedRotaion;
	 		if( accumulatedRotaion < maxRotation	) {
	 			System.out.println(location + "tire's last life cycle : " + (maxRotation-accumulatedRotaion));
	 			return true;
	 		} else {
	 			System.out.println("***" + location + " tire is blew out");
	 			return false;
	 		}
	 	}
}
