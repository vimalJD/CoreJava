package map.concreteclasses;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;

public class College {

	public static void main(String[] args) throws Exception {

		LinkedHashMap lhm = new LinkedHashMap();

		lhm.put(new Student(11, "Vimal", 11), new Address(1, 2, "Valsad"));
		lhm.put(new Student(11, "Akshay", 12), new Address(1, 3, "Valsad"));

		lhm.put(new Student(12, "Pritam", 11), new Address(12, 30, "Vapi"));
		lhm.put(new Student(12, "Vimal", 12), new Address(14, 30, "Vapi"));

		// storing student information in file permanently for future reference
		FileOutputStream fos = new FileOutputStream("studentinfo.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(lhm);
		System.out.println("\n Student info is saved");
	}
}
