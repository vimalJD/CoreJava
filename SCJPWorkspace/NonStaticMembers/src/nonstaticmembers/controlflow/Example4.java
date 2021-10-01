package nonstaticmembers.controlflow;

public class Example4 {

	static int a = 10;

	static {
		System.out.println("in SB");
		System.out.println("a: " + a);
		System.out.println("b: " + getB());
	}

	public static void main(String[] args) {

		System.out.println("in main");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

	static int getB() {
		return b;
	}
	static int b = 20;
}
