package multi.interthread.communication;

public class Producer implements Runnable {

	Factory fa;

	public Producer(Factory fa) {
		// TODO Auto-generated constructor stub
		this.fa = fa;
		new Thread(this, "Producer").start();
	}

	@Override
	public void run() {

		int i = 1;

		while (i <= 10) {

			fa.produce(i++);
		}

	}

}
