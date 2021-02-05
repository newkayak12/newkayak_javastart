package sec07.exam01_generic_extends_implements;

public interface Storage<A> {
	
	public void add(A item, int index);
	
	public A read (int index);
}
