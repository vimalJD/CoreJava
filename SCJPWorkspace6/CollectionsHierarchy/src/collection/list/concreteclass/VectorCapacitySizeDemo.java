package collection.list.concreteclass;

import java.util.Vector;

public class VectorCapacitySizeDemo {

	public static void main(String[] args) {

		Vector v = new Vector(6);

		System.out.println("Initial capacity and size of vector is..");
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size: " + v.size());

		System.out.println();

		Customer c1 = new Customer("Newton", 30, new Address("2-3-102/1", "Ahmedabad", "Gujarat", "12345"));

		Customer c2 = new Customer("Einstene", 23, new Address("1-10-1002/3", "Valsad", "Gujarat", "23345"));

		Customer c3 = new Customer("Vimal", 28, new Address("1-3-105/1", "Valsad", "Gujarat", "52345"));

		Customer c4 = new Customer("Pritam", 28, new Address("5-3-105/1", "Vapi", "Gujarat", "56345"));

		Customer c5 = new Customer("Vimal1", 28, new Address("1-3-105/1", "Navsari", "Gujarat", "52389"));

		Customer c6 = new Customer("Vimal2", 28, new Address("1-3-105/1", "Valsad", "Gujarat", "15455"));

		Customer c7 = new Customer("Vimal3", 28, new Address("1-3-105/1", "Surat", "Gujarat", "52615"));

		v.add(c1);
		v.add(c2);

		System.out.println("Reached its Capacity or not?");
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size: " + v.size());
		System.out.println();

		v.add(c3);
		System.out.println("Reached its Capacity or not?");
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size: " + v.size());
		System.out.println();

		v.add(c4);
		System.out.println("Reached its Capacity or not?");
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size: " + v.size());
		System.out.println();

		v.add(c5);
		v.add(c6);
		System.out.println("Reached its Capacity or not?");
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size: " + v.size());
		System.out.println();

		v.add(c7);
		System.out.println("Reached its Capacity or not?");
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size: " + v.size());
		System.out.println();

		System.out.println("The customer labels are: ");
		System.out.println();

		for (int i = 0; i < v.size(); i++) {

			System.out.println(v.get(i));
			System.out.println();
		}
	}
}
