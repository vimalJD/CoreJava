package multi.runmethod;

public class Test03_RunExecution {

	public static void main(String[] args) {

		// case #1:===========

		Thread th1 = new Thread();
		th1.start();

		// case #2:===========

		MyThread mt = new MyThread();
		mt.start();

		// case #3:===========
		MyRunnable mr = new MyRunnable();
		//		mr.start();

		// case #4:===========

		Thread th2 = new Thread(mr);
		th2.start();

		// case #5:===========

		MyThread mt1 = new MyThread();

		Thread th3 = new Thread(mt1);
		th3.start();

		// case #6:===========

		Thread th4 = new MyThread();
		th4.start();

		// case #7:===========
//		Thread th5 = new MyRunnable();
//		th5.start();

		// case #8:===========

		Runnable r = new MyRunnable();
//		r.start();

		// case #9:===========

		Thread th6 = new Thread(r);
		th6.start();

		// case #10:===========

		Runnable r1 = new MyThread();
//		r1.start();

		// case #11:===========

		Thread th7 = new Thread(r1);
		th7.start();

		// case #12:===========.

		MyRunnable mr2 = new MyRunnable();

		MyThread mt2 = new MyThread(mr2);
		mt2.start();
	}
}
