package multi.over.loadingnoverriding;

public class MyThread3 extends Thread {

	@Override
	public void run() {

		System.out.println("run no-arg of MyThread3");
	}

	public void run(String s) {

		System.out.println("run string-param of MyThread3");
	}

}
