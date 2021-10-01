package fun.finalize;

public class FinalizeTest {

	public static void main(String[] args) throws Exception {

		// creating unreferenced objects
		for (int i = 1; i <= 10; i++) {
			new Building(new Furniture());
		}

		// requesting JVM to run GC
		System.gc();

		// Pausing main thread allow gc to run
		Thread.sleep(1000);
	}
}
