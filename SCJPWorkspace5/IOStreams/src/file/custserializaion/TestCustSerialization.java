package file.custserializaion;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestCustSerialization {

	public static void main(String[] args) throws Exception {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.ser"));
		
		Address add = new Address(192, "valsad");
		
		Student s = new Student(101, "Vimal", add);
		
		oos.writeObject(s);
		
		System.out.println("s object is written to file");
		
		
	}
}
