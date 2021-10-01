package methodlocal.innerclass;

class A2 {

	static int a = 10;
	int b = 10;

	static void m1(final int c, int d) {

		final int e = 10;

		int f = 10;

		class B1 {

			void m1() {
				System.out.println(a);
//				System.out.println(b);
				System.out.println(c);
//				System.out.println(d);
				System.out.println(e);
//				System.out.println(f);
			}
		}

		/*
		 * void m2() { class C1 {
		 * 
		 * void m2() { System.out.println(a); // System.out.println(b);
		 * 
		 * } } }
		 */
	}

	void m2() {
		class C1 {

			void m2() {
				System.out.println(a);
				System.out.println(b);

			}
		}
	}

	public static void main(String[] args) {

		System.out.println("in main");

		System.out.println("content of object a");
		A2 a = new A2();
		a.a = 5;
		a.b = 6;
		a.m1(10, 10);
		a.m2();

		System.out.println("content of object a1");
		A2 a1 = new A2();
		a1.a = 7;
		a1.b = 8;
		a1.m1(20, 20);
		a1.m2();
	}
}
