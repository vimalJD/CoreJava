package inner.classes;

class Example4 {

	static int a = 10;
	int x = 20;

	static class B {

		static int a = 50;
		int x = 60;

		void m1() {
			System.out.println(a);
			System.out.println(x);

			Example4 e = new Example4();
			System.out.println(Example4.a);
			System.out.println(e.x);
		}
	}

	void m2() {
		System.out.println(a);
		System.out.println(x);

		B b = new B();
		System.out.println(B.a);
		System.out.println(b.x);
	}

	public static void main(String[] args) {

		Example4 e = new Example4();
		e.m2();

		B b = new B();
		b.m1();

	}
}
