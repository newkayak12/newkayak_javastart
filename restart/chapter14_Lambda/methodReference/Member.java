package methodReference;

public class Member {
	private String name;
	private String id;


	public Member() {
		System.out.println("Member() 실행");
	}

	public Member(String id) {
		System.out.println("Member(String id) 실행");
		this.id=id;
	}	


	public Member(String name, String id) {
		System.out.println("Member(String name, String id) 실행");
		this.name = name;
		this.id = id;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


}
