package chap07.sec03_parent_constructor;

public class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		//super("Sherlock", "123-122");
		super(name, ssn); // super must located at top
		this.studentNo=studentNo;
		System.out.println("Making child object is completed");
	}
}
