package typesofvariables;

public class StaticAsLocal1 {

	public static void m1(int p) {

		int q = 10;

		if (p == 10) {

			int r = 20;
			System.out.println("in if condition");
			System.out.println(p);
			System.out.println(q);
			System.out.println(r);
		}
		System.out.println("out of if condition");
		System.out.println(p);
		System.out.println(q);
		// local variable of if condition so it leads CE
		// System.out.println(r);
	}

	public static void main(String[] args) {
		m1(10);
		m1(20);
	}

}
