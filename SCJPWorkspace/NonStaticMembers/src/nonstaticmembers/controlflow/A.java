package nonstaticmembers.controlflow;

public class A {

	public static void main(String[] args) {

		System.out.println("in main");
		A a = new A();

		System.out.println("Object is created: ");

	}

	int x = m2();

	int m2() {

		System.out.println("NSV x");

		return 0;
	}

	{
		System.out.println("NSB start");

	}

	public A() {
		System.out.println("in no-arg constructor");
		A a = new A();
		System.out.println("end of constructor");
	}
}
