package multi.samelogic;

public class MyThread3 extends Thread {

	private int x;
	private boolean xInitialized = false;

	public void setX(int x) {
		this.x = x;
		xInitialized = true;
	}

	@Override
	public void run() {

		if (!xInitialized) {
			throw new IllegalStateException("Error: x is not initialized for " + "the Thread[" + getName() + "]");
		}
		for (int i = 0; i < this.x; i++) {

			System.out.println(getName() + " Run: " + i);
		}
	}
}
