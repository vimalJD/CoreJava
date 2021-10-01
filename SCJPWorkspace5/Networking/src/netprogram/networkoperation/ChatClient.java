//This is an online application.
package netprogram.networkoperation;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) {

		Socket s1;
		OutputStream os;
		InputStream is;
		DataOutputStream dos;
		DataInputStream dis;
		String sendMsg, receiveMsg;

		try {

			s1 = new Socket("localhost", 5555);
			os = s1.getOutputStream();
			is = s1.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			while (true) {

				sendMsg = br.readLine();
				dos.writeUTF(sendMsg);
				receiveMsg = (String) dis.readUTF();
				System.out.println(receiveMsg);

				if (receiveMsg.equals("bye")) {
					break;
				}
			}

			dis.close();
			dos.close();
			is.close();
			os.close();
			s1.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
