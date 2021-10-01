package nonstaticmembers.controlflow;

public class Example5 {

	int a = 10;

	{
		System.out.println("in SB");
		System.out.println("a: " + a);
		System.out.println("b: " + getB());
	}

	public static void main(String[] args) {

		System.out.println("in main");

		Example5 example5 = new Example5();
		System.out.println("a: " + example5.a);
		System.out.println("b: " + example5.b);
	}

	int getB() {
		return b;
	}

	int b = 20;
}
