package multi.controlling.threadsexecution;

public class Test29_yield {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main start");

		MyThread1 mt1 = new MyThread1();
		mt1.start();

		Thread.sleep(5000);
		System.out.println("main end");
	}

}
