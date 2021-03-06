package abstractclass.method;

public class Sample extends Example {

	static int b = 30;
	int y = 40;

	static {
		System.out.println("Sample static block");
	}

	{
		System.out.println("Sample Non-static block");
	}

	public Sample() {
		System.out.println("Sample constructor");
	}

	static void m4() {
		System.out.println("Sample static method");
	}

	void m5() {
		System.out.println("Sample Non-static method");
	}

	@Override
	void m1() {
		System.out.println("m1 in Sample");

	}

	public static void main(String[] args) {

		System.out.println("\nSample main");

		System.out.println("a: " + a);
		System.out.println("b: " + b);

		m2();
		m4();

		System.out.println();

		Sample s = new Sample();
		s.m1();
		s.m3();
		s.m5();
	}

}
