package multi.threadgroup;

public class ThreadGroupImp implements Runnable {

	String name;// name of thread
//	public Object t;

	public ThreadGroupImp(ThreadGroup thg, String threadName) {
		name = threadName;
		new Thread(thg, this).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {

			for (int i = 1; i <= 10; i++) {
				System.out.println(name + " : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException ie) {
			// TODO: handle exception
			System.out.println(name + " interrupted...");
		}
		System.out.println(name + " exiting...");
	}

}
