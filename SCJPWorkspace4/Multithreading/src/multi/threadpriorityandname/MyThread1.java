package multi.threadpriorityandname;

public class MyThread1 extends Thread {

	public MyThread1() {
		super();
	}

	public MyThread1(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println(getName() + " i: " + i);
		}
	}
}
