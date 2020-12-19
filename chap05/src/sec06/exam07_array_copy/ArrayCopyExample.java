package sec06.exam07_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//system.arraycopy(이전의 배열, 이전 배열의 복사 위치, 새로운 배열, 새로운 배열의 붙여넣기 위치, 몇 개를 복사할 것이냐);
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+", ");
		}
	}

}
