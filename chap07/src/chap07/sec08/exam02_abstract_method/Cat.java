package chap07.sec08.exam02_abstract_method;

public class Cat extends Animal	 {
	
	public Cat() {
		this.kind="Mammal";
		
	}
	
	@Override
	public void growl() {
		System.out.println("Meow~");
	}
}
