package methodlocal.innerclass;

class A4 {

	int x = 1;

	void m1() {
		final int x = 2;

		class B4 {

			int x = 3;

			void m2() {
				System.out.println(x);

				int x = 4;

				System.out.println(x);
				System.out.println(this.x);
				System.out.println(B4.this.x);
				System.out.println(A4.this.x);
			}
		}

		B4 b = new B4();
		b.m2();

		System.out.println("after creating object b");
		System.out.println(x);
		System.out.println(b.x);
		System.out.println(this.x);
	}

	public static void main(String[] args) {

		A4 a = new A4();
		a.m1();
	}
}
