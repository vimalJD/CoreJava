package multi.onefrom.othercustomthread;

public class Test22_creatingCTfromOCT {

	public static void main(String[] args) {

		System.out.println("main started");

		MyThread2 mt2 = new MyThread2();
		mt2.start();

		System.out.println("main exited");
	}
}
