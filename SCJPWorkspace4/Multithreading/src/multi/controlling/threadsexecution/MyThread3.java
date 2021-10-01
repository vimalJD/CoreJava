package multi.controlling.threadsexecution;

public class MyThread3 extends Thread {

	@Override
	public void run() {

		System.out.println("run start");

		try {
			System.out.println("before phase-1");
			Thread.sleep(5000);

		} catch (InterruptedException ie) {

			System.out.println("IE raised");
		}
		System.out.println("after phase-1");

		try {
			System.out.println("before phase-2");
			Thread.sleep(10000);

		} catch (InterruptedException ie) {

			System.out.println("IE raised");
		}
		System.out.println("after phase-2");

		System.out.println("run end");
	}
}
