package annonymous.innerclasses;

public class TestExample2 {

	public static void main(String[] args) {

		Example2 example2 = new Example2() {

			@Override
			public void m1() {
				System.out.println("Anonymous overriding method m1");
				m2();

			}

			public void m2() {
				System.out.println("Anonymous own method m2");

			}
		};

		example2.m1();
//		example2.m2();
	}
}
