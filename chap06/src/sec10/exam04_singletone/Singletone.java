package sec10.exam04_singletone;

public class Singletone {

		private static Singletone sngltn =new Singletone();
//this field is for init instance once		
// keyword 'private' makes this sentence can be read in this class
// keyword 'static' makes this sentence read-only 

		
	private Singletone() {
		
	}
//	this constructor makes that new operator  can't create new instance
	
	static Singletone getInstance() {
		
		return sngltn;
	}
// this method is the only way to access this class, inner field and method 
				
	}
