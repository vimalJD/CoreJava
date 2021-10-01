package multi.inlinethread;

public class Test44_inlineThread {

	public static void main(String[] args) {

		// inline thread creation using thread class

		new Thread() {

			@Override
			public void run() {

				for (int i = 1; i <= 10; i++) {
					System.out.println("run: " + i);
				}
			}
		}.start();
		
		

		// inline thread creation using Runnable interface

		new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("run: " + i);
				}
			}
		}).start();
	}
}
