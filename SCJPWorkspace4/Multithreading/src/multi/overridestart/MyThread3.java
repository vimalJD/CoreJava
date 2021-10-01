package multi.overridestart;

public class MyThread3 extends Thread {

	@Override
	public void run() {
		System.out.println(getName() + " run ");
	}

	@Override
	public void start() {

		System.out.println("start");
		//case #1
		run();
		
		
		// .............here we can place
		// .............validations and
		// .............calculations logic

		//case #2
		super.start();
	}

	public static void main(String[] args) {

		MyThread3 mt = new MyThread3();
		mt.start();
		System.out.println("main");
	}
}
