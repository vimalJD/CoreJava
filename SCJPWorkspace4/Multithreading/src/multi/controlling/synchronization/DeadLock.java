package multi.controlling.synchronization;

public class DeadLock implements Runnable {

	FirstClass fc = new FirstClass();
	SecondClass sc = new SecondClass();

	public DeadLock() {

		Thread th = new Thread(this, "Racing Thread");
		th.start();

		// main thread locked fc object
		fc.firstClassMethod(sc);
		System.out.println("back in main thread");
	}

	@Override
	public void run() {

		// Racing thread locked sc object
		sc.secondClassMethod(fc);
		System.out.println("back in other thread");
	}

}
