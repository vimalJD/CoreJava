package annonymous.innerclasses;

class Example1 {

	static int a = 10;
	int x = 20;

	void m1() {

		int p = 30;

		final int q = 40;

		new Thread() {

			void m1() {
				System.out.println(a);
				System.out.println(x);
//				System.out.println(p);
				System.out.println(q);
			}
		};
	}
}
