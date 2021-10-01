package multi.daemonthread;

public class Test30_DaemonThread {

	public static void main(String[] args) {

		DaemonThread dth = new DaemonThread();

		System.out.println("Countdown starts");

		for (int i = 1; i <= 5; i++) {
			System.out.println("main: " + i);
		}
	}
}
