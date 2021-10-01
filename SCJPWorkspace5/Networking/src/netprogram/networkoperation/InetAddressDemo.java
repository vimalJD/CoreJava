package netprogram.networkoperation;

import java.net.InetAddress;

public class InetAddressDemo {

	public static void main(String[] args) {

		try {

			InetAddress add = InetAddress.getLocalHost();
			System.out.println("\nLocal host details: " + add);
			System.out.println("The host IP Address is: " + add.getHostAddress());
			System.out.println("above is the IPv4 Address");
			System.out.println("The host name is: " + add.getHostName());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: " + e);
		}
	}
}
