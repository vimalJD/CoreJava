package multi.samelogic;

public class MultipleThreadWithSameLogic1 {

	public static void main(String[] args) {

		MyThread1 mt1 = new MyThread1(10);
		mt1.start();

		MyThread1 mt2 = new MyThread1(20);
		mt2.start();

		MyThread1 mt3 = new MyThread1(30);
		mt3.start();

		for (int i = 0; i < 20; i++) {

			System.out.println("main: " + i);
		}
	}
}
