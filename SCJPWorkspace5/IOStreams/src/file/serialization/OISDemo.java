package file.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class OISDemo {

	public static void main(String[] args) throws Exception {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"));
		
		Object obj = ois.readObject();
		
		System.out.println(obj);
	}
}
