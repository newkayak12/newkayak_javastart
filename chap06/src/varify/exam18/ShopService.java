package varify.exam18;

public class ShopService {
	
	private static  ShopService spSv = new ShopService();
	
	private ShopService()  {
		
	}
	
		static  ShopService getInstance( ) {
		
		return spSv;
	}
}
