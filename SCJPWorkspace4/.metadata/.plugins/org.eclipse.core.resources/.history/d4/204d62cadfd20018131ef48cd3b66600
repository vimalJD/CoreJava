package multi.custom.thread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run executed");
	}

	public static void main(String[] args) {

		MyRunnable mr = new MyRunnable();
//		mr.start();

		Thread th = new Thread(mr);
		th.start();

		System.out.println("main executed");
	}
}
