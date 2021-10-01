package inner.classes;

class TestExample4 {

	public static void main(String[] args) {

		Example4 e1 = new Example4();

		Example4.B b1 = new Example4.B();

		System.out.println(Example4.a);
		System.out.println(Example4.B.a);

		System.out.println(b1.x);
		System.out.println(e1.x);
	}
}
