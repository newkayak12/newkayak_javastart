package sec03.exam01_hashset;

import java.util.*;

public class Member {
	public String name;
	public int age;

	
	
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}




	@Override
	public boolean equals(Object o) {
			if(this == o) {
				return true;
			
			
			}  else if( o instanceof Member) {

				Member other = (Member ) o;
					if(this.name.equals(name)  &&  this.age == other.age) {
						return true;
					}
			
			} 
			return false;
		
	}




	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, age);
		
//		return name.hashCode(); + age;    흠...
	}
	
	
	
	
}
