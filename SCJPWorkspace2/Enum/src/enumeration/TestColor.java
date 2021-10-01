package enumeration;

class TestColor {

	public static void main(String[] args) {

		System.out.println("Test main");

		// accessing named constants
		System.out.println(Color.RED);
		System.out.println(Color.BLUE);

		// accessing static members
		System.out.println(Color.a);
		Color.m1();

		// accessing non-static members
		System.out.println(Color.RED.x);
		System.out.println(Color.BLUE.x);
		System.out.println(Color.GREEN.x);

		Color.RED.m2();
		Color.BLUE.m2();
		
	}
}
