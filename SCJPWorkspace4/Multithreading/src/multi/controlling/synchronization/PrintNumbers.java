package multi.controlling.synchronization;

public class PrintNumbers {

	synchronized void display() {

		for (int i = 1; i <= 20; i++) {

			System.out.println(Thread.currentThread().getName() + " run: " + i);
		}
	}
}
