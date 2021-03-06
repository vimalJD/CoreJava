package multi.threadpriorityandname;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(getName() + " Run executed");
	}
};

class Test20_priorityTest {

	public static void main(String[] args) {

		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();

		mt1.setPriority(7);
		mt2.setPriority(9);

		mt1.start();
		mt2.start();

		System.out.println("Main executed");
	}
}
