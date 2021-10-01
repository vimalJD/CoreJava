package methodlocal.innerclass;

class A1 {

	Example m1() {

		class B implements Example {

			public void m3() {
				System.out.println("B m3");
			}
		}

		B b = new B();

		m2(b);
		return b;
	}

	void m2(Example example) {

		example.m3();
	}
}
