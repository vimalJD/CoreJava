package multi.thread.objstate;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println("run start");
		
		System.out.println("From run method mt state after start call: "+this.getState());
		
		try {
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			System.out.println("run end");
		}
	}
}
