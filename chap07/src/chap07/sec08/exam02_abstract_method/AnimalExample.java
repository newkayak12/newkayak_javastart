package chap07.sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {

		Dog dog =new Dog();
		Cat cat = new Cat();
		
		dog.growl(); // call overrided method
		cat.growl();
		System.out.println("-----------------------");
		
		Animal animal = null;
		animal = new Dog();
		animal.growl();
		animal = new Cat();
		animal.growl();
		System.out.println("------------------------");
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound( Animal animal ) {
											// you can insert this parameter to inherited objects
		animal.growl();
	}

}
