package sec06.exam07_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//system.arraycopy(������ �迭, ���� �迭�� ���� ��ġ, ���ο� �迭, ���ο� �迭�� �ٿ��ֱ� ��ġ, �� ���� ������ ���̳�);
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+", ");
		}
	}

}
