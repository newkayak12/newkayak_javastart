package functionalInterfaceApi.function;

public class Student {
	private String name;
	private int english;
	private int math;


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnglish() {
		return this.english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return this.math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public Student(String name, int english, int math) {
		this.name = name;
		this.english = english;
		this.math = math;
	}



}
