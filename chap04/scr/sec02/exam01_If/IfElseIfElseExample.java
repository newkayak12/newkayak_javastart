package sec02.exam01_If;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int score = 75;

if(score>=90) {
	System.out.println(score + "점으로 A등급입니다.");
	
}else if(score>=80){
	System.out.println(score + "점으로 B등급입니다.");
	
}else if(score>=70) {
	System.out.println(score + "점으로 C등급입니다.");
	
}else {
	 System.out.println(score + "점으로 F등급입니다.");
}
	}

}
