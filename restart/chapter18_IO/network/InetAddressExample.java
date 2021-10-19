package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local.getHostName() + " : " +local.getHostAddress());
			InetAddress[] iaArr = InetAddress.getAllByName("www.apple.com");
			for(InetAddress inet : iaArr){
				System.out.println(inet.getHostAddress());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
