package file.datainoutstream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DISDemo {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("data.txt");
		DataInputStream dis = new DataInputStream(fis);

		int i1 = dis.readInt();
		float f1 = dis.readFloat();
		char ch1 = dis.readChar();
		boolean bo1 = dis.readBoolean();
		String s1 = dis.readUTF();

		System.out.println(i1);
		System.out.println(f1);
		System.out.println(ch1);
		System.out.println(bo1);
		System.out.println(s1);

	}
}
