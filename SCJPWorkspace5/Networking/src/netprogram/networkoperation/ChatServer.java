package netprogram.networkoperation;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {

		ServerSocket ss;
		Socket s1;
		OutputStream os;
		InputStream is;
		DataOutputStream dos;
		DataInputStream dis;
		String sendMsg, receiveMsg;

		try {

			ss = new ServerSocket(5555);
			System.out.println("This is online chatting done on java");
			s1 = ss.accept();
			os = s1.getOutputStream();
			is = s1.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			while (true) {

				receiveMsg = (String) dis.readUTF();
				System.out.println(receiveMsg);

				if (receiveMsg.equals("bye")) {
					break;
				}
				sendMsg = br.readLine();
				dos.writeUTF(sendMsg);
			}
			dis.close();
			dos.close();
			os.close();
			is.close();
			ss.close();
			s1.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
