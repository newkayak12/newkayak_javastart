package sec06.exam05_Array_in_Array;

public class ArrayinArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] mathScores = new int[2][3]; //2�� 3�� 2���� �迭
for(int i=0; i<mathScores.length; i++) {  //math~.length �� 2 [0],[1]
	for(int k=0; k<mathScores[i].length; k++) { //math~.length �� 3 [0],[1],[2]
		System.out.println("scoresMath[" + i + "][" + k + "] = " + mathScores[i][k]);// default �� 0�� �� ����
	}
}
System.out.println();

int[][] englishScores = new int[2][];
englishScores[0] = new int[2];
englishScores[1] = new int[3];
 
for(int i=0; i<englishScores.length; i++) {  //englishScores �� 2 [0],[1]
	for(int k=0; k<englishScores[i].length; k++) { //englishScores �� [0]�϶� 2 [0],[1], [1]�϶� 3 [0],[1],[2]
		System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);// default �� 0�� �� ����
	}
	}
System.out.println();
int[][] javaScores = {{95,80}, 	{92,96,80}};
for(int i=0; i<javaScores.length; i++) {  //javaScores �� 2 [0],[1]
	for(int k=0; k<javaScores[i].length; k++) { //javaScores �� [0]�϶� 2�� {95, 80} , [1]�϶� 3�� {92,96,80}
		System.out.println("englishScores[" + i + "][" + k + "] = " + javaScores[i][k]);// default �� 0�� �� ����
	}
	}
	}
}
