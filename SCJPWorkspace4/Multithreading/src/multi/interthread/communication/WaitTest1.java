package multi.interthread.communication;

public class WaitTest1 {

	synchronized void m1() {
		try {
			System.out.println("Hi");
			wait(6000);
			System.out.println("Hello");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		WaitTest1 wt1 = new WaitTest1();
		wt1.m1();
	}
}
