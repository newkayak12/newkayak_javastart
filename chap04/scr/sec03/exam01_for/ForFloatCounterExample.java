package sec03.exam01_for;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*for(float x=0.1f; x<=1.0f; x+=0.1f) {
	System.out.println(x);
}*/
		//float이 0.1 처리를 제대로 못하기 때문, 부동소수계산에서의 결함

/*for(int y =1; y<=10; y++) {
	System.out.println((float)y*0.1);
}*/
   // 이것도 문제가 생기네? 0.30000000004라던지하는 식으로

for(int z=1; z<=10; z++) {
	System.out.println((float)z/10);
}
	//0.1을 곱하는거랑 10으로 나누는거랑 다르게 받아들이는구나... /10이 정수계산이니까... 하긴 *0.1의 0.1역시 부동소수 처리되니까 그런거 같네
	}

}
