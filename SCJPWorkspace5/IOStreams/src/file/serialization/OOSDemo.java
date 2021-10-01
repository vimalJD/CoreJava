package file.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class OOSDemo {

	public static void main(String[] args) throws Exception {

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.ser"));

		B b = new B();
		b.x = 70;
		b.y = 80;

		System.out.println("x,y values are changed to 70, 80");
		oos.writeObject(b);
		System.out.println("B object is written to file");

	}
}
