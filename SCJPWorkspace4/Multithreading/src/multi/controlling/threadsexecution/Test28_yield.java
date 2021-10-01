package multi.controlling.threadsexecution;

public class Test28_yield {

	public static void main(String[] args) {

		System.out.println("main start");

		MyThread mt = new MyThread();
		mt.start();

		Thread.yield();
		System.out.println("main end");
	}
}
