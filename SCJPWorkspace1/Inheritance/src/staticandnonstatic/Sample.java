package staticandnonstatic;

public class Sample extends Example {

	static int b = m3();

	static {
		System.out.println("Sample static block");
	}

	int y = m4();

	{
		System.out.println("Sample non static block");
	}

	public Sample() {
		System.out.println("Sampel constructor");
	}

	static int m3() {
		System.out.println("Sample static variable is created");
		return 30;
	}

	int m4() {
		System.out.println("Sample non static variable is created");
		return 40;
	}

	void abc() {
		System.out.println("Sample abc method is created");
	}

	public static void main(String[] args) {

		System.out.println("Sample main");

		Sample sample = new Sample();

		sample.abc();
		sample.bbc();

	}
}
