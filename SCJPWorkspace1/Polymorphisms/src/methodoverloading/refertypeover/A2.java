package methodoverloading.refertypeover;

public class A2 {

	void m1(Example e) {
		System.out.println("Example-arg");
	}

	void m1(Test t) {
		System.out.println("Test-arg");
	}

	public static void main(String[] args) {

		A2 a = new A2();
		a.m1(new Example());
		a.m1(new Sample());
//		a.m1("abc");
		a.m1(new Test());

		System.out.println();
//		a.m1(null);
		a.m1((Sample) null);
		a.m1((Test) null);
	}
}
