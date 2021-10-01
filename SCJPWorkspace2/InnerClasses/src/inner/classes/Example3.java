package inner.classes;

class Example3 {

	static {
		System.out.println("outer class is loaded");
	}

	Example3() {
		System.out.println("Outer class constructor");
	}

	static class A {

		static {
			System.out.println("inner class is loaded");
		}

		A() {
			System.out.println("Inner class constructor");
		}

		static void m1() {
			System.out.println("Inner class static method");

		}

		void m2() {
			System.out.println("Inner class Non static method");
		}

		public static void main(String[] args) {

			System.out.println("inner class main");

//			Example3.m1();

			Example3 example3 = new Example3();

//			example3.m1();

		}
	}

	static void m3() {
		System.out.println("Outer class SM");
	}

	void m4() {
		System.out.println("Inner class NSM");
	}

	public static void main(String[] args) {
		System.out.println("outer class main");

//		A.m3();

		A a = new A();
//		a.m4();
	}
}
