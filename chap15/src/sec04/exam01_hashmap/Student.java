package sec04.exam01_hashmap;

import java.util.*;

public class Student {
	int sno;
	String name;
	
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}


	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		} else if ( o instanceof Student) {
			Student other = (Student) o;
			return (other.sno) == this.sno && other.name.equals(this.name);
		}
			return false;
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(sno, name);
	}
	
	
}
