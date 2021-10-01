package multi.controlling.synchronization;

public class Test37_synch1 {

	public static void main(String[] args) {

		Add a = new Add();

		new Thread1(a).start();
		new Thread2(a).start();

	}
}
