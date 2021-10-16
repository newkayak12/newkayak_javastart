package genericMethod;

import basicGeneric.Box;

public class Util {
	public static<T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	};
}