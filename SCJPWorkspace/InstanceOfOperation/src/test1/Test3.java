package test1;

public class Test3 {
	static void m3(Example e) {
		e.m1();
		System.out.println("static m3");

		if (e instanceof Sample) {
			Sample s = (Sample) e;
			s.m2();
			System.out.println("instanceof Sample");
		}
	}

	public static void main(String[] args) {
		Test3.m3(new Sample());

		Test3.m3(new Example());
	}
}
