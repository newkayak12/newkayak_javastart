package chap07.sec03_parent_constructor;

public class People {
	public String name, ssn;

	public People(String name, String ssn) {
		this.name = name;
		this.ssn  = ssn;
		System.out.println("Making parents object is completed");
	}
	
}
