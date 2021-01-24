package sec04.exam03_hashcode;

import java.util.*;

public class HashCodeExample {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
	}
	
			static class Student{
				int sno;
				String name;
			
				public Student(int sno, String name) {
					this.sno=sno;
					this.name=name;
				}
				
				@Override
					public int hashCode() {
						
					return Objects.hash(sno, name);
		//			return sno;
		//			return name.hashCode();
					
		//			 이러면 둘 중 하나만 같아도 같게 나오겠지 해시로 비교할 떄???
		//			여러가지 필드를 조합해서 하나의 해시코드로 만들고 싶으면 Objects클래스의  hash로 
					}
				
					@Override
					public boolean equals(Object obj) {
						if(obj instanceof Student) {
							Student s = (Student) obj;
								if(s.sno==this.sno) {
									if(s.name.equals(this.name)) {
										return true;
									}
								}
						}
										return false;
					}
					
				
//				조금 더 정확하게 비교하려면 equals도 override해서 비교해야 정확함
			}
	
}
