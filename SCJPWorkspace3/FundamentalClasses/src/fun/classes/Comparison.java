package fun.classes;

public class Comparison {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		int z = 10;

		// Comparing primitive values using "==" operator
		System.out.println(x == y);
		System.out.println(x == z);
		System.out.println();

		// Comparing objects using "==" operator
		Example3 e1 = new Example3();
		Example3 e2 = new Example3();
		Example3 e3 = e2;

		System.out.println(e1 == e2);
		System.out.println(e2 == e3);
		System.out.println();

		boolean bo = true;
//		System.out.println(x==bo);

		Test2 t1 = new Test2();
//		System.out.println(e1==t1);

		// Comparing objects using equals method those(Example) are created in this
		// class.
		System.out.println("Comparison with method");
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e1.equals(t1));
		System.out.println();

		// Compare two nulls using == operator
		// case #1: Comparing null with other null returns true
		System.out.println("Compare two nulls using == operator");
		System.out.println(null == null);

		// case #2: Comparing null with null reference variable returns true
		Example3 e4 = null;
		System.out.println(null == e4);

		// case #3: Comparing null with object reference variable returns false
		Example3 e5 = new Example3();
		System.out.println(null == e5);

		// case #4: Comparing null with object also returns false
		System.out.println(null == new Example3());
		System.out.println();

		// Comparing two nulls using equals method
		// case #5: we can not invoke method using null, it leads CE
		System.out.println("Comparing two nulls using equals method");
//		System.out.println(null.equals(null));

		// case #6: we can not invoke method using null reference variable, it leads
		// Exception NPE
		/*Example3 e6 = null;
		System.out.println(e6.equals(null));*/

		// case #7: we can not invoke equals() method by passing null, result false
		Example3 e7 = new Example3();
		System.out.println(e7.equals(null));
	}
}
