package file.custserializaion;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestCustDesirealization {

public static void main(String[] args) throws Exception {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"));
		
//		Address add = new Address(192, "valsad");
//		
//		Student s = new Student(101, "Vimal", add);
		
		Object obj = ois.readObject(); 
		
		System.out.println(obj);
		
	}
}
