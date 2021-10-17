package list.arrayList;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("JAVA");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add("Database");
		list.add("myBatis");

		int size = list.size();
		System.out.println("총 객체 수 : "+size);
		System.out.println();


		//,, 중략
	}
}
