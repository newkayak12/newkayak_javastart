package sec06.exam05_Array_in_Array;

public class ArrayinArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] mathScores = new int[2][3]; //2행 3열 2차원 배열
for(int i=0; i<mathScores.length; i++) {  //math~.length 는 2 [0],[1]
	for(int k=0; k<mathScores[i].length; k++) { //math~.length 는 3 [0],[1],[2]
		System.out.println("scoresMath[" + i + "][" + k + "] = " + mathScores[i][k]);// default 로 0이 들어가 있음
	}
}
System.out.println();

int[][] englishScores = new int[2][];
englishScores[0] = new int[2];
englishScores[1] = new int[3];
 
for(int i=0; i<englishScores.length; i++) {  //englishScores 는 2 [0],[1]
	for(int k=0; k<englishScores[i].length; k++) { //englishScores 는 [0]일때 2 [0],[1], [1]일때 3 [0],[1],[2]
		System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);// default 로 0이 들어가 있음
	}
	}
System.out.println();
int[][] javaScores = {{95,80}, 	{92,96,80}};
for(int i=0; i<javaScores.length; i++) {  //javaScores 는 2 [0],[1]
	for(int k=0; k<javaScores[i].length; k++) { //javaScores 는 [0]일때 2개 {95, 80} , [1]일때 3개 {92,96,80}
		System.out.println("englishScores[" + i + "][" + k + "] = " + javaScores[i][k]);// default 로 0이 들어가 있음
	}
	}
	}
}
