package multi.controlling.threadsexecution;

public class Test35_join {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main start");

		MyThread4 mt4 = new MyThread4();
		mt4.start();

		// mt4.join();
		//mt4.join(5000);
		//mt4.join(15000);
		mt4.sleep(15000);

		System.out.println("main end");
	}
}
