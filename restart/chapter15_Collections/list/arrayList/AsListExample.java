package list.arrayList;
import java.util.Arrays;
import java.util.List;


public class AsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
		for(String name : list1){
			System.out.println(name);
		}

		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int val : list2){
			System.out.println(val);
		}
	}
}
