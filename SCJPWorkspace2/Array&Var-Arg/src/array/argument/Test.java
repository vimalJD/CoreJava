package array.argument;

public class Test {

	public static void main(String[] args) {

		// calling m1() by passing array object with explicit values
		int[] i1 = { 5, 3, 6, 7 };
		// calling m1() by passing referenced array objects
		Example.m1(i1);

		// calling m1() by passing array object with default values
		int[] i2 = new int[5];
		Example.m1(i2);

		// calling m1() by passing unreferenced array objects
		Example.m1(new int[7]);
//		Example.m1({1,2});

		// we can pass an array with user values without referenced variables
		// using anonymous array
		Example.m1(new int[] { 1, 2, 3 });

		// anonymous array can also be created with referenced variable
		int[] ia = new int[] { 1, 2, 3 };
		Example.m1(ia);
		// but it is not recommended so follow 22 line number code

	}
}
