package differentiate.refvariable;

public class TestAB7 {

	public static void main(String[] args) {

		B7 b = new B7();
		A7 a = new A7();

		System.out.println(b.x + "...." + b.y);
		System.out.println(a.x + "...." + a.y);

		b.x = 5;
		a.x = 6;

		System.out.println(b.x + "...." + b.y);
		System.out.println(a.x + "...." + a.y);
	}
}
