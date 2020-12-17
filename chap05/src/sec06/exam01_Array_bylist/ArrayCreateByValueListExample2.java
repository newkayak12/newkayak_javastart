package sec06.exam01_Array_bylist;

public class ArrayCreateByValueListExample2 {
public static void main(String[] args) {
int[] scores;
scores = new int[] {83,90,87}; //변수명 = new 변수타입 [] {값들}
int sum1=0;
for (int i=0; i<=2; i++) {
	sum1 += scores[i];
}
System.out.println("총 합은 " + sum1);
int sum2 = add(new int[] {83,90,87});
//새로운 변수타입 변수 이름 = add(new 연산자 + int[] {scores 매개변수})이런 방법으로 메소드를 만들고 사용함
System.out.println("총 합은 " + sum2);
}


//메소드 연습

public static int add(int[] scores) {
	int sum1=0;
	for (int i=0; i<=2; i++) {
		sum1 += scores[i];
	}
	return sum1; //메소드의 값을 산출하는데 return을 쓰는구나
}
}
