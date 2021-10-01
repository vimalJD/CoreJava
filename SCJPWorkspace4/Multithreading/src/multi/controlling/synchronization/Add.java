package multi.controlling.synchronization;

public class Add {

	int x;
	int y;

	// void add(int x, int y) {

	synchronized void add(int x, int y) {

		this.x = x;
		this.y = y;

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}

		int res = this.x + this.y;

		System.out.println("In " + Thread.currentThread().getName() + " Result: " + res);
	}

}
