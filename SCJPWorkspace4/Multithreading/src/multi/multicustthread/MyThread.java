package multi.multicustthread;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {

			System.out.println(getName() + " Run: " + i);
		}
	}

	public static void main(String[] args) {

		MyThread mt1 = new MyThread();
		mt1.start();

		MyThread mt2 = new MyThread();
		mt2.start();

		MyThread mt3 = new MyThread();
		mt3.start();

	}
}
