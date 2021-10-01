package nonstaticmembers.controlflow;

public class A1 {

	static {

		System.out.println("SB");
		A1 a1 = new A1();
	}

	public A1() {

		System.out.println("in no-arg cons");
	}

	public static void main(String[] args) {

		System.out.println("main");

		A1 a1 = new A1();
	}
}
