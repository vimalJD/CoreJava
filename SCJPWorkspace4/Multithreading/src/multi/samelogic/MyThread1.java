package multi.samelogic;

public class MyThread1 extends Thread {

	int x;

	public MyThread1(int x) {
		this.x = x;
	}

	@Override
	public void run() {
		for (int i = 0; i < this.x; i++) {

			System.out.println(getName() + " Run: " + i);
		}
	}
}
