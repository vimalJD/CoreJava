package super1.constructor;

public class Sample extends Example {

	Sample() {

		System.out.println("Sample no-argument");
	}

	Sample(int a) {
		super(50);
		System.out.println("Sample int-param");
	}

	public static void main(String[] args) {

		Sample s1 = new Sample();
		Sample s2 = new Sample(10);
	}
}
