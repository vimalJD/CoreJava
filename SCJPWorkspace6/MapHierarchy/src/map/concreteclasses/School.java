package map.concreteclasses;

import java.util.LinkedHashSet;

public class School {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(new Student(1, "Balayya", 1));
		lhs.add(new Student(2, "Vimal", 1));
		
		lhs.add(new Student(2, "Balayya", 2));
		lhs.add(new Student(1, "vimal", 2));
		lhs.add(new Student(3, "Vaibhav", 1));
		lhs.add(new Student(3, "Vaibhav", 1));
		
		lhs.add(new Integer(8));
		lhs.add(new Integer(10));
		lhs.add(new String("a"));
		
		System.out.println(lhs);
		
		lhs.remove(new Student(3, "Vaibhav", 1));
		System.out.println("\nafter removing");
		System.out.println(lhs);
	}
}
