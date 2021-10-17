package compareNcomparator.comparator;

import java.util.Comparator;

public class DescFruits implements Comparator<Fruits> {
	

	@Override
	public int compare(Fruits o1, Fruits o2) {
		if(o1.price<o2.price) return 1;
		else if(o1.price==o2.price) return 0;
		else return -1;
	}
	
}
