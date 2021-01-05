package chap07.sec08.exam02_abstract_method;

public class Dog  extends Animal {
	public Dog() {
		this.kind= "Mammal";
	}
	@Override
	public void growl() {
		System.out.println("BOWOW!!");
	}

}
