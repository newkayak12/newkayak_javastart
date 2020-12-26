package sec10.exam04_singletone;

public class SingletoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Singletone obj1 = new Singletone();
//   	Singletone obj2 = new Singletone();
//		*in class 'Singletone', "private Singleton() {}" prohibit to make a new instance
		
		Singletone obj1 = Singletone.getInstance();
		Singletone obj2 = Singletone.getInstance();
		
		if(obj1==obj2) {
			System.out.println("both objects are same");
		} else {
			System.out.println("both objects are not same");
		}
		
	}

}
