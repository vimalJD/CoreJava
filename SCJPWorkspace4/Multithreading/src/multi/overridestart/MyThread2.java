package multi.overridestart;

public class MyThread2 extends Thread {

	@Override
	public void run() {
		System.out.println("run");
	}

	@Override
	public void start() {

		System.out.println("start");

		// .............here we can place
		// .............validations and
		// .............calculations logic

		super.start();
	}

	public static void main(String[] args) {

		MyThread2 mt = new MyThread2();
		mt.start();
		System.out.println("main");
	}
}
