package nonstaticmembers;

public class ObjectAsArgument {

	int x = 10;
	int y = 20;

	void m2(ObjectAsArgument objectAsArgument, ObjectAsArgument objectAsArgument4) {

		System.out.println("Passed object original values: ");

		System.out.println(x + "...." + y);
		x = 5;
		y = 6;
		System.out.println(x + "...." + y);
		System.out.println("Object original values after modification: ");

		System.out.println("Passed object original values: ");
		System.out.println(objectAsArgument4.x + "...." + objectAsArgument4.y);

		objectAsArgument4.x = 7;
		objectAsArgument4.y = 8;

		System.out.println(objectAsArgument4.x + "...." + objectAsArgument4.y);

		System.out.println("Object original values after modification: ");

	}

	@Override
	public String toString() {
		return "ObjectAsArgument [x=" + x + ", y=" + y + "]";
	}

	public static void main(String[] args) {

		ObjectAsArgument objectAsArgument1 = new ObjectAsArgument();
//		System.out.println("objectAsArgument1: " + objectAsArgument1);

		ObjectAsArgument objectAsArgument2 = new ObjectAsArgument();

//		System.out.println("objectAsArgument2: " + objectAsArgument2);

		System.out.println("objectAsArgument1 object values before calling m2(): ");
		System.out.println(objectAsArgument1.x + "....." + objectAsArgument1.y);
		System.out.println("objectAsArgument2 object values before calling m2(): ");
		System.out.println(objectAsArgument2.x + "....." + objectAsArgument2.y);
		/*
		 * ObjectAsArgument objectAsArgument3 = new ObjectAsArgument();
		 * System.out.println("objectAsArgument3: " + objectAsArgument3);
		 */

		objectAsArgument1.m2(objectAsArgument1, objectAsArgument2);

		System.out.println("objectAsArgument1 object values after calling m2(): ");
		System.out.println(objectAsArgument1.x + "....." + objectAsArgument1.y);
		System.out.println("objectAsArgument2 object values after calling m2(): ");
		System.out.println(objectAsArgument2.x + "....." + objectAsArgument2.y);
	}
}
