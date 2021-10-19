package systemin_out;

import java.io.InputStream;
import java.util.Arrays;

public class SystemInExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;

		byte[] datas = new byte[100];

		System.out.print("이름 : ");
		int nameBytes = is.read(datas);
		String name = new String(datas, 0, nameBytes-1);
							//LF, CR 때문에 2바이트 뺴는데  OSX라 그런가 1바이트를 뺴야하네

		System.out.print("하고 싶은 말 : ");
		int commentBytes = is.read(datas);
		String comment = new String (datas, 0, commentBytes-1);

		System.out.println("이름 : "+name);
		System.out.println("이름 : "+comment);
	}
}
