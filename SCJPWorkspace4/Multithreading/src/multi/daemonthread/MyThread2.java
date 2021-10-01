package multi.daemonthread;

public class MyThread2 extends Thread {

	@Override
	public void run() {
		
		System.out.println("MyThread1 priority: " + this.getPriority());
		System.out.println("MyThread1 daemon: " + this.isDaemon());

		MyThread1 mt1 = new MyThread1();
//		for knowledge
//		mt1.setDaemon(true);
//		
//		System.out.println("Run: "+mt1.isDaemon());
		mt1.start();
	}
}
