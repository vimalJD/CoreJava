package multi.controlling.synchronization;

public class Thread3 extends Thread {

	@Override
	public void run() {

		Add1.add(50, 60);

	}
}
