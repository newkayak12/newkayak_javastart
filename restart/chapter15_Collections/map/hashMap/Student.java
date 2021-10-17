package map.hashMap;

public class Student {
	public int sno;
	public String name;


	public int getSno() {
		return this.sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
    	public boolean equals(Object o) {
		if(o instanceof Student){
			Student stu = (Student) o;
			return (sno==stu.getSno()&&name.equals(stu.getName()));
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return sno+name.hashCode();
	}

}
