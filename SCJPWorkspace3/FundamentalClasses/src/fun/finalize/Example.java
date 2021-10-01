package fun.finalize;

public class Example {

	int x;
	static Example example;

	public Example(int x) {
		this.x = x;
	}

	@Override
	public void finalize() {
		System.out.println("In finalize");
		example = this;// converting unreferenced as referenced object now GC can not destroy this

	}

	public static void main(String[] args) throws Exception {

		Example example1 = new Example(10);
		System.out.println(example1);
		System.out.println(example);

		// unreferenced object
		example1 = null;

		// request JVM to run GC
		System.gc();

		// Pausing main thread to allow GC to execute
		Thread.sleep(100);

		System.out.println(example1);
		System.out.println(example);

	}
}
