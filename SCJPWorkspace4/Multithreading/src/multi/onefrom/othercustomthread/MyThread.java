package multi.onefrom.othercustomthread;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("MyThread1 run: " + i);
		}
	}
}
