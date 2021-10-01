package multi.over.loadingnoverriding;

public class MyRunnable4 implements Runnable{

	public void run(String s) {
		System.out.println("run String-param");
	}

	//we must override run method from super
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
