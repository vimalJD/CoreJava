package collection.list.concreteclass;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String args[]) {

		// creating an ArrayList
		
		ArrayList al = new ArrayList();
		System.out.println("Initial size of ArrayList: " + al.size());

		// adding elements to the arraylist

		al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add("Pink");
		al.add("Orange");

		System.out.println("\nSize of ArayList after additions: " + al.size());

		// Displaying the ArrayList
		System.out.println("\nContents of ArrayList after add: " + al);

		// Removing 4th index element
		al.remove(4);
		System.out.println("\nContents of ArrayList after remove index: " + al);

		// removing pink element
		al.remove("Pink");
		System.out.println("\nContents of ArrayList after remove object: " + al);
		System.out.println("\nSize of ArrayList after deletions: " + al.size());

		// retrieving 1st index element

		String alElement = (String) (al.get(1));
		System.out.println("alElement: " + alElement);

		// inserting at 2nd index
		al.add(2, alElement + ", rose");
		System.out.println(al);

	}

}
