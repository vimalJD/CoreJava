package inner.classes;

class Example {

	static int a = 10;
	int x = 20;
	private int y = 30;

	static class A {

		public static void main(String[] args) {

			System.out.println(a);
			/*
			 * System.out.println(x); System.out.println(y);
			 */

			Example example = new Example();
			System.out.println(example.a);
			System.out.println(example.x);
			System.out.println(example.y);

		}
	}
}
