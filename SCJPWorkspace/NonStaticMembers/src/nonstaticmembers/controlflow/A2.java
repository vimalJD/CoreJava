package nonstaticmembers.controlflow;

public class A2 {

	{
		System.out.println("NSB");
		A2 a2 = new A2();
	}

	public A2() {

		System.out.println("in no-arg cons");
	}

	public static void main(String[] args) {

		System.out.println("in main");
		A2 a2 = new A2();
	}
}
