package multi.runmethod;

public class MyThread extends Thread {

	public MyThread() {

		super();
	}

	public MyThread(Runnable target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("From MyThread.run()");
	}
}
