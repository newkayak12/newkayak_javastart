package sec06.exam07_array_copy;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] oldIntArray = {1,2,3};
int[] newIntArray = new int[5];

for(int i =0; i<oldIntArray.length; i++) {
	newIntArray[i]=oldIntArray[i];
	//oldIntArray[i]=newIntArray[i]; // �̰� ������ �߿��ϳ� ó���� �̷��� ���ٰ� ���� �ߴµ� _ �̰Ŵ� �� �ʺ��� �ٽ� �� �� ������ �����ϴ�. �ϴ� �� ������ �߿��ϴ� ���� �˾���
	
}
for (int i=0; i<newIntArray.length; i++) {
	System.out.print(newIntArray[i] + ",");
}
	}

}
