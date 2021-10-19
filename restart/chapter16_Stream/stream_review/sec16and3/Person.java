package stream_review.sec16and3;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
	}
	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return Integer.compare(age, o.getAge());
	}
	
}
