package varify.exam18;

public class ShopServiceExample {

	public static void main(String[] args) {

			ShopService obj1 =  ShopService.getInstance();
			ShopService obj2 = ShopService.getInstance();
			
				if(obj1==obj2) {
					System.out.println(" Same objects");
				} else {
					System.out.println(" not Same objects");
				}
	}

}
