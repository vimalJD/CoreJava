package netprogram.networkoperation;

import java.net.URL;

public class URLDemo {

	public static void main(String[] args) {

		try {

			URL u = new URL("http://VimalHP:53541/Example.java");

			System.out.println("\nProtocol(): " + u.getProtocol());
			System.out.println("\nHost(): " + u.getHost());
			System.out.println("\nPort(): " + u.getPort());
			System.out.println("\nFile(): " + u.getFile());
			System.out.println("\nPath: " + u.toExternalForm());

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: " + e);
		}
	}
}
