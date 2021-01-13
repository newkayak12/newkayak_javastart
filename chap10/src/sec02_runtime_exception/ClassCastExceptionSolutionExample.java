package sec02_runtime_exception;


class Animal2{}
class Dog2 extends Animal2 {}
class Cat2 extends Animal2 {}


public class ClassCastExceptionSolutionExample {

	public static void main(String[] args) {

	Animal2 animal = new Dog2();
	Dog2 dog = (Dog2) animal;
	
	Cat2 cat = (Cat2) animal;
//	얘도 일반 예외라 컴파일러에 걸리지는 않는데
//	생각해보면 안 될만 한 짓이지.
	
	
//	Exception in thread "main" java.lang.ClassCastException: class sec02_runtime_exception.Dog cannot be cast to class sec02_runtime_exception.Cat (sec02_runtime_exception.Dog and sec02_runtime_exception.Cat are in unnamed module of loader 'app')
//	at sec02_runtime_exception.ClassCastExceptionExample.main(ClassCastExceptionExample.java:16)
	
//	
	
	}

}
