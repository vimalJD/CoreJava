package multi.daemonthread;

public class DaemonThread implements Runnable {

	Thread th;

	DaemonThread() {

		th = new Thread(this);
		
		th.setDaemon(true);
		
		//it is same as non-daemon thread if pass as false
		//th.setDaemon(false);
		th.start();

//		th.setDaemon(true);
	}

	@Override
	public void run() {
		System.out.println("Run: "+th.isDaemon());
		
		for (int i = 1; i <= 100; i++) {
			System.out.println("Run: "+i);
		}
	}
}
