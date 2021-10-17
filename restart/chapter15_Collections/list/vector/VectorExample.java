
package list.vector;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	/*
		ArrayList와 같은 내부구조, Tread-Safe
	*/
	public static void main(String[] args) {
		List<Board> list = new Vector<>();

		for(int i = 1; i<=10; i++){
			list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
		}
		list.remove(2);
		list.remove(3);

		for(int i=0; i<list.size(); i++){
			Board board = list.get(i);
			System.out.println(board);
		}
	}
}
