package set;

public class Member {
	public String name;
	public int age;


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

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Member){
			Member m = (Member) o;
			return m.name.equals(name)&&(m.age==age);
		} else{
			return false;
		}
	}

	@Override
	public int hashCode() {
		return name.hashCode()+age;
			// String의 해시코드
	}

}
