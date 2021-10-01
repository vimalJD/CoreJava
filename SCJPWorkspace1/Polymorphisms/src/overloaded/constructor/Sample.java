package overloaded.constructor;

public class Sample extends Example {

	public Sample() {
		System.out.println("Sa No-arg constroctor");
	}

	Sample(String str) {
		super(10);
		System.out.println("Sa string-arg constroctor");
	}

	public static void main(String[] args) {

		Sample sample = new Sample();
		Sample sample2 = new Sample("vimal");
	}
}
