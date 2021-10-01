package multi.controlling.synchronization;

public class PrintMessage {

//	void printMsg(String msg) {

		synchronized void printMsg(String msg) {

		System.out.print("[" + msg);

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("]");
	}
}
