package sec03.exam04_clone;

public class Member implements Cloneable {
	public String id;
	public String name;
	public String psswd;
	public int age;
	public boolean adult;
	
	
	
	public Member(String id, String name, String psswd, int age, boolean adult		) {
		this.id=id;
		this.name=name;
		this.psswd = psswd;
		this.age = age;
		this.adult = adult;
	}
	
	
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {}
		
			return cloned;
	}
//		Type mismatch: cannot convert from Object to Member
//		Unhandled exception type CloneNotSupportedException
//		
	
}
