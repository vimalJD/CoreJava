package multi.interthread.communication;

public class Consumer implements Runnable {

	Factory fa;

	public Consumer(Factory fa) {

		// TODO Auto-generated constructor stub
		this.fa = fa;
		new Thread(this, "Consumer").start();
	}

	@Override
	public void run() {

		int i = 1;

		while (i <= 10) {

			fa.consumer();
			i++;
		}

	}

}
