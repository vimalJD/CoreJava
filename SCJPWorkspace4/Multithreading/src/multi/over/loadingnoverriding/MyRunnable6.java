package multi.over.loadingnoverriding;

public class MyRunnable6 implements Runnable {

	@Override
	public void run() {

		System.out.println("run no-arg of MyRunnable6");
	}

	public void run(String s) {

		System.out.println("run string-param of MyRunnable6");
	}

}
