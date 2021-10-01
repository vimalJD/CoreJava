package nonstatic.inner.classes;

class A {

	int x = 20;

	class B {
		int x = 50;

		void m1() {

			System.out.println(x);
			System.out.println(this.x);
			System.out.println(A.this.x);
			System.out.println("inner m1 executed");
		}

		void m2() {
			int x = 60;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(A.this.x);
			System.out.println("inner m2 executed");
		}
	}

	void m3() {

		System.out.println(x);

		B b = new B();
		System.out.println(b.x);
		System.out.println("outer m3 executed");
	}

	public static void main(String[] args) {

		A a = new A();
		a.m3();

		A.B b = new A().new B();
		b.m1();
		b.m2();

	}
}
