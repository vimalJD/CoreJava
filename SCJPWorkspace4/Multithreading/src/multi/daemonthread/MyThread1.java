package multi.daemonthread;

public class MyThread1 extends Thread{

	@Override
	public void run() {
		System.out.println("MyThread1 priority: "+this.getPriority());
		System.out.println("MyThread1 daemon: "+this.isDaemon());
	}
}
