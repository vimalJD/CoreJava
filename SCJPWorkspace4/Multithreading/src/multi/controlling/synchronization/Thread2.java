package multi.controlling.synchronization;

public class Thread2 extends Thread{

	Add a;

	public Thread2(Add a) {

		this.a = a;
	}

	@Override
	public void run() {

		a.add(70, 80);

	}
}
