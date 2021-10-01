package multi.samelogic;

public class MyThread2 extends Thread {

	private int x;

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public void run() {
		for (int i = 0; i < this.x; i++) {

			System.out.println(getName() + " Run: " + i);
		}
	}
}
