package multi.over.loadingnoverriding;

public class Test04_RunOVROVL {

	public static void main(String[] args) {

		MyThread3 mt = new MyThread3();
		mt.start();

		// this class contained run() parameter only
		MyThread4 mt2 = new MyThread4();
		mt2.start();

		// CE it may be because of MyRunnable5 abstract
//		MyRunnable5 mr = new Runnable() ();

//		Thread th = new Thread(mr);

		MyRunnable6 mr = new MyRunnable6();

		Thread th = new Thread(mr);
		th.start();

		MyRunnable7 mr1 = new MyRunnable7();

		Thread th1 = new Thread(mr1);
		th1.start();
	}
}
