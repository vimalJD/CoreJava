package multi.onefrom.othercustomthread;

public class MyThread2 extends Thread {

	@Override
	public void run() {
		MyThread mt = new MyThread();
		mt.start();

		for (int i = 1; i <= 20; i++) {
			System.out.println("MyThread2 run: " + i);
		}
	}
}
