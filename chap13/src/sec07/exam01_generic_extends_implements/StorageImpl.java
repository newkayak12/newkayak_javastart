package sec07.exam01_generic_extends_implements;

public class StorageImpl <A> implements Storage<A> {

		private A[] array;
		
		 public StorageImpl(int capacity) {
			array =  (A[]) (new Object[capacity]);
		}
	@Override
	public void add(A item, int index) {
		array[index] = item;
	}

	@Override
	public A read(int index) {
		
		
		return array[index];
	}

}
