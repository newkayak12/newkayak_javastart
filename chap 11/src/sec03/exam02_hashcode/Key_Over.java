package sec03.exam02_hashcode;

public class Key_Over {
	public int number;
	
	public Key_Over (int number) {
		this.number=number;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if(obj instanceof Key_Over) {
			Key_Over compareKey= (Key_Over) obj;
				if(this.number == compareKey.number) {
					return true;
				}
			
		}
	
	
		return false;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		return number;
	}
	
	
//	누가 더 먼저 생성될까??
	
}
