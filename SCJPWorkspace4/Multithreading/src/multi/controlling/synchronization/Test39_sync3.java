package multi.controlling.synchronization;

public class Test39_sync3 {

	public static void main(String[] args) {

		/*
		 * // case #1: Sharing same object
		 * 
		 * PrintNumbers pn = new PrintNumbers();
		 * 
		 * MyThread mt1 = new MyThread(pn); MyThread mt2 = new MyThread(pn);
		 * 
		 * mt1.start(); mt2.start();
		 */
		// case #2: Sharing different object

		PrintNumbers pn1 = new PrintNumbers();
		PrintNumbers pn2 = new PrintNumbers();

		MyThread mt3 = new MyThread(pn1);
		MyThread mt4 = new MyThread(pn2);

		mt3.start();
		mt4.start();
	}
}
