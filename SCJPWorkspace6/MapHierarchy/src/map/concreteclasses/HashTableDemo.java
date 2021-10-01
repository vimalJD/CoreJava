package map.concreteclasses;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable();
		
		ht.put("Tom", new Double(10.50));
		ht.put("Henery", new Double(12.25));
		ht.put("Scott", new Double(8.75));
		
		System.out.println("ht elements: "+ht);
		
		Enumeration e = ht.keys();
		System.out.println("Eamployee name \t\t Employee Sal");
		
		while (e.hasMoreElements()) {
			
			String key = (String) e.nextElement();
			System.out.println(key+"\t\t"+ht.get(key));
		}
		System.out.println();
		
		double sal= ((Double)ht.get("Scott")).doubleValue();
		
		sal+=11.25;
		
		ht.put("Kean", new Double(sal));
		ht.put("Scott", new Double(sal));
		
		e = ht.keys();
		System.out.println();
		System.out.println("The change values are: ");
		
		while (e.hasMoreElements()) {
			
			String key = (String) e.nextElement();
			System.out.println(key+"\t\t"+ht.get(key));
		}
	}
}
