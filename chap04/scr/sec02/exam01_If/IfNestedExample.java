package sec02.exam01_If;

public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int score= 95;
int score = (int)(Math.random()*20) +81;
String grade;
System.out.println("점수는 " + score + " 점입니다.");
		
if(score>=90) {
	if(score>=96) {
		grade= "A+";
	} else {
		grade= "A";
	
	}
} else {
	if(score>=85) {
		grade="B+";
	}else {
		grade="B";
	}
}
System.out.println("성적은 " + grade + " 입니다.");
	}

}
