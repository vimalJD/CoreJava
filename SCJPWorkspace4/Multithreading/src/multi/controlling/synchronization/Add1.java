package multi.controlling.synchronization;

public class Add1 {

	static int x;
	static int y;

	static void add(int x1, int y1) {

//	static synchronized void add(int x1, int y1) {

		x1 = x;
		y1 = y;

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}

		int res = x1 + y1;

		System.out.println("In " + Thread.currentThread().getName() + " Result: " + res);
	}

}
