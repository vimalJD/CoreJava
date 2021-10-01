package inner.classes;

class Example2 {

	static class A {

		static int a = 10;

		int x = 20;

		private int y = 30;

	}
}

class Sample2 {

	public static void main(String[] args) {

		System.out.println("a: " + Example2.A.a);

		Example2.A a1 = new Example2.A();

		System.out.println("x: " + a1.x);
//		System.out.println("y: "+a1.y);
	}
}