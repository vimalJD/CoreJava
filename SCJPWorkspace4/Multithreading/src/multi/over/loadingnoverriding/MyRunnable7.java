package multi.over.loadingnoverriding;

public class MyRunnable7 extends Thread implements Runnable {

	public void run(String s) {

		System.out.println("run string-param of MyRunnable7");
	}
}
