package inherit5nonstatic1constructor;

public class B3 extends A3 {

	int b = m2();

	int m2() {

		System.out.println("class B Non Static Variable");
		return 20;
	}

	{

		System.out.println("class B Non static Block");
	}

	public B3() {
		System.out.println("class B Constructor");
	}

	public static void main(String[] args) {

		System.out.println("B main");

		B3 b3 = new B3();

		System.out.println("\nB main a: " + b3.a);

		System.out.println("B main b: " + b3.b);
	}
}
