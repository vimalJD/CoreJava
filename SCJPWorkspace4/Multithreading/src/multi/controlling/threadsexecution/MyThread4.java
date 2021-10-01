package multi.controlling.threadsexecution;

public class MyThread4 extends Thread{

	@Override
	public void run() {
		System.out.println("run start");
	
		try {
			Thread.sleep(10000);
		} catch (InterruptedException ie) {
			// TODO: handle exception
		}
		
		System.out.println("run end");
	}
	
}
