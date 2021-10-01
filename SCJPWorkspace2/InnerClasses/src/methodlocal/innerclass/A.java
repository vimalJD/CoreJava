package methodlocal.innerclass;

class A {

	static void m1() {

//		B b2 = new B();

		class B {
			int x = 10;
		}

		B b = new B();
		System.out.println(b.x);
	}

	static void m2() {

//		B b1 = new B();
	}

	public static void main(String[] args) {
		m1();
	}
}
