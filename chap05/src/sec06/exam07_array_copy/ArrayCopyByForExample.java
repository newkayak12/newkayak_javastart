package sec06.exam07_array_copy;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] oldIntArray = {1,2,3};
int[] newIntArray = new int[5];

for(int i =0; i<oldIntArray.length; i++) {
	newIntArray[i]=oldIntArray[i];
	//oldIntArray[i]=newIntArray[i]; // 이거 순서도 중요하네 처음에 이렇게 썻다가 뭐지 했는데 _ 이거는 알 쪽보면 다시 알 수 있을거 같긴하다. 일단 이 순서도 중요하단 것을 알았음
	
}
for (int i=0; i<newIntArray.length; i++) {
	System.out.print(newIntArray[i] + ",");
}
	}

}
