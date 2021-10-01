package fun.currentobj;

public class A {

	public static void m1(Object object) {

		String name = object.getClass().getName();

		System.out.println("The passed object is of type: " + name);
	}
}
