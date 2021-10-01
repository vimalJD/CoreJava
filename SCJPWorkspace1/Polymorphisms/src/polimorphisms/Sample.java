package polimorphisms;

public class Sample extends ExamplePoli {

	static void m1() {
		System.out.println("Sample m1");
	}

	void m2() {
		System.out.println("Sample m2");
	}

	void m4(String s) {
		System.out.println("Sample m3(int-param)");
	}

	public static void main(String[] args) {

		Sample sample = new Sample();
		sample.m1();
		sample.m2();
		sample.m3();
		sample.m4();
		sample.m4("vap");

		ExamplePoli examplePoli = new Sample();
		examplePoli.m1();
		examplePoli.m2();
		examplePoli.m3();
		examplePoli.m4();

		// examplePoli.m4("vap1");

	}
}
