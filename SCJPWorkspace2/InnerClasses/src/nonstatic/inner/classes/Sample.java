package nonstatic.inner.classes;

class Sample {

	class B {

		void m1() {

			System.out.println("B m1");
		}
	}

	void m2() {

		B b = new B();
		b.m1();
	}

	public static void main(String[] args) {

		Sample.B b = new Sample().new B();
		b.m1();
	}
}
