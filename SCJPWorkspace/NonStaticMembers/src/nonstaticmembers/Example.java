package nonstaticmembers;

public class Example {

	void m1() {
		System.out.println("IN m1");
	}

	public static void main(String[] args) {

		System.out.println("in main method");
		Example example = new Example();
		example.m1();

	}
}
