package visible.constructor;

public class Example {

	/*
	 * private Example() { System.out.println("Example no-arg"); }
	 */

	Example() {
		System.out.println("Example no-arg");
	}

	Example(int a) {

		System.out.println("Example int-param");
	}
}
