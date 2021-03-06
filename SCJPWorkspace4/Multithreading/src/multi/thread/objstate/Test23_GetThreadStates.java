package multi.thread.objstate;

public class Test23_GetThreadStates {

	public static void main(String[] args) throws InterruptedException {

		MyThread mt = new MyThread();
		System.out.println("From main method mt state after object creation: " + mt.getState());

		mt.start();
		System.out.println("From main method mt state after start call: " + mt.getState());

		// must throws interrupted exception
		Thread.sleep(500);
		System.out.println("From main method mt state after mt.sleep() call: " + mt.getState());

		Thread.sleep(6000);
		System.out.println("From main method mt state after run completed: " + mt.getState());

	}
}
