package multi.controlling.threadsexecution;

public class Test34_IE_interrupt {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("main start");
		
		MyThread3 mt3 = new MyThread3();
//		mt3.interrupt();
		
		mt3.start();
		
//		mt3.interrupt();
//		mt3.interrupt();
		
		Thread.sleep(2000);
		
		mt3.interrupt();
		
		System.out.println("main end");
	}
}
