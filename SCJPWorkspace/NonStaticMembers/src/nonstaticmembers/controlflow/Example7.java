package nonstaticmembers.controlflow;

public class Example7 {

	Example7 example7 = new Example7();
	static {
		System.out.println("in SB");
	}

	int x = m1();

	int m1() {
		System.out.println("NSV x");
		return 0;
	}

	{
		System.out.println("in NSB");
	}

	public Example7() {

		System.out.println("in no-arg cons");
	}

	public static void main(String[] args) {

		System.out.println("in main");

		Example7 example7 = new Example7();
		System.out.println("end of main");
	}
}
