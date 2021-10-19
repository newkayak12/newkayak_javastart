package systemin_out;

import java.io.OutputStream;

public class SystemOutExample {
	public static void main(String[] args) throws Exception{
		OutputStream os = System.out;

		System.out.println("byte 48~58");
		for(byte b = 48; b<58; b++){
			os.write(b);
		}

		os.write(10);

		System.out.println("byte 97~123");
		for(byte b =97; b<123; b++){
			os.write(b);
		}

		os.write(10);

		System.out.println("korean");
		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		os.flush();
	}
}
