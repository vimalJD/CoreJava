package multi.controlling.synchronization;

public class Thread1 extends Thread {

	Add a;

	public Thread1(Add a) {

		this.a = a;
	}

	@Override
	public void run() {

		a.add(50, 60);

	}
}
