package sec03.exam02_While;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
int i=1; // 변수 선언 위치나 증감 위치가 다르긴한데
while(i<=100) {
	
	sum +=i;
	i++;
	
}
System.out.println("1~" + (i-1) + "까지의 합 " +  sum);
	}

}
