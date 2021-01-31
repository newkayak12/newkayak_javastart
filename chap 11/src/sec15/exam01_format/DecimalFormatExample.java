package sec15.exam01_format;

import java.text.*;

public class DecimalFormatExample {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		//0소수점 이하는 반올림(버릴건 버리고 올릴건 올리고)
		System.out.println(df.format(num));
		
		DecimalFormat df2 = new DecimalFormat("0000000000.00000");
		System.out.println(df2.format(num));
		
//		0으로 채우면 0이 그대로 나옴(자리수를 벗어나면)
		
		DecimalFormat df3 = new DecimalFormat("##########.#####");
		System.out.println(df3.format(num));
		
		
		DecimalFormat df4 = new DecimalFormat("#,###,###,###.#####");
		System.out.println(df4.format(num));
		
//		#을 넣으면 자리수가 넘어가면 출력 X
	}

}
