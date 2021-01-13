package sec02_runtime_exception;


class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}


public class ClassCastExceptionExample {

	public static void main(String[] args) {

	Dog dog = new Dog();
	changeDog(dog);
	
	Cat cat = new Cat();
	changeDog(cat);
	
	
	
//	둘 다 Animal을 상속 받아서 컴파일러 선에서 검출은 안 되
//	그렇지만 생각해보면 안 될만 한 짓이지.
	
	
//	Exception in thread "main" java.lang.ClassCastException: class sec02_runtime_exception.Dog cannot be cast to class sec02_runtime_exception.Cat (sec02_runtime_exception.Dog and sec02_runtime_exception.Cat are in unnamed module of loader 'app')
//	at sec02_runtime_exception.ClassCastExceptionExample.main(ClassCastExceptionExample.java:16)
	
//	
	
	}

	public static void changeDog( Animal animal ) {
		if(animal instanceof Dog) {
		Dog dog  = (Dog) animal;
		} else {
			System.out.println("Dog으로 변환이 어렵습니다.");
		}
	}
}
