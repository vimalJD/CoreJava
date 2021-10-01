package nonstaticmembers.controlflow;

public class Example2 {

	static int a = 10;

	static {
		System.out.println("in SB");
		System.out.println("a: " + a);
		System.out.println("b: " + Example2.b);
	}

	public static void main(String[] args) {

		System.out.println("in main");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

	static int b = 20;
}
