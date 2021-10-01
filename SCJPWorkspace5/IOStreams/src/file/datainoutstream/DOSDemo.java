package file.datainoutstream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DOSDemo {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("data.txt");
		DataOutputStream dos = new DataOutputStream(fos);

		dos.writeInt(97);
		dos.writeFloat(3.14f);
		dos.writeChar('a');
		dos.writeBoolean(true);
		dos.writeUTF("Vimal");

		System.out.println("data has been written to file");
	}
}
