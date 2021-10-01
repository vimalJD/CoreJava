package multi.thread.objstate;

class MyThread1 extends Thread {

	@Override
	public void run() {
		System.out.println("run start");

		System.out.println("From run method mt state after start call: " + this.isAlive());

		try {
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			System.out.println("run end");
		}
	}
};

class Test24_isAliveDemo {

	public static void main(String[] args) throws InterruptedException {

		MyThread mt = new MyThread();
		System.out.println("From main method mt state after object creation: " + mt.isAlive());

		mt.start();
		System.out.println("From main method mt state after start call: " + mt.isAlive());

		// must throws interrupted exception
		Thread.sleep(500);
		System.out.println("From main method mt state after mt.sleep() call: " + mt.isAlive());

		Thread.sleep(6000);
		System.out.println("From main method mt state after run completed: " + mt.isAlive());

	}
}
