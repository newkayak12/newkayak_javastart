package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

public class ClientExample {
	public static void main(String[] args) {
		Socket socekt = null;

		socekt = new Socket();
		System.out.println("request");
		try {
			socekt.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("connected!!!!!!!!!!!!!!!!!");


			byte[] bytes = null;
			String message = null;

			OutputStream os = socekt.getOutputStream();
			message = "HELLO SERVER";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("sended");

			InputStream is= socekt.getInputStream();
			bytes = new byte[100];
			int readByCount = is.read(bytes);
			message = new String(bytes, 0, readByCount, "UTF-8");
			System.out.println("received " +message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(!socekt.isClosed()){
			try {
				socekt.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
