package functionalInterfaceApi.predicate;

public class Student {
	private String name;
	private String sex;
	private int score;


	public Student(String name, String sex, int score) {
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
