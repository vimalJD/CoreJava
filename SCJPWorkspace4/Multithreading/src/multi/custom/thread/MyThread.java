package multi.custom.thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("run executed");
	}

	public static void main(String[] args) {

		MyThread mt = new MyThread();
		mt.start();

		System.out.println("main executed");
	}
}
