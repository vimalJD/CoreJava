package overloaded.constructor;

public class Example1 {

	public Example1() {
		this(10);
		System.out.println("Exa No-arg constructor");
	}

	Example1(int a) {
		this("vimal2");
		System.out.println("Exa int-arg constructor");
	}

	Example1(String str) {
		System.out.println("Exa String-arg constructor");
	}

	public static void main(String[] args) {

		Example1 example1 = new Example1();

		Example1 example12 = new Example1(10);

		Example1 example13 = new Example1("vimal1");
	}
}
