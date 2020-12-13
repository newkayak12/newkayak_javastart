package sec03.exam04_Break;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//조건에 안맞으면 continue로 return 할 수가 있네...
		//예를들면 1~10까지 print 걸어놓고 중간에 조건, continue로 필터링할 수 있네 
		//게시판 필터링 같은 곳에서 쓸수 있으려나?
		
		for(int i =1; i<=10; i++) {
			
			if(i%2 != 0) { //if 조건에 =를 집어 넣으면 안되네 !=나 <=같은걸 집어넣어야 되네 이러면 while을 쓰지.
				continue;
			}
			
			System.out.println(i+"는 짝수입니다.");
		}
	}

}
