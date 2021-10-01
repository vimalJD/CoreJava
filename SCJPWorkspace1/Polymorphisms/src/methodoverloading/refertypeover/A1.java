package methodoverloading.refertypeover;


public class A1 {

	void m1(Example e) {
		System.out.println("Example-arg");
	}

	void m1(Sample s) {
		System.out.println("Sample-arg");
	}

	public static void main(String[] args) {

		A1 a = new A1();
		a.m1(new Example());
		a.m1(new Sample());
//		a.m1("abc");
//		a.m1(null);

		System.out.println();
		Example e1 = new Example();
		Example e2 = new Sample();
		Sample s1 = new Sample();
		Example e3 = null;
		Sample s2 = null;

		System.out.println();
		a.m1(e1);
		a.m1(e2);
		a.m1(s1);
		a.m1(e3);
		a.m1(s2);

	}
}
