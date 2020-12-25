package 확인문제;

public class _04_WhileDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*While문과 Math.radom() 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (x,y)형태로 출력하고 눈의 합이 5가 아니면 계속 주사위를 던지고
 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요*/
		
		// Math.random 은 0<= random <1
		// break 는 do-while, while, for에서 사용 간으
		int diceX=0; 
		int diceY=0; 
		
		while((int)diceX + (int)diceY != 5) { //그냥 true로 놓으면 되는거 같은데?
			diceX = (int) (Math.random()*6)+1;
			diceY = (int) (Math.random()*6)+1;
			
			if((int)diceX + (int)diceY == 5) {
				System.out.println("주사위의 눈의 합이 5가 되는 경우 " +"(" +  diceX + "." +diceY +")");
				break;
			} else {
			System.out.println("주사위의 눈의 합이 5가 안되는 경우 " +"(" +  diceX + "." +diceY +")");}
		}
		System.out.println("(" + diceX + "." + diceY + ")");
	}

}
