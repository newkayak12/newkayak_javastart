package sec06.exam03_Array_Length;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//배열의 길이는 읽기 전용이기 때문에 intArray.length = 10;같이 삽입하는 경우는 불가능
		// for문을 몇 번 반복할지 결정할 때 많이 사용
		int[] scores = {83,90,87};
		int sum=0;
		for(int i =0; i<scores.length; i++) { //length는 배열의 필드(파이널필드) 한 번 값이 저장되면 수정이 안됨 :읽기전용
			sum += scores[i];
		}
		System.out.println("총합 "+ sum);
		double avg= (double)sum / scores.length;//직접 개수를 세지 않고 length로 줌
		System.out.println("평균 " + avg);
	}

}
