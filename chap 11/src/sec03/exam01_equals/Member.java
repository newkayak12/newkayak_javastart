package sec03.exam01_equals;

public class Member {
	public String id;
	
	public Member(String id ) {
		this.id = id;
	}
	
	
	 @Override
	public boolean equals(Object obj) {
		if( obj instanceof Member) {
			Member member = (Member ) obj;
//			오브젝트 타입을 Member 로 강제 변환
			
				if(id.equals(member.id)) {
					return true;
				}
		}
		
		
		return false;
	}
			@Override
			public int hashCode() {
		
			return id.hashCode();
			}
	 
}
