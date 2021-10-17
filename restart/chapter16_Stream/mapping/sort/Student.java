package mapping.sort;

public class Student implements Comparable<Student>{
	private String name;
	private int score;


	public Student(String name, int score) {
		this.name = name;
		this.score = score;
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


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.compare(score, o.score);
	}
}
