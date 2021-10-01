package inner.classes;

class Example1 {

	int x = 10;

	static class A {

		static void m1() {

			A a = new A();
//			System.out.println(a.x);

			Example1 example1 = new Example1();
			System.out.println(example1.x);
		}
	}
}
