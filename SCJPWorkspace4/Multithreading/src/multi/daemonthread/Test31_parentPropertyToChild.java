package multi.daemonthread;

public class Test31_parentPropertyToChild {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main executed");

		Thread th = Thread.currentThread();

		System.out.println("main priority: " + th.getPriority());
		System.out.println("main daemon: " + th.isDaemon());

		MyThread2 mt2 = new MyThread2();
		mt2.start();

		System.out.println("MyThread2 priority: " + mt2.getPriority());
		System.out.println("MyThread2 daemon: " + mt2.isDaemon());

		mt2.setPriority(7);
		
		mt2.setDaemon(true);

		mt2.start();

		Thread.sleep(10000);
		System.out.println("main exited");

	}
}
