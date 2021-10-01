package overloaded.constructor;

public class Example2 {

	int x = m1();

	{
		System.out.println("Non static block");
	}

	int m1() {
		System.out.println("m1: " + x);
		return 10;
	}

	public Example2() {
		this(10);
		x = 50;
		System.out.println("No-arg constructor");
	}

	public Example2(int i) {
		this("Vimal");
		x = 60;
		System.out.println("int-arg constructor");
	}

	Example2(String string) {
		x = 70;
		System.out.println("String-arg constroctor");
	}

	public static void main(String[] args) {

		Example2 example2 = new Example2();
		System.out.println("example2.x: " + example2.x);

		Example2 example22 = new Example2(10);
		System.out.println("example22.x: " + example22.x);

		Example2 example23 = new Example2("vimal001");
		System.out.println("example23.x: " + example23.x);
	}
}
