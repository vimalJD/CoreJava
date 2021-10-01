package multi.samelogic;

public class MultipleThreadWithSameLogic3 {

	public static void main(String[] args) {

		MyThread3 mt1 = new MyThread3();
		mt1.setX(10);
		mt1.start();

		MyThread3 mt2 = new MyThread3();
		mt2.setX(20);
		mt2.start();

		MyThread3 mt3 = new MyThread3();
		mt3.start();
	}
}
