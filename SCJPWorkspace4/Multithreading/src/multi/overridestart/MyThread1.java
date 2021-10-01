package multi.overridestart;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		System.out.println("run");
	}

	@Override
	public void start() {
		System.out.println("start");
	}

	public static void main(String[] args) {

		MyThread mt = new MyThread();
		mt.start();

		System.out.println("main");
	}
	
}
