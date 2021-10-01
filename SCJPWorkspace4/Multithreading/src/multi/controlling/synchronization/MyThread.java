package multi.controlling.synchronization;

public class MyThread extends Thread {

	PrintNumbers pn;

	public MyThread(PrintNumbers pn) {

		this.pn = pn;
	}

	@Override
	public void run() {
		pn.display();
	}
}
