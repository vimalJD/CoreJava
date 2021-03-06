package mulit.displaytime;

public class MultiThreadModelApplication extends Thread {

	static PrintNumbers pn = new PrintNumbers();

	@Override
	public void run() {
		pn.print50To1();
	}

	public static void main(String[] args) {

		MultiThreadModelApplication mtma = new MultiThreadModelApplication();

		long time1 = System.currentTimeMillis();
		mtma.start();
		System.out.println();
		System.out.println("Time1: " + time1);
		pn.print1To50();

		long time2 = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time2: " + time2);

		System.out.println("Time is taken to complete both task: " + ((time2 - time1) / 1000) + " secs");

	}
}
