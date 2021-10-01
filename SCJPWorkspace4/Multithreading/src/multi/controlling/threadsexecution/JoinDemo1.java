package multi.controlling.threadsexecution;

public class JoinDemo1 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i <= 20; i++) {
			System.out.println(getName() + " : " + i);

			if (i == 5 && getName().equals("child2")) {

				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();

				}
			}
		}
	}
}
