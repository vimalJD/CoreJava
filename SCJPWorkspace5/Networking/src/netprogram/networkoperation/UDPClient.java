/*This programs demonstrates displaying the server date on the client,
using datagram packet and datagram socket classes.*/
package netprogram.networkoperation;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPClient {

	public static void main(String[] args) {

		try {

			String strDate;
			DatagramSocket ds = new DatagramSocket(5555);
			byte rdata[] = new byte[64];

			DatagramPacket packet = new DatagramPacket(rdata, rdata.length);

			while (true) {

				ds.receive(packet);
				strDate = new String(packet.getData());
				System.out.println("Server date and time is : " + strDate);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: " + e);
		}
	}
}
