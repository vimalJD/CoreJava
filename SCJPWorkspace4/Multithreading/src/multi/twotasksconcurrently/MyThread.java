package multi.twotasksconcurrently;

public class MyThread extends Thread {

	@Override
	public void run() {

		for (int i = 20; i >= 1; i--) {

			System.out.println("run: " + i);
		}
	}
}
