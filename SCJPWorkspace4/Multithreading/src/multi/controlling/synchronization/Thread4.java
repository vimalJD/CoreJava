package multi.controlling.synchronization;

public class Thread4 extends Thread {

	@Override
	public void run() {

		Add1.add(70, 80);

	}
}
