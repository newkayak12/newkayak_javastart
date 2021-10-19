package systemin_out;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInExample {
	public static void main(String[] args) {
		System.out.println("==메뉴==");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 종료 하기");
		System.out.print("메뉴를 선택하세요  ");
		InputStream is = System.in;

		char input = 0;
		try {
			input = (char) is.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		switch(input){
			case '1':
				System.out.println("예금 조회 선택");
			break;

			case '2':
				System.out.println("예금 출금 선택");
			break;
			case '3':
				System.out.println("예금 입금 선택");
			break;
			case '4':
				System.out.println("종료 하기 선택");
			break;
		}
	}
}
