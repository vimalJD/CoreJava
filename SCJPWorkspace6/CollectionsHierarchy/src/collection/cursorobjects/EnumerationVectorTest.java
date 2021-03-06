package collection.cursorobjects;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationVectorTest {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(10);
		v.add("JAVA");
		v.add("JSP");
		v.add("SERVLET");
		v.add("C");
		v.add("SQL");
		v.add("MENUAL TESTING");

		// Create Enumeration
		
		Enumeration e = v.elements();
		
		System.out.println("The Enumeration List are: ");
		
		while (e.hasMoreElements()) {
			
			Object obj = e.nextElement();
			System.out.println(obj);
		}
	}
}
