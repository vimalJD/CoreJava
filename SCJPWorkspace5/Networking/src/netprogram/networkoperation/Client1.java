/* This program demonstrates printing a message on to the client,
 whenever client gets connected to the server.*/

package netprogram.networkoperation;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class Client1 {

	public static void main(String[] args) {

		try {

			Socket s = new Socket("localhost", 4444);

			InputStream in = s.getInputStream();

			DataInputStream dis1 = new DataInputStream(in);

			String msg1 = dis1.readLine();
			System.out.println("Server message is: " + msg1);
			dis1.close();
			s.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: " + e);
		}
	}
}
