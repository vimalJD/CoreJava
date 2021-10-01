package methodlocal.innerclass;

class A3 {

	void m1() {

		final int x = 2;

		class B3 {

			void m2() {
				System.out.println("In B m2 x: " + x);

				int x = 4;

				System.out.println("In B m2 x: " + x);

			}
		}

		B3 b = new B3();
		b.m2();

	}

	public static void main(String[] args) {

		System.out.println("in main");

		System.out.println("content of object a");
		A3 a = new A3();
		a.m1();
	}

}
