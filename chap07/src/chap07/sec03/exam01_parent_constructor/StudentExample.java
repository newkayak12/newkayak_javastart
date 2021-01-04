package chap07.sec03.exam01_parent_constructor;

public class StudentExample {

	public static void main(String[] args) {
			Student stdnt = new Student("watson", "1220-122", 1);
			//constructor load sequence = parents(super) > child
			System.out.println("name " + stdnt.name);
			System.out.println("ssn "+ stdnt.ssn);
			System.out.println("studentNo " + stdnt.studentNo);
	}

}
