package multi.samelogic;

public class MultipleThreadWithSameLogic2 {

	public static void main(String[] args) {

		MyThread2 mt1 = new MyThread2();
		mt1.setX(10);
		mt1.start();

		MyThread2 mt2 = new MyThread2();
		mt2.start();

		for (int i = 0; i < 20; i++) {
			System.out.println("main: " + i);
		}
	}
}
