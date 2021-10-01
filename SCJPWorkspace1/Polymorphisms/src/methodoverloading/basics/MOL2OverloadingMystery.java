package methodoverloading.basics;

public class MOL2OverloadingMystery {

	public static void main(String[] args) {

		CalleeImpl cl = new CalleeImpl();

		Object obj1 = new Object();
		Object obj2 = "Vimal";
		Object obj3 = new Integer(9269);

		cl.foo(obj1);
		cl.foo(obj2);
		cl.foo(obj3);

		System.out.println();
		cl.foo("VAP");
		cl.foo(9269);

		System.out.println();
		cl.foo((String) obj2);
		cl.foo((Integer) obj3);

		System.out.println();
//		cl.foo((String) obj1);
//		cl.foo((Integer) obj1);
//		cl.foo((String) obj3);
//		cl.foo((Integer) obj2);
	}
}
