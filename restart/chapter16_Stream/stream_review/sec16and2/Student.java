package stream_review.sec16and2;

public class Student {
	String name;
	int score;


	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public Student() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "{" +
			" name='" + getName() + "'" +
			", score='" + getScore() + "'" +
			"}";
	}

}
