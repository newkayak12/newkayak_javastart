package inheritance;

public class StorageImpl<T> implements Storage<T> {
	private T[] array;

	public StorageImpl(int capacity){
		this.array = (T[])(new Object[capacity]);
	}
	
	@Override
	public void add(T item, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
