package staticnonsuper;

public class B18 extends A18 {

	static int a = 50;
	int x = 60;

	static void m1() {
		System.out.println("B m1");
	}

	void m2() {
		System.out.println("B m2");

		System.out.println("B a: " + a);
		System.out.println("B x: " + x);
	}

	/*
	 * void m3() {
	 * 
	 * System.out.println(a); super.a = a - 10; System.out.println(super.a);
	 * 
	 * System.out.println(x); super.x = x - 10; System.out.println(super.x); }
	 */

	void m4() {

		System.out.println(a);
		super.a = a - 10;
		System.out.println(super.a);

		System.out.println(x);
		super.x = x - 10;
		System.out.println(super.x);
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * B18 b1 = new B18();
	 * 
	 * b1.m4(); System.out.println(b1); }
	 */
}
