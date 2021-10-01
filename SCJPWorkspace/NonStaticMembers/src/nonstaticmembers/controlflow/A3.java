package nonstaticmembers.controlflow;

public class A3 {

	A3 a3 = new A3();

	public A3() {

		System.out.println("in no-arg");
	}

	public static void main(String[] args) {
		System.out.println("main");
		A3 a3 = new A3();
	}
}
